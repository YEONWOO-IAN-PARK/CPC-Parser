package net.miso.parser.cpc.mapper;

import net.miso.parser.cpc.dto.CpcMedia;
import net.miso.parser.cpc.dto.CpcNoteAndWarning;
import net.miso.parser.cpc.dto.CpcTitle;
import net.miso.parser.cpc.dto.CpcTree;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
public interface CpcMapper {

    int insertCpcTrees(List<CpcTree> cpcTreeList);
    int insertCpcTitles(List<CpcTitle> cpcTitleList);
    int insertCpcMedias(List<CpcMedia> cpcMediaList);
    int insertCpcNoteAndWarnings(List<CpcNoteAndWarning> cpcNoteAndWarningList);

}
