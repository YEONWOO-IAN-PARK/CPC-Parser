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
 * <p>section-body-type complex type�� ���� Java Ŭ�����Դϴ�.
 * 
 * <p>���� ��Ű�� ������ �� Ŭ������ ���ԵǴ� �ʿ��� �������� �����մϴ�.
 * 
 * <pre>
 * &lt;complexType name="section-body-type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice maxOccurs="unbounded">
 *         &lt;element ref="{}paragraph-text"/>
 *         &lt;element ref="{}list"/>
 *         &lt;element ref="{}table"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "section-body-type", propOrder = {
    "paragraphTextOrListOrTable"
})
public class SectionBodyType {

    @XmlElements({
        @XmlElement(name = "paragraph-text", type = ParagraphTextType.class),
        @XmlElement(name = "list", type = ListType.class),
        @XmlElement(name = "table", type = TableType.class)
    })
    protected List<Object> paragraphTextOrListOrTable;

    /**
     * Gets the value of the paragraphTextOrListOrTable property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the paragraphTextOrListOrTable property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getParagraphTextOrListOrTable().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ParagraphTextType }
     * {@link ListType }
     * {@link TableType }
     * 
     * 
     */
    public List<Object> getParagraphTextOrListOrTable() {
        if (paragraphTextOrListOrTable == null) {
            paragraphTextOrListOrTable = new ArrayList<Object>();
        }
        return this.paragraphTextOrListOrTable;
    }

}
