//
// �� ������ JAXB(JavaTM Architecture for XML Binding) ���� ���� 2.2.8-b130911.1802 ������ ���� �����Ǿ����ϴ�. 
// <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>�� �����Ͻʽÿ�. 
// �� ������ �����ϸ� �ҽ� ��Ű���� ���������� �� ���� ������ �սǵ˴ϴ�. 
// ���� ��¥: 2023.05.08 �ð� 11:32:13 AM KST 
//


package net.miso.parser.cpc.vo.def;

import javax.xml.bind.annotation.*;
import javax.xml.datatype.XMLGregorianCalendar;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>definitions-type complex type�� ���� Java Ŭ�����Դϴ�.
 * 
 * <p>���� ��Ű�� ������ �� Ŭ������ ���ԵǴ� �ʿ��� �������� �����մϴ�.
 * 
 * <pre>
 * &lt;complexType name="definitions-type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{}definition-item" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *       &lt;attribute ref="{}publication-date use="required""/>
 *       &lt;attribute ref="{}publication-type use="required""/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "definitions-type", propOrder = {
    "definitionItem"
})
public class DefinitionsType {

    @XmlElement(name = "definition-item", required = true)
    protected List<DefinitionItemType> definitionItem;
    @XmlAttribute(name = "publication-date", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar publicationDate;
    @XmlAttribute(name = "publication-type", required = true)
    protected PublicationCategoryType publicationType;

    /**
     * Gets the value of the definitionItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the definitionItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDefinitionItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DefinitionItemType }
     * 
     * 
     */
    public List<DefinitionItemType> getDefinitionItem() {
        if (definitionItem == null) {
            definitionItem = new ArrayList<DefinitionItemType>();
        }
        return this.definitionItem;
    }

    /**
     * publicationDate �Ӽ��� ���� �����ɴϴ�.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPublicationDate() {
        return publicationDate;
    }

    /**
     * publicationDate �Ӽ��� ���� �����մϴ�.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPublicationDate(XMLGregorianCalendar value) {
        this.publicationDate = value;
    }

    /**
     * publicationType �Ӽ��� ���� �����ɴϴ�.
     * 
     * @return
     *     possible object is
     *     {@link PublicationCategoryType }
     *     
     */
    public PublicationCategoryType getPublicationType() {
        return publicationType;
    }

    /**
     * publicationType �Ӽ��� ���� �����մϴ�.
     * 
     * @param value
     *     allowed object is
     *     {@link PublicationCategoryType }
     *     
     */
    public void setPublicationType(PublicationCategoryType value) {
        this.publicationType = value;
    }

}
