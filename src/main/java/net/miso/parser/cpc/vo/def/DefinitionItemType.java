//
// �� ������ JAXB(JavaTM Architecture for XML Binding) ���� ���� 2.2.8-b130911.1802 ������ ���� �����Ǿ����ϴ�. 
// <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>�� �����Ͻʽÿ�. 
// �� ������ �����ϸ� �ҽ� ��Ű���� ���������� �� ���� ������ �սǵ˴ϴ�. 
// ���� ��¥: 2023.05.08 �ð� 11:32:13 AM KST 
//


package net.miso.parser.cpc.vo.def;

import javax.xml.bind.annotation.*;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>definition-item-type complex type�� ���� Java Ŭ�����Դϴ�.
 * 
 * <p>���� ��Ű�� ������ �� Ŭ������ ���ԵǴ� �ʿ��� �������� �����մϴ�.
 * 
 * <pre>
 * &lt;complexType name="definition-item-type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{}classification-symbol"/>
 *         &lt;element ref="{}definition-title" minOccurs="0"/>
 *         &lt;element ref="{}definition-statement" minOccurs="0"/>
 *         &lt;element ref="{}relationship" minOccurs="0"/>
 *         &lt;element ref="{}references" minOccurs="0"/>
 *         &lt;element ref="{}special-rules" minOccurs="0"/>
 *         &lt;element ref="{}glossary-of-terms" minOccurs="0"/>
 *         &lt;element ref="{}synonyms-keywords" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute ref="{}date-revised"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "definition-item-type", propOrder = {
    "classificationSymbol",
    "definitionTitle",
    "definitionStatement",
    "relationship",
    "references",
    "specialRules",
    "glossaryOfTerms",
    "synonymsKeywords"
})
public class DefinitionItemType {

    @XmlElement(name = "classification-symbol", required = true)
    protected ClassificationSymbolType classificationSymbol;
    @XmlElement(name = "definition-title")
    protected DefinitionTitleType definitionTitle;
    @XmlElement(name = "definition-statement")
    protected SectionType definitionStatement;
    protected SectionType relationship;
    protected ReferencesType references;
    @XmlElement(name = "special-rules")
    protected SectionType specialRules;
    @XmlElement(name = "glossary-of-terms")
    protected SectionType glossaryOfTerms;
    @XmlElement(name = "synonyms-keywords")
    protected SynonymsKeywordsType synonymsKeywords;
    @XmlAttribute(name = "date-revised")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dateRevised;

    /**
     * classificationSymbol �Ӽ��� ���� �����ɴϴ�.
     * 
     * @return
     *     possible object is
     *     {@link ClassificationSymbolType }
     *     
     */
    public ClassificationSymbolType getClassificationSymbol() {
        return classificationSymbol;
    }

    /**
     * classificationSymbol �Ӽ��� ���� �����մϴ�.
     * 
     * @param value
     *     allowed object is
     *     {@link ClassificationSymbolType }
     *     
     */
    public void setClassificationSymbol(ClassificationSymbolType value) {
        this.classificationSymbol = value;
    }

    /**
     * definitionTitle �Ӽ��� ���� �����ɴϴ�.
     * 
     * @return
     *     possible object is
     *     {@link DefinitionTitleType }
     *     
     */
    public DefinitionTitleType getDefinitionTitle() {
        return definitionTitle;
    }

    /**
     * definitionTitle �Ӽ��� ���� �����մϴ�.
     * 
     * @param value
     *     allowed object is
     *     {@link DefinitionTitleType }
     *     
     */
    public void setDefinitionTitle(DefinitionTitleType value) {
        this.definitionTitle = value;
    }

    /**
     * definitionStatement �Ӽ��� ���� �����ɴϴ�.
     * 
     * @return
     *     possible object is
     *     {@link SectionType }
     *     
     */
    public SectionType getDefinitionStatement() {
        return definitionStatement;
    }

    /**
     * definitionStatement �Ӽ��� ���� �����մϴ�.
     * 
     * @param value
     *     allowed object is
     *     {@link SectionType }
     *     
     */
    public void setDefinitionStatement(SectionType value) {
        this.definitionStatement = value;
    }

    /**
     * relationship �Ӽ��� ���� �����ɴϴ�.
     * 
     * @return
     *     possible object is
     *     {@link SectionType }
     *     
     */
    public SectionType getRelationship() {
        return relationship;
    }

    /**
     * relationship �Ӽ��� ���� �����մϴ�.
     * 
     * @param value
     *     allowed object is
     *     {@link SectionType }
     *     
     */
    public void setRelationship(SectionType value) {
        this.relationship = value;
    }

    /**
     * references �Ӽ��� ���� �����ɴϴ�.
     * 
     * @return
     *     possible object is
     *     {@link ReferencesType }
     *     
     */
    public ReferencesType getReferences() {
        return references;
    }

    /**
     * references �Ӽ��� ���� �����մϴ�.
     * 
     * @param value
     *     allowed object is
     *     {@link ReferencesType }
     *     
     */
    public void setReferences(ReferencesType value) {
        this.references = value;
    }

    /**
     * specialRules �Ӽ��� ���� �����ɴϴ�.
     * 
     * @return
     *     possible object is
     *     {@link SectionType }
     *     
     */
    public SectionType getSpecialRules() {
        return specialRules;
    }

    /**
     * specialRules �Ӽ��� ���� �����մϴ�.
     * 
     * @param value
     *     allowed object is
     *     {@link SectionType }
     *     
     */
    public void setSpecialRules(SectionType value) {
        this.specialRules = value;
    }

    /**
     * glossaryOfTerms �Ӽ��� ���� �����ɴϴ�.
     * 
     * @return
     *     possible object is
     *     {@link SectionType }
     *     
     */
    public SectionType getGlossaryOfTerms() {
        return glossaryOfTerms;
    }

    /**
     * glossaryOfTerms �Ӽ��� ���� �����մϴ�.
     * 
     * @param value
     *     allowed object is
     *     {@link SectionType }
     *     
     */
    public void setGlossaryOfTerms(SectionType value) {
        this.glossaryOfTerms = value;
    }

    /**
     * synonymsKeywords �Ӽ��� ���� �����ɴϴ�.
     * 
     * @return
     *     possible object is
     *     {@link SynonymsKeywordsType }
     *     
     */
    public SynonymsKeywordsType getSynonymsKeywords() {
        return synonymsKeywords;
    }

    /**
     * synonymsKeywords �Ӽ��� ���� �����մϴ�.
     * 
     * @param value
     *     allowed object is
     *     {@link SynonymsKeywordsType }
     *     
     */
    public void setSynonymsKeywords(SynonymsKeywordsType value) {
        this.synonymsKeywords = value;
    }

    /**
     * dateRevised �Ӽ��� ���� �����ɴϴ�.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateRevised() {
        return dateRevised;
    }

    /**
     * dateRevised �Ӽ��� ���� �����մϴ�.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateRevised(XMLGregorianCalendar value) {
        this.dateRevised = value;
    }

}
