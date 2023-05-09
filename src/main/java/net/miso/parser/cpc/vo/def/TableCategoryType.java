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
 * <p>table-category-type�� ���� Java Ŭ�����Դϴ�.
 * 
 * <p>���� ��Ű�� ������ �� Ŭ������ ���ԵǴ� �ʿ��� �������� �����մϴ�.
 * <p>
 * <pre>
 * &lt;simpleType name="table-category-type">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="limiting-references-table"/>
 *     &lt;enumeration value="informative-references-table"/>
 *     &lt;enumeration value="glossary-table"/>
 *     &lt;enumeration value="synonyms-table"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "table-category-type")
@XmlEnum
public enum TableCategoryType {

    @XmlEnumValue("limiting-references-table")
    LIMITING_REFERENCES_TABLE("limiting-references-table"),
    @XmlEnumValue("informative-references-table")
    INFORMATIVE_REFERENCES_TABLE("informative-references-table"),
    @XmlEnumValue("glossary-table")
    GLOSSARY_TABLE("glossary-table"),
    @XmlEnumValue("synonyms-table")
    SYNONYMS_TABLE("synonyms-table");
    private final String value;

    TableCategoryType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TableCategoryType fromValue(String v) {
        for (TableCategoryType c: TableCategoryType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
