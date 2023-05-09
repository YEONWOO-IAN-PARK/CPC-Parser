//
// 이 파일은 JAXB(JavaTM Architecture for XML Binding) 참조 구현 2.2.8-b130911.1802 버전을 통해 생성되었습니다. 
// <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>를 참조하십시오. 
// 이 파일을 수정하면 소스 스키마를 재컴파일할 때 수정 사항이 손실됩니다. 
// 생성 날짜: 2023.04.04 시간 05:11:50 PM KST 
//


package net.miso.parser.cpc.vo;

import lombok.ToString;

import javax.xml.bind.annotation.*;
import javax.xml.datatype.XMLGregorianCalendar;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;


/**
 * <p>class-title-type complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="class-title-type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{}title-part" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute ref="{}date-revised"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "class-title-type", propOrder = {
    "titlePart"
})
@ToString
public class ClassTitleType {

    @XmlElement(name = "title-part")
    protected List<TitlePartType> titlePart;
    @XmlAttribute(name = "date-revised")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dateRevised;

    /**
     * Gets the value of the titlePart property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the titlePart property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTitlePart().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TitlePartType }
     * 
     * 
     */
    public List<TitlePartType> getTitlePart() {
        if (titlePart == null) {
            titlePart = new ArrayList<TitlePartType>();
        }
        return this.titlePart;
    }

    /**
     * dateRevised 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public Optional<XMLGregorianCalendar> getDateRevised() {
        return Optional.ofNullable(dateRevised);
    }

    /**
     * dateRevised 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateRevised(XMLGregorianCalendar value) {
        this.dateRevised = value;
    }

}
