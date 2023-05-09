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
 * <p>cpc-scheme-category-type�� ���� Java Ŭ�����Դϴ�.
 * 
 * <p>���� ��Ű�� ������ �� Ŭ������ ���ԵǴ� �ʿ��� �������� �����մϴ�.
 * <p>
 * <pre>
 * &lt;simpleType name="cpc-scheme-category-type">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="cpc"/>
 *     &lt;enumeration value="not-mapped"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "cpc-scheme-category-type")
@XmlEnum
public enum CpcSchemeCategoryType {

    @XmlEnumValue("cpc")
    CPC("cpc"),
    @XmlEnumValue("not-mapped")
    NOT_MAPPED("not-mapped");
    private final String value;

    CpcSchemeCategoryType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CpcSchemeCategoryType fromValue(String v) {
        for (CpcSchemeCategoryType c: CpcSchemeCategoryType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
