//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.3u2-hudson-jaxb-ri-2.2.3-4- 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.04.29 at 11:58:36 AM MESZ 
//


package com.eqdkplus.jdkp.parse.bind;

import java.util.ArrayList;
import java.util.List;
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
 *         &lt;element ref="{}multidkp_pool" maxOccurs="unbounded" minOccurs="0"/>
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
    "multidkpPool"
})
@XmlRootElement(name = "multidkp_pools")
public class MultidkpPools {

    @XmlElement(name = "multidkp_pool")
    protected List<MultidkpPool> multidkpPool;

    /**
     * Gets the value of the multidkpPool property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the multidkpPool property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMultidkpPool().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MultidkpPool }
     * 
     * 
     */
    public List<MultidkpPool> getMultidkpPool() {
        if (multidkpPool == null) {
            multidkpPool = new ArrayList<MultidkpPool>();
        }
        return this.multidkpPool;
    }

}
