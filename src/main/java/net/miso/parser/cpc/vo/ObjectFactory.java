//
// 이 파일은 JAXB(JavaTM Architecture for XML Binding) 참조 구현 2.2.8-b130911.1802 버전을 통해 생성되었습니다. 
// <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>를 참조하십시오. 
// 이 파일을 수정하면 소스 스키마를 재컴파일할 때 수정 사항이 손실됩니다. 
// 생성 날짜: 2023.04.04 시간 05:11:50 PM KST 
//


package net.miso.parser.cpc.vo;

import lombok.ToString;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the net.miso.parser.cpc.vo package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
@ToString
public class ObjectFactory {

    private final static QName _Note_QNAME = new QName("", "note");
    private final static QName _Sub_QNAME = new QName("", "sub");
    private final static QName _TitlePart_QNAME = new QName("", "title-part");
    private final static QName _MetaData_QNAME = new QName("", "meta-data");
    private final static QName _Media_QNAME = new QName("", "media");
    private final static QName _ClassTitle_QNAME = new QName("", "class-title");
    private final static QName _Sup_QNAME = new QName("", "sup");
    private final static QName _Br_QNAME = new QName("", "br");
    private final static QName _CPCSpecificText_QNAME = new QName("", "CPC-specific-text");
    private final static QName _Reference_QNAME = new QName("", "reference");
    private final static QName _ClassificationItem_QNAME = new QName("", "classification-item");
    private final static QName _ClassificationSymbol_QNAME = new QName("", "classification-symbol");
    private final static QName _ClassScheme_QNAME = new QName("", "class-scheme");
    private final static QName _ReclassificationDate_QNAME = new QName("", "reclassification-date");
    private final static QName _Row_QNAME = new QName("", "row");
    private final static QName _Text_QNAME = new QName("", "text");
    private final static QName _Subnote_QNAME = new QName("", "subnote");
    private final static QName _Table_QNAME = new QName("", "table");
    private final static QName _Pre_QNAME = new QName("", "pre");
    private final static QName _ClassRef_QNAME = new QName("", "class-ref");
    private final static QName _CPCSpecificNote_QNAME = new QName("", "CPC-specific-note");
    private final static QName _Entry_QNAME = new QName("", "entry");
    private final static QName _U_QNAME = new QName("", "u");
    private final static QName _NoteParagraph_QNAME = new QName("", "note-paragraph");
    private final static QName _NotesAndWarnings_QNAME = new QName("", "notes-and-warnings");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: net.miso.parser.cpc.vo
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link NoteType }
     * 
     */
    public NoteType createNoteType() {
        return new NoteType();
    }

    /**
     * Create an instance of {@link TitlePartType }
     * 
     */
    public TitlePartType createTitlePartType() {
        return new TitlePartType();
    }

    /**
     * Create an instance of {@link MediaType }
     * 
     */
    public MediaType createMediaType() {
        return new MediaType();
    }

    /**
     * Create an instance of {@link ClassTitleType }
     * 
     */
    public ClassTitleType createClassTitleType() {
        return new ClassTitleType();
    }

    /**
     * Create an instance of {@link Markup }
     * 
     */
    public Markup createMarkup() {
        return new Markup();
    }

    /**
     * Create an instance of {@link ClassificationItemType }
     * 
     */
    public ClassificationItemType createClassificationItemType() {
        return new ClassificationItemType();
    }

    /**
     * Create an instance of {@link ClassSchemeType }
     * 
     */
    public ClassSchemeType createClassSchemeType() {
        return new ClassSchemeType();
    }

    /**
     * Create an instance of {@link RowType }
     * 
     */
    public RowType createRowType() {
        return new RowType();
    }

    /**
     * Create an instance of {@link SubnoteType }
     * 
     */
    public SubnoteType createSubnoteType() {
        return new SubnoteType();
    }

    /**
     * Create an instance of {@link TableType }
     * 
     */
    public TableType createTableType() {
        return new TableType();
    }

    /**
     * Create an instance of {@link NoteParagraphType }
     * 
     */
    public NoteParagraphType createNoteParagraphType() {
        return new NoteParagraphType();
    }

    /**
     * Create an instance of {@link ClassRefType }
     * 
     */
    public ClassRefType createClassRefType() {
        return new ClassRefType();
    }

    /**
     * Create an instance of {@link EntryType }
     * 
     */
    public EntryType createEntryType() {
        return new EntryType();
    }

    /**
     * Create an instance of {@link UType }
     * 
     */
    public UType createUType() {
        return new UType();
    }

    /**
     * Create an instance of {@link NotesAndWarningsType }
     * 
     */
    public NotesAndWarningsType createNotesAndWarningsType() {
        return new NotesAndWarningsType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NoteType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "note")
    public JAXBElement<NoteType> createNote(NoteType value) {
        return new JAXBElement<NoteType>(_Note_QNAME, NoteType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "sub")
    public JAXBElement<String> createSub(String value) {
        return new JAXBElement<String>(_Sub_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TitlePartType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "title-part")
    public JAXBElement<TitlePartType> createTitlePart(TitlePartType value) {
        return new JAXBElement<TitlePartType>(_TitlePart_QNAME, TitlePartType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "meta-data")
    public JAXBElement<String> createMetaData(String value) {
        return new JAXBElement<String>(_MetaData_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MediaType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "media")
    public JAXBElement<MediaType> createMedia(MediaType value) {
        return new JAXBElement<MediaType>(_Media_QNAME, MediaType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ClassTitleType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "class-title")
    public JAXBElement<ClassTitleType> createClassTitle(ClassTitleType value) {
        return new JAXBElement<ClassTitleType>(_ClassTitle_QNAME, ClassTitleType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "sup")
    public JAXBElement<String> createSup(String value) {
        return new JAXBElement<String>(_Sup_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "br")
    public JAXBElement<Object> createBr(Object value) {
        return new JAXBElement<Object>(_Br_QNAME, Object.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Markup }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "CPC-specific-text")
    public JAXBElement<Markup> createCPCSpecificText(Markup value) {
        return new JAXBElement<Markup>(_CPCSpecificText_QNAME, Markup.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Markup }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "reference")
    public JAXBElement<Markup> createReference(Markup value) {
        return new JAXBElement<Markup>(_Reference_QNAME, Markup.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ClassificationItemType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "classification-item")
    public JAXBElement<ClassificationItemType> createClassificationItem(ClassificationItemType value) {
        return new JAXBElement<ClassificationItemType>(_ClassificationItem_QNAME, ClassificationItemType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "classification-symbol")
    public JAXBElement<String> createClassificationSymbol(String value) {
        return new JAXBElement<String>(_ClassificationSymbol_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ClassSchemeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "class-scheme")
    public JAXBElement<ClassSchemeType> createClassScheme(ClassSchemeType value) {
        return new JAXBElement<ClassSchemeType>(_ClassScheme_QNAME, ClassSchemeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "reclassification-date")
    public JAXBElement<XMLGregorianCalendar> createReclassificationDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_ReclassificationDate_QNAME, XMLGregorianCalendar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RowType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "row")
    public JAXBElement<RowType> createRow(RowType value) {
        return new JAXBElement<RowType>(_Row_QNAME, RowType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Markup }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "text")
    public JAXBElement<Markup> createText(Markup value) {
        return new JAXBElement<Markup>(_Text_QNAME, Markup.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SubnoteType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "subnote")
    public JAXBElement<SubnoteType> createSubnote(SubnoteType value) {
        return new JAXBElement<SubnoteType>(_Subnote_QNAME, SubnoteType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TableType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "table")
    public JAXBElement<TableType> createTable(TableType value) {
        return new JAXBElement<TableType>(_Table_QNAME, TableType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NoteParagraphType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "pre")
    public JAXBElement<NoteParagraphType> createPre(NoteParagraphType value) {
        return new JAXBElement<NoteParagraphType>(_Pre_QNAME, NoteParagraphType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ClassRefType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "class-ref")
    public JAXBElement<ClassRefType> createClassRef(ClassRefType value) {
        return new JAXBElement<ClassRefType>(_ClassRef_QNAME, ClassRefType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NoteParagraphType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "CPC-specific-note")
    public JAXBElement<NoteParagraphType> createCPCSpecificNote(NoteParagraphType value) {
        return new JAXBElement<NoteParagraphType>(_CPCSpecificNote_QNAME, NoteParagraphType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EntryType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "entry")
    public JAXBElement<EntryType> createEntry(EntryType value) {
        return new JAXBElement<EntryType>(_Entry_QNAME, EntryType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "u")
    public JAXBElement<UType> createU(UType value) {
        return new JAXBElement<UType>(_U_QNAME, UType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NoteParagraphType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "note-paragraph")
    public JAXBElement<NoteParagraphType> createNoteParagraph(NoteParagraphType value) {
        return new JAXBElement<NoteParagraphType>(_NoteParagraph_QNAME, NoteParagraphType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NotesAndWarningsType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "notes-and-warnings")
    public JAXBElement<NotesAndWarningsType> createNotesAndWarnings(NotesAndWarningsType value) {
        return new JAXBElement<NotesAndWarningsType>(_NotesAndWarnings_QNAME, NotesAndWarningsType.class, null, value);
    }

}
