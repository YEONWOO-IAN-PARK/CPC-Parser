//
// �� ������ JAXB(JavaTM Architecture for XML Binding) ���� ���� 2.2.8-b130911.1802 ������ ���� �����Ǿ����ϴ�. 
// <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>�� �����Ͻʽÿ�. 
// �� ������ �����ϸ� �ҽ� ��Ű���� ���������� �� ���� ������ �սǵ˴ϴ�. 
// ���� ��¥: 2023.05.08 �ð� 11:32:13 AM KST 
//


package net.miso.parser.cpc.vo.def;

import javax.xml.bind.annotation.*;


/**
 * <p>table-column-type complex type�� ���� Java Ŭ�����Դϴ�.
 * 
 * <p>���� ��Ű�� ������ �� Ŭ������ ���ԵǴ� �ʿ��� �������� �����մϴ�.
 * 
 * <pre>
 * &lt;complexType name="table-column-type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{}paragraph-text"/>
 *       &lt;/sequence>
 *       &lt;attribute ref="{}preferred-width"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "table-column-type", propOrder = {
    "paragraphText"
})
public class TableColumnType {

    @XmlElement(name = "paragraph-text", required = true)
    protected ParagraphTextType paragraphText;
    @XmlAttribute(name = "preferred-width")
    protected String preferredWidth;

    /**
     * paragraphText �Ӽ��� ���� �����ɴϴ�.
     * 
     * @return
     *     possible object is
     *     {@link ParagraphTextType }
     *     
     */
    public ParagraphTextType getParagraphText() {
        return paragraphText;
    }

    /**
     * paragraphText �Ӽ��� ���� �����մϴ�.
     * 
     * @param value
     *     allowed object is
     *     {@link ParagraphTextType }
     *     
     */
    public void setParagraphText(ParagraphTextType value) {
        this.paragraphText = value;
    }

    /**
     * preferredWidth �Ӽ��� ���� �����ɴϴ�.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPreferredWidth() {
        return preferredWidth;
    }

    /**
     * preferredWidth �Ӽ��� ���� �����մϴ�.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPreferredWidth(String value) {
        this.preferredWidth = value;
    }

}
