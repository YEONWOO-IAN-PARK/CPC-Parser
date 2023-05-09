//
// �� ������ JAXB(JavaTM Architecture for XML Binding) ���� ���� 2.2.8-b130911.1802 ������ ���� �����Ǿ����ϴ�. 
// <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>�� �����Ͻʽÿ�. 
// �� ������ �����ϸ� �ҽ� ��Ű���� ���������� �� ���� ������ �սǵ˴ϴ�. 
// ���� ��¥: 2023.05.08 �ð� 11:32:13 AM KST 
//


package net.miso.parser.cpc.vo.def;

import javax.xml.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>table-type complex type�� ���� Java Ŭ�����Դϴ�.
 * 
 * <p>���� ��Ű�� ������ �� Ŭ������ ���ԵǴ� �ʿ��� �������� �����մϴ�.
 * 
 * <pre>
 * &lt;complexType name="table-type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{}table-row" maxOccurs="unbounded"/>
 *         &lt;element ref="{}caption" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="type" type="{}table-category-type" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "table-type", propOrder = {
    "tableRow",
    "caption"
})
public class TableType {

    @XmlElement(name = "table-row", required = true)
    protected List<TableRowType> tableRow;
    protected String caption;
    @XmlAttribute(name = "type")
    protected TableCategoryType type;

    /**
     * Gets the value of the tableRow property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tableRow property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTableRow().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TableRowType }
     * 
     * 
     */
    public List<TableRowType> getTableRow() {
        if (tableRow == null) {
            tableRow = new ArrayList<TableRowType>();
        }
        return this.tableRow;
    }

    /**
     * caption �Ӽ��� ���� �����ɴϴ�.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCaption() {
        return caption;
    }

    /**
     * caption �Ӽ��� ���� �����մϴ�.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCaption(String value) {
        this.caption = value;
    }

    /**
     * type �Ӽ��� ���� �����ɴϴ�.
     * 
     * @return
     *     possible object is
     *     {@link TableCategoryType }
     *     
     */
    public TableCategoryType getType() {
        return type;
    }

    /**
     * type �Ӽ��� ���� �����մϴ�.
     * 
     * @param value
     *     allowed object is
     *     {@link TableCategoryType }
     *     
     */
    public void setType(TableCategoryType value) {
        this.type = value;
    }

}
