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
 * <p>references-type complex type�� ���� Java Ŭ�����Դϴ�.
 * 
 * <p>���� ��Ű�� ������ �� Ŭ������ ���ԵǴ� �ʿ��� �������� �����մϴ�.
 * 
 * <pre>
 * &lt;complexType name="references-type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{}section-title"/>
 *         &lt;element ref="{}limiting-references" minOccurs="0"/>
 *         &lt;element ref="{}application-references" minOccurs="0"/>
 *         &lt;element ref="{}residual-references" minOccurs="0"/>
 *         &lt;element ref="{}informative-references" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "references-type", propOrder = {
    "sectionTitle",
    "limitingReferences",
    "applicationReferences",
    "residualReferences",
    "informativeReferences"
})
public class ReferencesType {

    @XmlElement(name = "section-title", required = true)
    protected String sectionTitle;
    @XmlElement(name = "limiting-references")
    protected SectionType limitingReferences;
    @XmlElement(name = "application-references")
    protected SectionType applicationReferences;
    @XmlElement(name = "residual-references")
    protected SectionType residualReferences;
    @XmlElement(name = "informative-references")
    protected SectionType informativeReferences;

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
     * limitingReferences �Ӽ��� ���� �����ɴϴ�.
     * 
     * @return
     *     possible object is
     *     {@link SectionType }
     *     
     */
    public SectionType getLimitingReferences() {
        return limitingReferences;
    }

    /**
     * limitingReferences �Ӽ��� ���� �����մϴ�.
     * 
     * @param value
     *     allowed object is
     *     {@link SectionType }
     *     
     */
    public void setLimitingReferences(SectionType value) {
        this.limitingReferences = value;
    }

    /**
     * applicationReferences �Ӽ��� ���� �����ɴϴ�.
     * 
     * @return
     *     possible object is
     *     {@link SectionType }
     *     
     */
    public SectionType getApplicationReferences() {
        return applicationReferences;
    }

    /**
     * applicationReferences �Ӽ��� ���� �����մϴ�.
     * 
     * @param value
     *     allowed object is
     *     {@link SectionType }
     *     
     */
    public void setApplicationReferences(SectionType value) {
        this.applicationReferences = value;
    }

    /**
     * residualReferences �Ӽ��� ���� �����ɴϴ�.
     * 
     * @return
     *     possible object is
     *     {@link SectionType }
     *     
     */
    public SectionType getResidualReferences() {
        return residualReferences;
    }

    /**
     * residualReferences �Ӽ��� ���� �����մϴ�.
     * 
     * @param value
     *     allowed object is
     *     {@link SectionType }
     *     
     */
    public void setResidualReferences(SectionType value) {
        this.residualReferences = value;
    }

    /**
     * informativeReferences �Ӽ��� ���� �����ɴϴ�.
     * 
     * @return
     *     possible object is
     *     {@link SectionType }
     *     
     */
    public SectionType getInformativeReferences() {
        return informativeReferences;
    }

    /**
     * informativeReferences �Ӽ��� ���� �����մϴ�.
     * 
     * @param value
     *     allowed object is
     *     {@link SectionType }
     *     
     */
    public void setInformativeReferences(SectionType value) {
        this.informativeReferences = value;
    }

}
