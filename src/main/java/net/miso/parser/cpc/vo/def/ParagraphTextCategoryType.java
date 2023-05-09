//
// �� ������ JAXB(JavaTM Architecture for XML Binding) ���� ���� 2.2.8-b130911.1802 ������ ���� �����Ǿ����ϴ�. 
// <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>�� �����Ͻʽÿ�. 
// �� ������ �����ϸ� �ҽ� ��Ű���� ���������� �� ���� ������ �սǵ˴ϴ�. 
// ���� ��¥: 2023.05.08 �ð� 11:32:13 AM KST 
//


package net.miso.parser.cpc.vo.def;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>paragraph-text-category-type�� ���� Java Ŭ�����Դϴ�.
 * 
 * <p>���� ��Ű�� ������ �� Ŭ������ ���ԵǴ� �ʿ��� �������� �����մϴ�.
 * <p>
 * <pre>
 * &lt;simpleType name="paragraph-text-category-type">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="body"/>
 *     &lt;enumeration value="preamble"/>
 *     &lt;enumeration value="subheading"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "paragraph-text-category-type")
@XmlEnum
public enum ParagraphTextCategoryType {

    @XmlEnumValue("body")
    BODY("body"),
    @XmlEnumValue("preamble")
    PREAMBLE("preamble"),
    @XmlEnumValue("subheading")
    SUBHEADING("subheading");
    private final String value;

    ParagraphTextCategoryType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ParagraphTextCategoryType fromValue(String v) {
        for (ParagraphTextCategoryType c: ParagraphTextCategoryType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
