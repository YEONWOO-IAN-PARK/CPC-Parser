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


/**
 * <p>classification-item-type complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="classification-item-type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{}classification-symbol"/>
 *         &lt;element ref="{}class-title" minOccurs="0"/>
 *         &lt;element ref="{}notes-and-warnings" minOccurs="0"/>
 *         &lt;element ref="{}classification-item" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}meta-data" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute ref="{}level use="required""/>
 *       &lt;attribute ref="{}additional-only default="false""/>
 *       &lt;attribute ref="{}sort-key use="required""/>
 *       &lt;attribute ref="{}not-allocatable default="false""/>
 *       &lt;attribute ref="{}breakdown-code default="false""/>
 *       &lt;attribute ref="{}date-revised"/>
 *       &lt;attribute ref="{}status use="required""/>
 *       &lt;attribute ref="{}link-file"/>
 *       &lt;attribute ref="{}ipc-concordant"/>
 *       &lt;attribute ref="{}definition-exists"/>
 *       &lt;attribute ref="{}c-set-base-allowed"/>
 *       &lt;attribute ref="{}c-set-subsequent-allowed"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "classification-item-type", propOrder = {
    "classificationSymbol",
    "classTitle",
    "notesAndWarnings",
    "classificationItem",
    "metaData"
})
@ToString
public class ClassificationItemType {

    @XmlElement(name = "classification-symbol", required = true)
    protected String classificationSymbol;
    @XmlElement(name = "class-title")
    protected ClassTitleType classTitle;
    @XmlElement(name = "notes-and-warnings")
    protected NotesAndWarningsType notesAndWarnings;
    @XmlElement(name = "classification-item")
    protected List<ClassificationItemType> classificationItem;
    @XmlElement(name = "meta-data")
    protected String metaData;
    @XmlAttribute(name = "level", required = true)
    protected int level;
    @XmlAttribute(name = "additional-only")
    protected Boolean additionalOnly;
    @XmlAttribute(name = "sort-key", required = true)
    protected String sortKey;
    @XmlAttribute(name = "not-allocatable")
    protected Boolean notAllocatable;
    @XmlAttribute(name = "breakdown-code")
    protected Boolean breakdownCode;
    @XmlAttribute(name = "date-revised")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dateRevised;
    @XmlAttribute(name = "status", required = true)
    protected CpcStatusCategoryType status;
    @XmlAttribute(name = "link-file")
    protected String linkFile;
    @XmlAttribute(name = "ipc-concordant")
    protected String ipcConcordant;
    @XmlAttribute(name = "definition-exists")
    protected Boolean definitionExists;
    @XmlAttribute(name = "c-set-base-allowed")
    protected Boolean cSetBaseAllowed;
    @XmlAttribute(name = "c-set-subsequent-allowed")
    protected Boolean cSetSubsequentAllowed;

    /**
     * classificationSymbol 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClassificationSymbol() {
        if(classificationSymbol == null) {
            return "";
        } else {
            return classificationSymbol;
        }
    }

    /**
     * classificationSymbol 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClassificationSymbol(String value) {
        this.classificationSymbol = value;
    }

    /**
     * classTitle 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link ClassTitleType }
     *     
     */
    public ClassTitleType getClassTitle() {
        return classTitle;
    }

    /**
     * classTitle 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link ClassTitleType }
     *     
     */
    public void setClassTitle(ClassTitleType value) {
        this.classTitle = value;
    }

    /**
     * notesAndWarnings 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link NotesAndWarningsType }
     *     
     */
    public NotesAndWarningsType getNotesAndWarnings() {
        return notesAndWarnings;
    }

    /**
     * notesAndWarnings 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link NotesAndWarningsType }
     *     
     */
    public void setNotesAndWarnings(NotesAndWarningsType value) {
        this.notesAndWarnings = value;
    }

    /**
     * Gets the value of the classificationItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the classificationItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getClassificationItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ClassificationItemType }
     * 
     * 
     */
    public List<ClassificationItemType> getClassificationItem() {
        if (classificationItem == null) {
            classificationItem = new ArrayList<ClassificationItemType>();
        }
        return this.classificationItem;
    }

    /**
     * metaData 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMetaData() {
        return metaData;
    }

    /**
     * metaData 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMetaData(String value) {
        this.metaData = value;
    }

    /**
     * level 속성의 값을 가져옵니다.
     * 
     */
    public int getLevel() {
        return level;
    }

    /**
     * level 속성의 값을 설정합니다.
     * 
     */
    public void setLevel(int value) {
        this.level = value;
    }

    /**
     * additionalOnly 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isAdditionalOnly() {
        if (additionalOnly == null) {
            return false;
        } else {
            return additionalOnly;
        }
    }

    /**
     * additionalOnly 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAdditionalOnly(Boolean value) {
        this.additionalOnly = value;
    }

    /**
     * sortKey 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSortKey() {
        return sortKey;
    }

    /**
     * sortKey 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSortKey(String value) {
        this.sortKey = value;
    }

    /**
     * notAllocatable 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isNotAllocatable() {
        if (notAllocatable == null) {
            return false;
        } else {
            return notAllocatable;
        }
    }

    /**
     * notAllocatable 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setNotAllocatable(Boolean value) {
        this.notAllocatable = value;
    }

    /**
     * breakdownCode 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isBreakdownCode() {
        if (breakdownCode == null) {
            return false;
        } else {
            return breakdownCode;
        }
    }

    /**
     * breakdownCode 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBreakdownCode(Boolean value) {
        this.breakdownCode = value;
    }

    /**
     * dateRevised 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateRevised() {
        return dateRevised;
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

    /**
     * status 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link CpcStatusCategoryType }
     *     
     */
    public CpcStatusCategoryType getStatus() {
        return status;
    }

    /**
     * status 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link CpcStatusCategoryType }
     *     
     */
    public void setStatus(CpcStatusCategoryType value) {
        this.status = value;
    }

    /**
     * linkFile 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLinkFile() {
        return linkFile;
    }

    /**
     * linkFile 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLinkFile(String value) {
        this.linkFile = value;
    }

    /**
     * ipcConcordant 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIpcConcordant() {
        return ipcConcordant;
    }

    /**
     * ipcConcordant 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIpcConcordant(String value) {
        this.ipcConcordant = value;
    }

    /**
     * definitionExists 속성의 값을 가져옵니다.
     *
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDefinitionExists() {
        return definitionExists;
    }

    /**
     * definitionExists 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDefinitionExists(Boolean value) {
        this.definitionExists = value;
    }

    /**
     * cSetBaseAllowed 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCSetBaseAllowed() {
        return cSetBaseAllowed;
    }

    /**
     * cSetBaseAllowed 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCSetBaseAllowed(Boolean value) {
        this.cSetBaseAllowed = value;
    }

    /**
     * cSetSubsequentAllowed 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCSetSubsequentAllowed() {
        return cSetSubsequentAllowed;
    }

    /**
     * cSetSubsequentAllowed 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCSetSubsequentAllowed(Boolean value) {
        this.cSetSubsequentAllowed = value;
    }

}
