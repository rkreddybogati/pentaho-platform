//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.01.11 at 01:58:33 PM EST 
//


package org.pentaho.platform.repository2.unified.exportManifest.bindings;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ExportManifestDto complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ExportManifestDto">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ExportManifestInformation">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="exportDate" type="{http://www.w3.org/2001/XMLSchema}string" default="{date}" />
 *                 &lt;attribute name="exportBy" type="{http://www.w3.org/2001/XMLSchema}string" default="{user}" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="ExportManifestEntity" type="{http://www.example.org/ExportManifest/}ExportManifestEntityDto" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExportManifestDto", propOrder = {
    "exportManifestInformation",
    "exportManifestEntity"
})
public class ExportManifestDto {

    @XmlElement(name = "ExportManifestInformation", required = true)
    protected ExportManifestDto.ExportManifestInformation exportManifestInformation;
    @XmlElement(name = "ExportManifestEntity", required = true)
    protected List<ExportManifestEntityDto> exportManifestEntity;

    /**
     * Gets the value of the exportManifestInformation property.
     * 
     * @return
     *     possible object is
     *     {@link ExportManifestDto.ExportManifestInformation }
     *     
     */
    public ExportManifestDto.ExportManifestInformation getExportManifestInformation() {
        return exportManifestInformation;
    }

    /**
     * Sets the value of the exportManifestInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExportManifestDto.ExportManifestInformation }
     *     
     */
    public void setExportManifestInformation(ExportManifestDto.ExportManifestInformation value) {
        this.exportManifestInformation = value;
    }

    /**
     * Gets the value of the exportManifestEntity property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the exportManifestEntity property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getExportManifestEntity().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ExportManifestEntityDto }
     * 
     * 
     */
    public List<ExportManifestEntityDto> getExportManifestEntity() {
        if (exportManifestEntity == null) {
            exportManifestEntity = new ArrayList<ExportManifestEntityDto>();
        }
        return this.exportManifestEntity;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;attribute name="exportDate" type="{http://www.w3.org/2001/XMLSchema}string" default="{date}" />
     *       &lt;attribute name="exportBy" type="{http://www.w3.org/2001/XMLSchema}string" default="{user}" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class ExportManifestInformation {

        @XmlAttribute
        protected String exportDate;
        @XmlAttribute
        protected String exportBy;

        /**
         * Gets the value of the exportDate property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getExportDate() {
            if (exportDate == null) {
                return "{date}";
            } else {
                return exportDate;
            }
        }

        /**
         * Sets the value of the exportDate property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setExportDate(String value) {
            this.exportDate = value;
        }

        /**
         * Gets the value of the exportBy property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getExportBy() {
            if (exportBy == null) {
                return "{user}";
            } else {
                return exportBy;
            }
        }

        /**
         * Sets the value of the exportBy property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setExportBy(String value) {
            this.exportBy = value;
        }

    }

}
