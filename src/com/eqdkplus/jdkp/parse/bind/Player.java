//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.3u2-hudson-jaxb-ri-2.2.3-4- 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.04.29 at 11:58:36 AM MESZ 
//


package com.eqdkplus.jdkp.parse.bind;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{}id"/>
 *         &lt;element ref="{}name"/>
 *         &lt;element ref="{}active"/>
 *         &lt;element ref="{}hidden"/>
 *         &lt;element ref="{}main_id"/>
 *         &lt;element ref="{}main_name"/>
 *         &lt;element ref="{}class_id"/>
 *         &lt;element ref="{}class_name"/>
 *         &lt;element ref="{}race_id" minOccurs="0"/>
 *         &lt;element ref="{}race_name" minOccurs="0"/>
 *         &lt;element ref="{}points"/>
 *         &lt;element ref="{}items"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "id",
    "name",
    "active",
    "hidden",
    "mainId",
    "mainName",
    "classId",
    "className",
    "raceId",
    "raceName",
    "points",
    "items"
})
@XmlRootElement(name = "player")
public class Player {

    protected int id;
    @XmlElement(required = true)
    protected String name;
    protected int active;
    protected int hidden;
    @XmlElement(name = "main_id")
    protected int mainId;
    @XmlElement(name = "main_name", required = true)
    protected String mainName;
    @XmlElement(name = "class_id")
    protected int classId;
    @XmlElement(name = "class_name", required = true)
    protected String className;
    @XmlElement(name = "race_id")
    protected Integer raceId;
    @XmlElement(name = "race_name")
    protected String raceName;
    @XmlElement(required = true)
    protected Points points;
    @XmlElement(required = true)
    protected Items items;

    /**
     * Gets the value of the id property.
     * 
     */
    public int getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     */
    public void setId(int value) {
        this.id = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the active property.
     * 
     */
    public int getActive() {
        return active;
    }

    /**
     * Sets the value of the active property.
     * 
     */
    public void setActive(int value) {
        this.active = value;
    }

    /**
     * Gets the value of the hidden property.
     * 
     */
    public int getHidden() {
        return hidden;
    }

    /**
     * Sets the value of the hidden property.
     * 
     */
    public void setHidden(int value) {
        this.hidden = value;
    }

    /**
     * Gets the value of the mainId property.
     * 
     */
    public int getMainId() {
        return mainId;
    }

    /**
     * Sets the value of the mainId property.
     * 
     */
    public void setMainId(int value) {
        this.mainId = value;
    }

    /**
     * Gets the value of the mainName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMainName() {
        return mainName;
    }

    /**
     * Sets the value of the mainName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMainName(String value) {
        this.mainName = value;
    }

    /**
     * Gets the value of the classId property.
     * 
     */
    public int getClassId() {
        return classId;
    }

    /**
     * Sets the value of the classId property.
     * 
     */
    public void setClassId(int value) {
        this.classId = value;
    }

    /**
     * Gets the value of the className property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClassName() {
        return className;
    }

    /**
     * Sets the value of the className property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClassName(String value) {
        this.className = value;
    }

    /**
     * Gets the value of the raceId property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getRaceId() {
        return raceId;
    }

    /**
     * Sets the value of the raceId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setRaceId(Integer value) {
        this.raceId = value;
    }

    /**
     * Gets the value of the raceName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRaceName() {
        return raceName;
    }

    /**
     * Sets the value of the raceName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRaceName(String value) {
        this.raceName = value;
    }

    /**
     * Gets the value of the points property.
     * 
     * @return
     *     possible object is
     *     {@link Points }
     *     
     */
    public Points getPoints() {
        return points;
    }

    /**
     * Sets the value of the points property.
     * 
     * @param value
     *     allowed object is
     *     {@link Points }
     *     
     */
    public void setPoints(Points value) {
        this.points = value;
    }

    /**
     * Gets the value of the items property.
     * 
     * @return
     *     possible object is
     *     {@link Items }
     *     
     */
    public Items getItems() {
        return items;
    }

    /**
     * Sets the value of the items property.
     * 
     * @param value
     *     allowed object is
     *     {@link Items }
     *     
     */
    public void setItems(Items value) {
        this.items = value;
    }

}
