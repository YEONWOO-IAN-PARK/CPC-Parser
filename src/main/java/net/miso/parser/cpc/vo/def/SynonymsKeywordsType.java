//
// �� ������ JAXB(JavaTM Architecture for XML Binding) ���� ���� 2.2.8-b130911.1802 ������ ���� �����Ǿ����ϴ�. 
// <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>�� �����Ͻʽÿ�. 
// �� ������ �����ϸ� �ҽ� ��Ű���� ���������� �� ���� ������ �սǵ˴ϴ�. 
// ���� ��¥: 2023.05.08 �ð� 11:32:13 AM KST 
//


package net.miso.parser.cpc.vo.def;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>synonyms-keywords-type complex type�� ���� Java Ŭ�����Դϴ�.
 * 
 * <p>���� ��Ű�� ������ �� Ŭ������ ���ԵǴ� �ʿ��� �������� �����մϴ�.
 * 
 * <pre>
 * &lt;complexType name="synonyms-keywords-type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{}section-title"/>
 *         &lt;choice>
 *           &lt;element ref="{}section-body"/>
 *           &lt;sequence>
 *             &lt;element ref="{}abbreviations" minOccurs="0"/>
 *             &lt;element ref="{}synonyms" minOccurs="0"/>
 *             &lt;element ref="{}instead-of-words" minOccurs="0"/>
 *             &lt;element ref="{}special-meanings" minOccurs="0"/>
 *           &lt;/sequence>
 *         &lt;/choice>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "synonyms-keywords-type", propOrder = {
    "sectionTitle",
    "sectionBody",
    "abbreviations",
    "synonyms",
    "insteadOfWords",
    "specialMeanings"
})
public class SynonymsKeywordsType {

    @XmlElement(name = "section-title", required = true)
    protected String sectionTitle;
    @XmlElement(name = "section-body")
    protected SectionBodyType sectionBody;
    protected SectionBodyType abbreviations;
    protected SectionBodyType synonyms;
    @XmlElement(name = "instead-of-words")
    protected SectionBodyType insteadOfWords;
    @XmlElement(name = "special-meanings")
    protected SectionBodyType specialMeanings;

    /**
     * sectionTitle �Ӽ��� ���� �����ɴϴ�.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSectionTitle() {
        return sectionTitle;
    }

    /**
     * sectionTitle �Ӽ��� ���� �����մϴ�.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSectionTitle(String value) {
        this.sectionTitle = value;
    }

    /**
     * sectionBody �Ӽ��� ���� �����ɴϴ�.
     * 
     * @return
     *     possible object is
     *     {@link SectionBodyType }
     *     
     */
    public SectionBodyType getSectionBody() {
        return sectionBody;
    }

    /**
     * sectionBody �Ӽ��� ���� �����մϴ�.
     * 
     * @param value
     *     allowed object is
     *     {@link SectionBodyType }
     *     
     */
    public void setSectionBody(SectionBodyType value) {
        this.sectionBody = value;
    }

    /**
     * abbreviations �Ӽ��� ���� �����ɴϴ�.
     * 
     * @return
     *     possible object is
     *     {@link SectionBodyType }
     *     
     */
    public SectionBodyType getAbbreviations() {
        return abbreviations;
    }

    /**
     * abbreviations �Ӽ��� ���� �����մϴ�.
     * 
     * @param value
     *     allowed object is
     *     {@link SectionBodyType }
     *     
     */
    public void setAbbreviations(SectionBodyType value) {
        this.abbreviations = value;
    }

    /**
     * synonyms �Ӽ��� ���� �����ɴϴ�.
     * 
     * @return
     *     possible object is
     *     {@link SectionBodyType }
     *     
     */
    public SectionBodyType getSynonyms() {
        return synonyms;
    }

    /**
     * synonyms �Ӽ��� ���� �����մϴ�.
     * 
     * @param value
     *     allowed object is
     *     {@link SectionBodyType }
     *     
     */
    public void setSynonyms(SectionBodyType value) {
        this.synonyms = value;
    }

    /**
     * insteadOfWords �Ӽ��� ���� �����ɴϴ�.
     * 
     * @return
     *     possible object is
     *     {@link SectionBodyType }
     *     
     */
    public SectionBodyType getInsteadOfWords() {
        return insteadOfWords;
    }

    /**
     * insteadOfWords �Ӽ��� ���� �����մϴ�.
     * 
     * @param value
     *     allowed object is
     *     {@link SectionBodyType }
     *     
     */
    public void setInsteadOfWords(SectionBodyType value) {
        this.insteadOfWords = value;
    }

    /**
     * specialMeanings �Ӽ��� ���� �����ɴϴ�.
     * 
     * @return
     *     possible object is
     *     {@link SectionBodyType }
     *     
     */
    public SectionBodyType getSpecialMeanings() {
        return specialMeanings;
    }

    /**
     * specialMeanings �Ӽ��� ���� �����մϴ�.
     * 
     * @param value
     *     allowed object is
     *     {@link SectionBodyType }
     *     
     */
    public void setSpecialMeanings(SectionBodyType value) {
        this.specialMeanings = value;
    }

}
