//
// 이 파일은 JAXB(JavaTM Architecture for XML Binding) 참조 구현 2.2.8-b130911.1802 버전을 통해 생성되었습니다. 
// <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>를 참조하십시오. 
// 이 파일을 수정하면 소스 스키마를 재컴파일할 때 수정 사항이 손실됩니다. 
// 생성 날짜: 2023.04.04 시간 05:11:50 PM KST 
//


package net.miso.parser.cpc.vo;

import lombok.ToString;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;


/**
 * Markup potentially contained within elements such as title, warning and notes etc.
 * 
 * <p>markup complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="markup">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice maxOccurs="unbounded" minOccurs="0">
 *         &lt;element ref="{}text"/>
 *         &lt;element ref="{}reference"/>
 *         &lt;element ref="{}CPC-specific-text"/>
 *         &lt;element ref="{}class-ref"/>
 *         &lt;element ref="{}u"/>
 *         &lt;element ref="{}media"/>
 *         &lt;element ref="{}sub"/>
 *         &lt;element ref="{}sup"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "markup", propOrder = {
    "content"
})
@ToString
public class Markup {

    @XmlElementRefs({
        @XmlElementRef(name = "reference", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "u", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "media", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "sub", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "text", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "sup", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "class-ref", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "CPC-specific-text", type = JAXBElement.class, required = false)
    })
    @XmlMixed
    protected List<Serializable> content;

    /**
     * Markup potentially contained within elements such as title, warning and notes etc.Gets the value of the content property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the content property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContent().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link Markup }{@code >}
     * {@link String }
     * {@link JAXBElement }{@code <}{@link UType }{@code >}
     * {@link JAXBElement }{@code <}{@link MediaType }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link Markup }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link ClassRefType }{@code >}
     * {@link JAXBElement }{@code <}{@link Markup }{@code >}
     * 
     * 
     */
    public List<Serializable> getContent() {
        if (content == null) {
            content = new ArrayList<Serializable>();
        }
        return this.content;
    }

}
