package net.miso.parser.cpc.convert;

import lombok.extern.slf4j.Slf4j;
import net.miso.parser.cpc.dto.CpcMedia;
import net.miso.parser.cpc.dto.CpcNoteAndWarning;
import net.miso.parser.cpc.dto.CpcTitle;
import net.miso.parser.cpc.dto.CpcTree;
import net.miso.parser.cpc.mapper.CpcMapper;
import net.miso.parser.cpc.vo.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import javax.xml.datatype.XMLGregorianCalendar;
import java.io.File;
import java.io.FilenameFilter;
import java.io.Serializable;
import java.math.BigInteger;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

@Slf4j
@Service
public class CpcService {

    private static final Logger LOGGER = LoggerFactory.getLogger(CpcService.class);

    @Autowired
    private CpcMapper cpcMapper;

    private static int index = 0;
    private static final File[] EMPTY_FILES = new File[0];
    private final String dirPath = "D:/data/CPC/CPC/CPCSchemeXML202302";

    // Note and Warning에서 사용되는 기호모음
//    private final List<String> lowerAlphaList = new ArrayList<>(Arrays.asList("a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"));
//    private final List<String> upperAlphaList = new ArrayList<>(Arrays.asList("A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"));
//    private final List<String> lowerRomanListUntilTwenty = new ArrayList<>(Arrays.asList("i", "ii", "iii", "iv", "v", "vi", "vii", "viii", "ix", "x", "xi", "xii", "xiii", "xiv", "xv", "xvi", "xvii", "xviii", "xix", "xx"));
//    private final List<String> upperRomanListUntilTwenty = new ArrayList<>(Arrays.asList("I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X", "XI", "XII", "XIII", "XIV", "XV", "XVI", "XVII", "XVIII", "XIX", "XX"));
//    private final String bullet = "-";

    List<CpcTree> cpcTreeList = new ArrayList<>();
    List<CpcTitle> cpcTitleList = new ArrayList<>();
    List<CpcMedia> cpcMediaList = new ArrayList<>();
    List<CpcNoteAndWarning> cpcNwList = new ArrayList<>();

    List<List<CpcTree>> cpcTreeLists = new ArrayList<>();
    List<List<CpcTitle>> cpcTitleLists = new ArrayList<>();
    List<List<CpcNoteAndWarning>> cpcNwLists = new ArrayList<>();


    public void convertXmlToJava() throws Exception {

        long start = System.currentTimeMillis();

        File[] filteredXmlFiles = getFilteredXmlFiles();
        File[] xmlFilesSortedByNameAsc = sortByFileName(filteredXmlFiles);

        for (File file : xmlFilesSortedByNameAsc) {
//        File file = new File("D:/data/CPC/CPC/CPCSchemeXML202302/cpc-scheme-A61.xml");
            if (file.exists()) {
                JAXBContext context = JAXBContext.newInstance(ClassSchemeType.class);
                Unmarshaller unmarshaller = context.createUnmarshaller();

                JAXBElement<ClassSchemeType> postSchemeVO = (JAXBElement<ClassSchemeType>) unmarshaller.unmarshal(file);
                ClassSchemeType schemeVO = postSchemeVO.getValue();

                //////////////////////////////////////////////////////////////////////////
                List<ClassificationItemType> root = schemeVO.getClassificationItem();
                if (root.size() > 0) doRecursive(root, null);
                //////////////////////////////////////////////////////////////////////////
                LOGGER.info("index : {}", index);
            }
        }
        cpcTreeLists.add(cpcTreeList);
        cpcTitleLists.add(cpcTitleList);
        cpcNwLists.add(cpcNwList);
        cpcTreeList = new ArrayList<>();
        cpcTitleList = new ArrayList<>();
        cpcNwList = new ArrayList<>();

        long end = System.currentTimeMillis();

        LOGGER.info("############### CPC 파싱 종료 - 소요시간(초) : {}", (end - start)/1000);

        ///////////////////////// 반입 시작 ///////////////////
        long insertStart = System.currentTimeMillis();

        int cpcTreeResultCount = 0;
        if(!cpcTreeLists.isEmpty()) {
            for(List<CpcTree> treeList : cpcTreeLists) {
                if(!treeList.isEmpty()) {
                    cpcTreeResultCount += cpcMapper.insertCpcTrees(treeList);
                }
            }
            LOGGER.info("######### 1. CPC TREE INSERT RESULT COUNT : {}", cpcTreeResultCount);
        }
        int cpcTitleResultCount = 0;
        if(!cpcTitleLists.isEmpty()) {
            for (List<CpcTitle> titleList : cpcTitleLists) {
                if(!titleList.isEmpty()){
                    cpcTitleResultCount += cpcMapper.insertCpcTitles(titleList);
                }
            }
            LOGGER.info("######### 2. CPC TITLE INSERT RESULT COUNT : {}", cpcTitleResultCount);
        }
        if(!cpcMediaList.isEmpty()) {
            int cpcMediaResultCount = cpcMapper.insertCpcMedias(cpcMediaList);
            LOGGER.info("######### 3. CPC MEDIA INSERT RESULT COUNT : {}", cpcMediaResultCount);
        }
        if(!cpcNwLists.isEmpty()) {
            for(List<CpcNoteAndWarning> nwList : cpcNwLists) {
                if(!nwList.isEmpty()) {
                    int cpcNwResultCount = cpcMapper.insertCpcNoteAndWarnings(nwList);
                    LOGGER.info("######### 4. CPC NOTE AND WARNING INSERT RESULT COUNT : {}", cpcNwResultCount);
                }
            }
        }
        long insertEnd = System.currentTimeMillis();
        LOGGER.info("############### CPC 반입 종료 - 소요시간(초) : {}", (insertEnd - insertStart)/1000);
    }

    /**
     * XML파일에서 읽어들여온 XML Tree Element(Root)를 받아 모든 계층을 탐색하며 파싱하는 기능
     * 생성항목
     * CPC_TREE, CPC_TITLE, CPC_MEDIA, CPC_NOTEANDWARNING
     *
     * @param itemList XML Element <classification-item> 리스트
     * @param parent   파라미터로 전달받은 itemList의 부모 <classification-item> Element
     * @throws JAXBException
     */
    private void doRecursive(List<ClassificationItemType> itemList, ClassificationItemType parent) throws JAXBException {
        String parentSymbol = null;

        // 최상위 classification-item List를 반복문을 돌며 최하위 item까지 탐색
        for (ClassificationItemType item : itemList) {
            if (item.getLinkFile() == null) {   // 2~5레벨 xml(cpc-scheme-A.xml)과 5~이하(cpc-scheme-A01K.xml) 레벨 xml에서 5레벨 정보가 중복되기 때문에 2~5레벨 xml에서 5레벨 정보를 제외하는 구문

                // Set a CPC_TREE Object ***
                String symbol = item.getClassificationSymbol();
                symbol = convertSymbol(symbol); // A01K1/2234 -> A01K0001/2234 로 변환하는 메서드
                if (parent == null) {
                    if (item.getLevel() == 5) { // Level이 5인
                        parentSymbol = symbol.substring(0, 3);  // A01K -> A01
                    }
                } else {
                    parentSymbol = convertSymbol(parent.getClassificationSymbol());
                }
                index++;
                List<ClassificationItemType> currentChildList = item.getClassificationItem();    // 현재 classification-item의 자식 리스트

                // Get a CPC_TREE Object ***
                CpcTree cpcTree = getCpcTree(parentSymbol, item, symbol);
                if(cpcTreeList.size() == 10000) {
                    cpcTreeLists.add(cpcTreeList);
                    cpcTreeList = new ArrayList<>();
                } else if (cpcTreeList.size() <= 10000) {
                    cpcTreeList.add(cpcTree);
                }
//                LOGGER.info("cpcTree [level: {}, symbol: {}, parent_symbol : {}]", cpcTree.getLevel(), cpcTree.getSymbol(), cpcTree.getParentSymbol());

                // Get a CPC_TREE Object ***
                CpcTitle cpcTitle = getCpcTitle(symbol, item);
                if(cpcTitleList.size() == 10000) {
                    cpcTitleLists.add(cpcTitleList);
                    cpcTitleList = new ArrayList<>();
                } else if (cpcTitleList.size() <= 10000) {
                    cpcTitleList.add(cpcTitle);
                }
                getCpcNoteAndWarning(item);

                if (!currentChildList.isEmpty()) {
                    doRecursive(currentChildList, item);
                }
            }
        }
    }

    private void getCpcNoteAndWarning(ClassificationItemType item) {
        NotesAndWarningsType nw = item.getNotesAndWarnings();

        if (nw != null) {
            Optional<XMLGregorianCalendar> dateRevisedOpt = Optional.ofNullable(nw.getDateRevised());
            XMLGregorianCalendar dateRevised = dateRevisedOpt.orElse(null);
            String convertedDate = convertToString(dateRevised);

            List<NoteType> noteList = nw.getNote();
            if (noteList != null && !noteList.isEmpty()) {
                for (NoteType note : noteList) {
                    String noteType = note.getType().value();   // "note" or "warning", 반드시 존재함
                    int seq = 1;    // 하나의 <note type="note">태그 안에 존재하는 <note-paragraph>의 시퀀스
                    int depth = 0;

                    // 하나의 CpcNoteAndWarning 객체생성을 위한 파라미터 세팅
                    Map<String, Object> cpcNwMap = new HashMap<>();
                    cpcNwMap.put("symbol", convertSymbol(item.getClassificationSymbol()));
                    cpcNwMap.put("level", item.getLevel());
                    cpcNwMap.put("type", noteType);
                    cpcNwMap.put("seq", seq);
                    cpcNwMap.put("depth", depth);
                    cpcNwMap.put("subnoteType", "");
                    cpcNwMap.put("dateRevised", convertedDate);
                    cpcNwMap.put("isEntry", false);

                    List<NoteParagraphType> noteParagraphList = note.getNoteParagraph();
                    doRecursiveNw1(cpcNwMap, noteParagraphList);
                }
            }
        }
    }

    private void doRecursiveNw1(Map<String, Object> cpcNwMap, List<NoteParagraphType> noteParagraphList) {
        if (noteParagraphList != null && !noteParagraphList.isEmpty()) {
            int beforeIndex = 0;
            int depth = (int) cpcNwMap.get("depth");
            if(noteParagraphList.size() > 1 && depth == 0) cpcNwMap.put("subnoteType", "number");  // <note-paragraph> 요소가 2개 이상일때 문장을 number로 구분하기 때문

            for (NoteParagraphType noteParagraph : noteParagraphList) {
                beforeIndex++;
                StringBuilder sb = new StringBuilder();

                List<Serializable> contents = noteParagraph.getContent();
                cpcNwMap.put("contentsSize", contents.size());
                cpcNwMap.put("beforeSize", noteParagraphList.size());
                cpcNwMap.put("beforeIndex", beforeIndex);   // <note-paragraph> 리스트 중 현재 요소의 인덱스
                cpcNwMap.put("beforeType", "");     // u타입 이중 add 방지용

                doRecursiveNw2(sb, contents, cpcNwMap);
            }
            beforeIndex = 0;
            cpcNwMap.put("beforeIndex", beforeIndex);
        }
    }

    private void doRecursiveNw2(StringBuilder sb, List<Serializable> contents, Map<String, Object> cpcNwMap) {
        String beforeTp = (String) cpcNwMap.get("beforeType");
        int contentsSize = (int) cpcNwMap.get("contentsSize");
        if(!"table".equals(beforeTp)) {
            contentsSize = contentsSize == contents.size() ? contentsSize : contents.size();
        }
        int i = 0;  // 넘겨받은 contents의 길이와 현재 반복문의 인덱스를 비교하기 위한 변수
        int textIndex = 0;  // 하나의 <note-paragraph>요소에서 하나의 text문자열을 만날때마다 증가하는 값

        if (contents != null && !contents.isEmpty()) {
            for (Serializable content : contents) {

                String trimContent = content.toString().trim();
                if(!"".equals(trimContent)) i++;

                if (content instanceof JAXBElement) {
                    String typeName = ((JAXBElement<?>) content).getName().toString();
                    JAXBElement<?> cont = (JAXBElement<?>) content;
                    if ("reclassification-date".equals(typeName)) {
                        XMLGregorianCalendar xmlDate = (XMLGregorianCalendar) cont.getValue();
                        String convertedDate = getReclassDate(xmlDate);
                        sb.append(convertedDate);

                    } else if ("CPC-specific-note".equals(typeName)) {
                        List<Serializable> cpcNoteContents = ((NoteParagraphType) cont.getValue()).getContent();
                        cpcNwMap.put("contentsSize", cpcNoteContents.size());
                        doRecursiveNw2(sb, cpcNoteContents, cpcNwMap);

                    } else if (cont.getValue() instanceof ClassRefType) {
                        sb.append(((ClassRefType) cont.getValue()).getValue());

                    } else if ("pre".equals(typeName)) {
                        List<Serializable> preContents = ((NoteParagraphType) cont.getValue()).getContent();
                        // 앞뒤로 <pre>내용</pre>와 같이 태그를 감싸주는 조건문에서는 cpcNwMap.put("contentsSize", n)를 해주지 않는다.
                        // 컨텐츠 사이즈를 갱신해서 맵에 넣어줄 경우 태그 내 재귀함수2에서 sb를 add하고 빠져나와서 또 한번 add하기 때문
                        sb.append("<pre>");
                        doRecursiveNw2(sb, preContents, cpcNwMap);
                        sb.append("</pre>");

                        CpcNoteAndWarning nw = setCpcNw(sb, cpcNwMap);
                        if(cpcNwList.size() == 5000) {
                            cpcNwLists.add(cpcNwList);
                            cpcNwList = new ArrayList<>();
                        } else if (cpcNwList.size() <= 5000) {
                            cpcNwList.add(nw);
                        }

                        sb.setLength(0);
                        int seq = (int) cpcNwMap.get("seq");
                        cpcNwMap.put("seq", ++seq);
                    } else if (cont.getValue() instanceof TableType) {
                        String subnoteType = (String) cpcNwMap.get("subnoteType");
                        cpcNwMap.put("subnoteType", "");

                        // <table> Element를 만나면 CpcNoteAndWarning를 생성완료하고 리스트에 넣는다.(table이 가진 하위 entry 목록을 생성해야하기 때문)
                        CpcNoteAndWarning nw = setCpcNw(sb, cpcNwMap);
                        if(cpcNwList.size() == 5000) {
                            cpcNwLists.add(cpcNwList);
                            cpcNwList = new ArrayList<>();
                        } else if (cpcNwList.size() <= 5000) {
                            cpcNwList.add(nw);
                        }

                        sb.setLength(0);
                        int seq = (int) cpcNwMap.get("seq");
                        cpcNwMap.put("beforeType",  "table");
                        cpcNwMap.put("subnoteType", "table");
                        cpcNwMap.put("seq", ++seq);


                        List<RowType> rowList = ((TableType) cont.getValue()).getRow();
                        for (RowType row : rowList) {
                            List<EntryType> entryList = row.getEntry();
                            cpcNwMap.put("contentsSize", entryList.size());
                            int entryIdx = 0;

                            for (EntryType entry : entryList) {
                                entryIdx++;
                                BigInteger colspan = entry.getColspan();
                                BigInteger rowspan = entry.getRowspan();
                                List<Serializable> entryContents = entry.getContent();

                                cpcNwMap.put("isEntry", true);
                                doRecursiveNw2(sb, entryContents, cpcNwMap);
                                cpcNwMap.put("isEntry", false);

                                if(entryList.size() != entryIdx) sb.append("|");
                            }
//                            cpcNwMap.put("seq", ++seq);
                            CpcNoteAndWarning tableNw = setCpcNw(sb, cpcNwMap);
                            if(cpcNwList.size() == 5000) {
                                cpcNwLists.add(cpcNwList);
                                cpcNwList = new ArrayList<>();
                            } else if (cpcNwList.size() <= 5000) {
                                cpcNwList.add(tableNw);
                            }

                            sb.setLength(0);
                            cpcNwMap.put("seq", ++seq);
                        }
                        cpcNwMap.put("beforeType",  "");
                        cpcNwMap.put("subnoteType", subnoteType);

                    } else if ("br".equals(typeName)) {
                        sb.append("<br/>");

                    } else if (cont.getValue() instanceof UType) {
                        List<Serializable> uContents = ((UType) cont.getValue()).getContent();
                        cpcNwMap.put("beforeType", "u");

                        sb.append("<u>");
                        doRecursiveNw2(sb, uContents, cpcNwMap);
                        sb.append("</u>");

                        cpcNwMap.put("beforeType", "");
                    } else if (cont.getValue() instanceof MediaType) {
                        MediaType mediaType = (MediaType) cont.getValue();
                        sb.append("<img id=\"").append(mediaType.getId()).append("\" alt=\"image\" />");

                        CpcMedia cpcMedia = new CpcMedia();
                        cpcMedia.setSymbol((String) cpcNwMap.get("symbol"));
                        cpcMedia.setLevel((int) cpcNwMap.get("level"));
                        cpcMedia.setId(Integer.parseInt(mediaType.getId()));
                        cpcMedia.setFileName(mediaType.getFileName());
                        cpcMedia.setType(mediaType.getType().value());

                        cpcMediaList.add(cpcMedia);

                    } else if ("sub".equals(typeName)) {
                        sb.append("<sub>").append(cont.getValue()).append("</sub>");

                    } else if ("sup".equals(typeName)) {
                        sb.append("<sup>").append(cont.getValue()).append("</sup>");

                    } else if (cont.getValue() instanceof SubnoteType) {
                        String beforeSubnoteType = (String) cpcNwMap.get("subnoteType");
                        if(textIndex > 1) cpcNwMap.put("subnoteType", "");
                        // <subnote> Element를 만나면 CpcNoteAndWarning를 생성완료하고 리스트에 넣는다.(subnote가 가진 하위 note-paragraph 목록을 생성해야하기 때문)
                        CpcNoteAndWarning cpcNw = setCpcNw(sb, cpcNwMap);
                        if(cpcNwList.size() == 5000) {
                            cpcNwLists.add(cpcNwList);
                            cpcNwList = new ArrayList<>();
                        } else if (cpcNwList.size() <= 5000) {
                            cpcNwList.add(cpcNw);
                        }

                        String subnoteType = ((SubnoteType) cont.getValue()).getType();
                        int seq = (int) cpcNwMap.get("seq");
                        int depth = (int) cpcNwMap.get("depth");

                        cpcNwMap.put("subnoteType", subnoteType);
                        cpcNwMap.put("seq", ++seq);
                        cpcNwMap.put("depth", ++depth); // <subnote> 요소를 만나면 무조건 depth(계층)이 1 늘린다.

                        List<NoteParagraphType> noteParagraphList = ((SubnoteType) cont.getValue()).getNoteParagraph();
                        cpcNwMap.put("contentsSize", noteParagraphList.size());

                        doRecursiveNw1(cpcNwMap, noteParagraphList);

                        int afterDepth = (int) cpcNwMap.get("depth");
                        cpcNwMap.put("depth", --afterDepth); // <subnote> 요소를 만나서 증가했던 depth를 1 줄인다.
                        cpcNwMap.put("subnoteType", beforeSubnoteType);
                        sb.setLength(0);

                    }
                    int beforeSize = (int) cpcNwMap.get("beforeSize");
                    int beforeIndex = (int) cpcNwMap.get("beforeIndex");

                    if(contentsSize == i && beforeSize != beforeIndex) {
                        continue;
                    }

                } else { // note-paragraph가 텍스트 정보일 때(Serializable), StringBuilder에 append한다.
                    String replacedContent = content.toString().replace("\n", "").replace("\t", "&nbsp;");
                    sb.append(replacedContent);
                    textIndex++;
                }
                int beforeSize = (int) cpcNwMap.get("beforeSize");
                int beforeIndex = (int) cpcNwMap.get("beforeIndex");
                String beforeType = (String) cpcNwMap.get("beforeType");
                if(beforeType.equals("u") && beforeSize != beforeIndex) {
                    continue;
                }
                Boolean isEntry = (Boolean) cpcNwMap.get("isEntry");
                if(!beforeType.equals("u") && !isEntry && contentsSize == i) {
                    if(!"".equals(sb.toString())) {
                        CpcNoteAndWarning nw = setCpcNw(sb, cpcNwMap);
                        if(cpcNwList.size() == 5000) {
                            cpcNwLists.add(cpcNwList);
                            cpcNwList = new ArrayList<>();
                        } else if (cpcNwList.size() <= 5000) {
                            cpcNwList.add(nw);
                        }

                        int seq = (int) cpcNwMap.get("seq");
                        seq++;
                        cpcNwMap.put("seq", seq);
                    }
                }
            }
        }
    }

    private static CpcNoteAndWarning setCpcNw(StringBuilder sb, Map<String, Object> cpcNwMap) {
        int depth = (int) cpcNwMap.get("depth");
        int beforeSize = (int) cpcNwMap.get("beforeSize");
        String subnoteType = (String) cpcNwMap.get("subnoteType");
        String beforeType = (String) cpcNwMap.get("beforeType");
        String type = (String) cpcNwMap.get("type");

        CpcNoteAndWarning cpcNw = new CpcNoteAndWarning();
        cpcNw.setSymbol((String) cpcNwMap.get("symbol"));
        cpcNw.setLevel((int) cpcNwMap.get("level"));
        cpcNw.setType(type);
        cpcNw.setSeq((int) cpcNwMap.get("seq"));
        cpcNw.setDepth(depth);
        if (depth == 0 && beforeSize > 1 && !"table".equals(beforeType) && !"warning".equals(type)) {
            cpcNw.setSubnoteType("number");
        } else {
            cpcNw.setSubnoteType(subnoteType);
        }
        cpcNw.setContent(sb.toString());
        cpcNw.setDateRevised((String) cpcNwMap.get("dateRevised"));

        return cpcNw;
    }

    /**
     * XMLGregorianClendar타입의 날짜정보 전달받아 java.util.Date타입으로 컨버팅해 앞뒤로 [ ]를 이어붙여 문자열로 반환하는 메서드
     * @param xmlDate
     * @return [yyyy-MM-dd] 형식의 문자열
     */
    private String getReclassDate(XMLGregorianCalendar xmlDate) {
        Date date = convertToDate(xmlDate);
        SimpleDateFormat sdf = new SimpleDateFormat("[yyyy-MM-dd]");
        return sdf.format(date);
    }


    /**
     * <classification-item> Element를 전달받아 CPC_TITLE 객체를 반환하는 메서드
     *
     * @param symbol 변환된 symbol (A01K0006/00)
     * @param item   CPC_TITLE 정보가 담긴<classification-item> Element
     * @return CPC_TITLE 객체
     */
    private CpcTitle getCpcTitle(String symbol, ClassificationItemType item) {
        String connectedTitle = getConnectedTitle(item);
        CpcTitle cpcTitle = new CpcTitle();
        if (connectedTitle != null) {
            Optional<XMLGregorianCalendar> dateRevisedOpt = item.getClassTitle().getDateRevised();
            XMLGregorianCalendar dateRevised = dateRevisedOpt.orElse(null);
            String titleDate = convertToString(dateRevised);
            int titleLevel = item.getLevel();

            cpcTitle.setTitle(connectedTitle);
            cpcTitle.setSymbol(symbol);
            cpcTitle.setDateRevised(titleDate);
            cpcTitle.setLevel(titleLevel);

        } else {    // 해당 classification-item이 class-title을 갖고있지 않을때
            cpcTitle.setSymbol(symbol);
            cpcTitle.setLevel(item.getLevel());

        }
        return cpcTitle;
    }

    /**
     * <classification-item>을 파싱해 각각의 Text를 이어붙인 CPC_TITLE 문자열을 반환하는 메서드
     *
     * @param item <classification-item> Element
     * @return 완성된 TITLE 문자열
     */
    private String getConnectedTitle(ClassificationItemType item) {
        Map<String, Object> symAndLvlMap = new ConcurrentHashMap<>();
        String convertSymbol = convertSymbol(item.getClassificationSymbol());
        symAndLvlMap.put("symbol", convertSymbol);
        symAndLvlMap.put("level", item.getLevel());

        List<TitlePartType> titlePartList = Optional.ofNullable(item.getClassTitle()).map(ClassTitleType::getTitlePart).orElse(null);
        StringBuilder sb = new StringBuilder();

        if (titlePartList != null && !titlePartList.isEmpty()) {
            if (titlePartList.size() == 1) {
                List<JAXBElement<Markup>> trcList = titlePartList.get(0).getTextOrReferenceOrCPCSpecificText();
                for (JAXBElement<Markup> trc : trcList) {
                    doTitleRecursive1(trc, sb, symAndLvlMap);
                }
            } else {
                for (TitlePartType tpType : titlePartList) {
                    sb.append("; ");
                    List<JAXBElement<Markup>> trcList = tpType.getTextOrReferenceOrCPCSpecificText();
                    for (JAXBElement<Markup> trc : trcList) {
                        doTitleRecursive1(trc, sb, symAndLvlMap);
                    }
                }
                return sb.substring(2);
            }
            return sb.toString();
        } else {
            return null;
        }
    }

    /**
     * 재귀함수 1 :
     * Markup Element를 전달받아 Element type에 따른 괄호기호 처리를 하고, 해당 Markup 하위계층에 존재하는 Element를 탐색하는 기능
     *
     * @param trc
     * @param sb
     * @param symAndLvlMap
     */
    private void doTitleRecursive1(JAXBElement<Markup> trc, StringBuilder sb, Map<String, Object> symAndLvlMap) {
        String typeName = trc.getName().toString();
        List<Serializable> contents = trc.getValue().getContent();

        String startSymbol = "";
        String endSymbol = "";

        if (typeName.equals("CPC-specific-text")) {
            startSymbol = "{";
            endSymbol = "}";
        } else if (typeName.equals("reference")) {
            startSymbol = "(";
            endSymbol = ")";
        }

        sb.append(startSymbol);
        doTitleRecursive2(contents, sb, symAndLvlMap);
        sb.append(endSymbol);

    }

    /**
     * 재귀함수 2 :
     * 재귀함수 1에서 전달받은 하위계층 목록을 탐색하며 Element type에 따른 괄호처리를 하고, 하위 Element를 탐색하는 기능
     * - 만약 전달받은 Element가 더 이상 하위계층이 없는(이하 태그가 <text> 또는 문자열 밖에 없는) Element라면 문자열을 이어붙인다.
     *
     * @param contents
     * @param sb
     * @param symAndLvlMap
     */
    private void doTitleRecursive2(List<Serializable> contents, StringBuilder sb, Map<String, Object> symAndLvlMap) {
        for (Serializable cont : contents) {
            if (cont instanceof JAXBElement) {
                String typeName = ((JAXBElement<?>) cont).getName().toString();
                if (("CPC-specific-text").equals(typeName)) {
                    sb.append("{");
                    doTitleRecurvsive3((JAXBElement<?>) cont, sb, symAndLvlMap);
                    sb.append("}");
                } else if (typeName.equals("reference")) {
                    sb.append("(");
                    doTitleRecurvsive3((JAXBElement<?>) cont, sb, symAndLvlMap);
                    sb.append(")");
                } else {
                    doTitleRecurvsive3((JAXBElement<?>) cont, sb, symAndLvlMap);
                }
            } else {
                sb.append(cont);
            }
        }
    }

    /**
     * 재귀함수 3 :
     * 재귀함수 2에서 전달받은 Element의 type을 구분하여 재귀함수 2처럼 하위 계층이 없을때 문자열을 이어붙이고,
     * 하위 계층이 존재한다면 다시 재귀함수 2를 호출한다.
     * - Element Type이 <media>일 경우 해당 정보로 CPC_MEDIA 객체를 생성하여 리스트에 추가한다
     *
     * @param cont
     * @param sb
     * @param symAndLvlMap
     */
    private void doTitleRecurvsive3(JAXBElement<?> cont, StringBuilder sb, Map<String, Object> symAndLvlMap) {
        String exName = cont.getName().toString();

        if (cont.getValue() instanceof ClassRefType) {
            sb.append(((ClassRefType) cont.getValue()).getValue());

        } else if (cont.getValue() instanceof Markup) {
            List<Serializable> list = ((Markup) cont.getValue()).getContent();
            doTitleRecursive2(list, sb, symAndLvlMap);

        } else if (cont.getValue() instanceof UType) { // <u>
            List<Serializable> list = ((UType) cont.getValue()).getContent();
            sb.append("<u>");
            sb.append(((UType) cont.getValue()).getContent().get(0));
            sb.append("</u>");

        } else if (cont.getValue() instanceof MediaType) {    // <media>
            MediaType mediaType = (MediaType) cont.getValue();
            sb.append("<img id=\"").append(mediaType.getId()).append("\" alt=\"image\" />");

            CpcMedia cpcMedia = new CpcMedia();
            cpcMedia.setSymbol((String) symAndLvlMap.get("symbol"));
            cpcMedia.setLevel((int) symAndLvlMap.get("level"));
            cpcMedia.setId(Integer.parseInt(mediaType.getId()));
            cpcMedia.setFileName(mediaType.getFileName());
            cpcMedia.setType(mediaType.getType().value());

            cpcMediaList.add(cpcMedia);

        } else if (cont.getValue() instanceof ClassRefType) {
            sb.append(cont.getValue());

        } else if (exName.equals("sub")) {    // <sub>
            sb.append("<sub>");
            sb.append(cont.getValue());
            sb.append("</sub>");

        } else if (exName.equals("sup")) {    // <sub>
            sb.append("<sup>");
            sb.append(cont.getValue());
            sb.append("</sup>");
        }
    }

    /**
     * <classification-iem> Element를 전달받아 CPC_TREE 객체를 생성하고 반환하는 기능
     *
     * @param parentSymbol
     * @param item
     * @param symbol
     * @return CPC_TREE 객체
     */
    private CpcTree getCpcTree(String parentSymbol, ClassificationItemType item, String symbol) {
        // <classification-item>의 값을 DTO에 맞는 형식으로 변환
        String breakdownCode = item.isBreakdownCode() ? "Y" : "N";
        String notAllocatable = item.isNotAllocatable() ? "Y" : "N";
        String additionalOnly = item.isAdditionalOnly() ? "Y" : "N";
        Boolean isDefExists = item.isDefinitionExists();
        String definitionExists = (isDefExists != null) ? (item.isDefinitionExists() ? "Y" : "N") : null;
        String dateRevised = convertToString(item.getDateRevised());

        // CPC_TREE 객체 세팅
        CpcTree cpcTree = new CpcTree();
        cpcTree.setParentSymbol(parentSymbol);
        cpcTree.setSymbol(symbol);
        cpcTree.setBreakdownCode(breakdownCode);
        cpcTree.setNotAllocatable(notAllocatable);
        cpcTree.setLevel(item.getLevel());
        cpcTree.setAdditionalOnly(additionalOnly);
        cpcTree.setSortKey(item.getSortKey());
        cpcTree.setDefinitionExists(definitionExists);
        cpcTree.setDateRevised(dateRevised);
        cpcTree.setStatus(item.getStatus().value());

        return cpcTree;
    }

    /**
     * Symbol을 아래와 같이 변환해주는 기능 (SubClass를 4자리로 치환하는 기능 -> 공백은 0으로 치환한다.)
     * A01K3/00 -> A01K0003/00
     *
     * @param symbol
     * @return
     */
    private static String convertSymbol(String symbol) {
        if (symbol.length() > 4) {
            String subclass = symbol.substring(0, 4); // 이어붙일 CPC Symbol 1번 -> A01K
            String body = null;                       // 이어붙일 CPC Symbol 2번 -> 0001
            String afterSlash = null;                 // 이어붙일 CPC Symbol 3번 -> /2238
            int targetIndex = symbol.indexOf("/");  // A01K089/7789 -> 7번째

            if (targetIndex != -1) {
                afterSlash = symbol.substring(targetIndex);
                String tempBody = symbol.substring(4, targetIndex);
                body = String.format("%04d", Integer.parseInt(tempBody));
            }
            StringBuffer sb = new StringBuffer();
            symbol = sb.append(subclass).append(body).append(afterSlash).toString();
        }
        return symbol;
    }

    /**
     * XML 파일을 파싱했을때 기본지정되는 형식의 날짜타입을 java.util.Date 타입으로 변환한다.
     *
     * @param xmlCalendar
     * @return
     */
    private Date convertToDate(XMLGregorianCalendar xmlCalendar) {
        if (xmlCalendar == null) {
            return null;
        } else {
            return new Date(xmlCalendar.toGregorianCalendar().getTimeInMillis());
        }
    }

    private String convertToString(XMLGregorianCalendar xmlCalendar) {
        if (xmlCalendar == null) {
            return "";
        } else {
            Date date = new Date(xmlCalendar.toGregorianCalendar().getTimeInMillis());
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            return sdf.format(date);
        }
    }

    /**
     * CPC xml파일들이 존재하는 디렉토리에서 "cpc-scheme-*.xml"에 해당하는 파일들을 배열로 만듬
     *
     * @return
     */
    private File[] getFilteredXmlFiles() {
        File dir = new File(dirPath);
        FilenameFilter filter = new FilenameFilter() {
            @Override
            public boolean accept(File file, String name) {
                return name.startsWith("cpc-scheme-") && name.endsWith(".xml");
            }
        };
        File[] files = dir.listFiles(filter);
        return (files == null || files.length == 0) ? EMPTY_FILES : files;
    }

    /**
     * 파일목록을 파일명 오름차순으로 정렬한다.
     *
     * @param files
     * @return
     */
    private File[] sortByFileName(File[] files) {
        if (files == null || files.length == 0) {
            return EMPTY_FILES;
        }
        return (File[]) Arrays.stream(files).sorted().toArray(File[]::new);
    }

}