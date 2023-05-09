//
// �� ������ JAXB(JavaTM Architecture for XML Binding) ���� ���� 2.2.8-b130911.1802 ������ ���� �����Ǿ����ϴ�. 
// <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>�� �����Ͻʽÿ�. 
// �� ������ �����ϸ� �ҽ� ��Ű���� ���������� �� ���� ������ �սǵ˴ϴ�. 
// ���� ��¥: 2023.05.08 �ð� 11:32:13 AM KST 
//


package net.miso.parser.cpc.vo.def;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the net.misotech.dap.vo.cpcdefvo package. 
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
public class ObjectFactory {

    private final static QName _Sub_QNAME = new QName("", "sub");
    private final static QName _GlossaryOfTerms_QNAME = new QName("", "glossary-of-terms");
    private final static QName _References_QNAME = new QName("", "references");
    private final static QName _TableColumn_QNAME = new QName("", "table-column");
    private final static QName _LimitingReferences_QNAME = new QName("", "limiting-references");
    private final static QName _ParagraphText_QNAME = new QName("", "paragraph-text");
    private final static QName _Caption_QNAME = new QName("", "caption");
    private final static QName _Media_QNAME = new QName("", "media");
    private final static QName _DefinitionTitle_QNAME = new QName("", "definition-title");
    private final static QName _Sup_QNAME = new QName("", "sup");
    private final static QName _ClassificationSymbol_QNAME = new QName("", "classification-symbol");
    private final static QName _SectionTitle_QNAME = new QName("", "section-title");
    private final static QName _Relationship_QNAME = new QName("", "relationship");
    private final static QName _Definitions_QNAME = new QName("", "definitions");
    private final static QName _SpecialMeanings_QNAME = new QName("", "special-meanings");
    private final static QName _Table_QNAME = new QName("", "table");
    private final static QName _Abbreviations_QNAME = new QName("", "abbreviations");
    private final static QName _SpecialRules_QNAME = new QName("", "special-rules");
    private final static QName _ClassRef_QNAME = new QName("", "class-ref");
    private final static QName _InformativeReferences_QNAME = new QName("", "informative-references");
    private final static QName _DefinitionStatement_QNAME = new QName("", "definition-statement");
    private final static QName _InsteadOfWords_QNAME = new QName("", "instead-of-words");
    private final static QName _ListItem_QNAME = new QName("", "list-item");
    private final static QName _Synonyms_QNAME = new QName("", "synonyms");
    private final static QName _ResidualReferences_QNAME = new QName("", "residual-references");
    private final static QName _List_QNAME = new QName("", "list");
    private final static QName _DefinitionItem_QNAME = new QName("", "definition-item");
    private final static QName _SynonymsKeywords_QNAME = new QName("", "synonyms-keywords");
    private final static QName _SectionBody_QNAME = new QName("", "section-body");
    private final static QName _TableRow_QNAME = new QName("", "table-row");
    private final static QName _ApplicationReferences_QNAME = new QName("", "application-references");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: net.misotech.dap.vo.cpcdefvo
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link SectionType }
     * 
     */
    public SectionType createSectionType() {
        return new SectionType();
    }

    /**
     * Create an instance of {@link ReferencesType }
     * 
     */
    public ReferencesType createReferencesType() {
        return new ReferencesType();
    }

    /**
     * Create an instance of {@link TableColumnType }
     * 
     */
    public TableColumnType createTableColumnType() {
        return new TableColumnType();
    }

    /**
     * Create an instance of {@link ParagraphTextType }
     * 
     */
    public ParagraphTextType createParagraphTextType() {
        return new ParagraphTextType();
    }

    /**
     * Create an instance of {@link MediaType }
     * 
     */
    public MediaType createMediaType() {
        return new MediaType();
    }

    /**
     * Create an instance of {@link DefinitionTitleType }
     * 
     */
    public DefinitionTitleType createDefinitionTitleType() {
        return new DefinitionTitleType();
    }

    /**
     * Create an instance of {@link ClassificationSymbolType }
     * 
     */
    public ClassificationSymbolType createClassificationSymbolType() {
        return new ClassificationSymbolType();
    }

    /**
     * Create an instance of {@link DefinitionsType }
     * 
     */
    public DefinitionsType createDefinitionsType() {
        return new DefinitionsType();
    }

    /**
     * Create an instance of {@link SectionBodyType }
     * 
     */
    public SectionBodyType createSectionBodyType() {
        return new SectionBodyType();
    }

    /**
     * Create an instance of {@link TableType }
     * 
     */
    public TableType createTableType() {
        return new TableType();
    }

    /**
     * Create an instance of {@link ClassRefType }
     * 
     */
    public ClassRefType createClassRefType() {
        return new ClassRefType();
    }

    /**
     * Create an instance of {@link ListItemType }
     * 
     */
    public ListItemType createListItemType() {
        return new ListItemType();
    }

    /**
     * Create an instance of {@link ListType }
     * 
     */
    public ListType createListType() {
        return new ListType();
    }

    /**
     * Create an instance of {@link DefinitionItemType }
     * 
     */
    public DefinitionItemType createDefinitionItemType() {
        return new DefinitionItemType();
    }

    /**
     * Create an instance of {@link SynonymsKeywordsType }
     * 
     */
    public SynonymsKeywordsType createSynonymsKeywordsType() {
        return new SynonymsKeywordsType();
    }

    /**
     * Create an instance of {@link TableRowType }
     * 
     */
    public TableRowType createTableRowType() {
        return new TableRowType();
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
     * Create an instance of {@link JAXBElement }{@code <}{@link SectionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "glossary-of-terms")
    public JAXBElement<SectionType> createGlossaryOfTerms(SectionType value) {
        return new JAXBElement<SectionType>(_GlossaryOfTerms_QNAME, SectionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReferencesType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "references")
    public JAXBElement<ReferencesType> createReferences(ReferencesType value) {
        return new JAXBElement<ReferencesType>(_References_QNAME, ReferencesType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TableColumnType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "table-column")
    public JAXBElement<TableColumnType> createTableColumn(TableColumnType value) {
        return new JAXBElement<TableColumnType>(_TableColumn_QNAME, TableColumnType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SectionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "limiting-references")
    public JAXBElement<SectionType> createLimitingReferences(SectionType value) {
        return new JAXBElement<SectionType>(_LimitingReferences_QNAME, SectionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ParagraphTextType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "paragraph-text")
    public JAXBElement<ParagraphTextType> createParagraphText(ParagraphTextType value) {
        return new JAXBElement<ParagraphTextType>(_ParagraphText_QNAME, ParagraphTextType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "caption")
    public JAXBElement<String> createCaption(String value) {
        return new JAXBElement<String>(_Caption_QNAME, String.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link DefinitionTitleType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "definition-title")
    public JAXBElement<DefinitionTitleType> createDefinitionTitle(DefinitionTitleType value) {
        return new JAXBElement<DefinitionTitleType>(_DefinitionTitle_QNAME, DefinitionTitleType.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link ClassificationSymbolType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "classification-symbol")
    public JAXBElement<ClassificationSymbolType> createClassificationSymbol(ClassificationSymbolType value) {
        return new JAXBElement<ClassificationSymbolType>(_ClassificationSymbol_QNAME, ClassificationSymbolType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "section-title")
    public JAXBElement<String> createSectionTitle(String value) {
        return new JAXBElement<String>(_SectionTitle_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SectionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "relationship")
    public JAXBElement<SectionType> createRelationship(SectionType value) {
        return new JAXBElement<SectionType>(_Relationship_QNAME, SectionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DefinitionsType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "definitions")
    public JAXBElement<DefinitionsType> createDefinitions(DefinitionsType value) {
        return new JAXBElement<DefinitionsType>(_Definitions_QNAME, DefinitionsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SectionBodyType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "special-meanings")
    public JAXBElement<SectionBodyType> createSpecialMeanings(SectionBodyType value) {
        return new JAXBElement<SectionBodyType>(_SpecialMeanings_QNAME, SectionBodyType.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link SectionBodyType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "abbreviations")
    public JAXBElement<SectionBodyType> createAbbreviations(SectionBodyType value) {
        return new JAXBElement<SectionBodyType>(_Abbreviations_QNAME, SectionBodyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SectionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "special-rules")
    public JAXBElement<SectionType> createSpecialRules(SectionType value) {
        return new JAXBElement<SectionType>(_SpecialRules_QNAME, SectionType.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link SectionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "informative-references")
    public JAXBElement<SectionType> createInformativeReferences(SectionType value) {
        return new JAXBElement<SectionType>(_InformativeReferences_QNAME, SectionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SectionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "definition-statement")
    public JAXBElement<SectionType> createDefinitionStatement(SectionType value) {
        return new JAXBElement<SectionType>(_DefinitionStatement_QNAME, SectionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SectionBodyType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "instead-of-words")
    public JAXBElement<SectionBodyType> createInsteadOfWords(SectionBodyType value) {
        return new JAXBElement<SectionBodyType>(_InsteadOfWords_QNAME, SectionBodyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListItemType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "list-item")
    public JAXBElement<ListItemType> createListItem(ListItemType value) {
        return new JAXBElement<ListItemType>(_ListItem_QNAME, ListItemType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SectionBodyType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "synonyms")
    public JAXBElement<SectionBodyType> createSynonyms(SectionBodyType value) {
        return new JAXBElement<SectionBodyType>(_Synonyms_QNAME, SectionBodyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SectionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "residual-references")
    public JAXBElement<SectionType> createResidualReferences(SectionType value) {
        return new JAXBElement<SectionType>(_ResidualReferences_QNAME, SectionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "list")
    public JAXBElement<ListType> createList(ListType value) {
        return new JAXBElement<ListType>(_List_QNAME, ListType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DefinitionItemType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "definition-item")
    public JAXBElement<DefinitionItemType> createDefinitionItem(DefinitionItemType value) {
        return new JAXBElement<DefinitionItemType>(_DefinitionItem_QNAME, DefinitionItemType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SynonymsKeywordsType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "synonyms-keywords")
    public JAXBElement<SynonymsKeywordsType> createSynonymsKeywords(SynonymsKeywordsType value) {
        return new JAXBElement<SynonymsKeywordsType>(_SynonymsKeywords_QNAME, SynonymsKeywordsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SectionBodyType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "section-body")
    public JAXBElement<SectionBodyType> createSectionBody(SectionBodyType value) {
        return new JAXBElement<SectionBodyType>(_SectionBody_QNAME, SectionBodyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TableRowType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "table-row")
    public JAXBElement<TableRowType> createTableRow(TableRowType value) {
        return new JAXBElement<TableRowType>(_TableRow_QNAME, TableRowType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SectionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "application-references")
    public JAXBElement<SectionType> createApplicationReferences(SectionType value) {
        return new JAXBElement<SectionType>(_ApplicationReferences_QNAME, SectionType.class, null, value);
    }

}
