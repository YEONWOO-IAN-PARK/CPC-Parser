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
 * <p>media-extension-category-type�� ���� Java Ŭ�����Դϴ�.
 * 
 * <p>���� ��Ű�� ������ �� Ŭ������ ���ԵǴ� �ʿ��� �������� �����մϴ�.
 * <p>
 * <pre>
 * &lt;simpleType name="media-extension-category-type">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="gif"/>
 *     &lt;enumeration value="jpeg"/>
 *     &lt;enumeration value="tif"/>
 *     &lt;enumeration value="bmp"/>
 *     &lt;enumeration value="png"/>
 *     &lt;enumeration value="wav"/>
 *     &lt;enumeration value="wma"/>
 *     &lt;enumeration value="wmv"/>
 *     &lt;enumeration value="mp3"/>
 *     &lt;enumeration value="unknown"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "media-extension-category-type")
@XmlEnum
public enum MediaExtensionCategoryType {

    @XmlEnumValue("gif")
    GIF("gif"),
    @XmlEnumValue("jpeg")
    JPEG("jpeg"),
    @XmlEnumValue("tif")
    TIF("tif"),
    @XmlEnumValue("bmp")
    BMP("bmp"),
    @XmlEnumValue("png")
    PNG("png"),
    @XmlEnumValue("wav")
    WAV("wav"),
    @XmlEnumValue("wma")
    WMA("wma"),
    @XmlEnumValue("wmv")
    WMV("wmv"),
    @XmlEnumValue("mp3")
    MP_3("mp3"),
    @XmlEnumValue("unknown")
    UNKNOWN("unknown");
    private final String value;

    MediaExtensionCategoryType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static MediaExtensionCategoryType fromValue(String v) {
        for (MediaExtensionCategoryType c: MediaExtensionCategoryType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
