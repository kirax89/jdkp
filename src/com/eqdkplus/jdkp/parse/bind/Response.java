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
 *         &lt;element ref="{}eqdkp" minOccurs="0"/>
 *         &lt;element ref="{}game" minOccurs="0"/>
 *         &lt;element ref="{}info" minOccurs="0"/>
 *         &lt;element ref="{}players" minOccurs="0"/>
 *         &lt;element ref="{}multidkp_pools" minOccurs="0"/>
 *         &lt;element ref="{}itempools" minOccurs="0"/>
 *         &lt;element ref="{}status"/>
 *         &lt;element ref="{}error" minOccurs="0"/>
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
    "eqdkp",
    "game",
    "info",
    "players",
    "multidkpPools",
    "itempools",
    "status",
    "error"
})
@XmlRootElement(name = "response")
public class Response {

    protected Eqdkp eqdkp;
    protected Game game;
    protected Info info;
    protected Players players;
    @XmlElement(name = "multidkp_pools")
    protected MultidkpPools multidkpPools;
    protected Itempools itempools;
    @XmlElement(required = true)
    protected String status;
    protected String error;

    /**
     * Gets the value of the eqdkp property.
     * 
     * @return
     *     possible object is
     *     {@link Eqdkp }
     *     
     */
    public Eqdkp getEqdkp() {
        return eqdkp;
    }

    /**
     * Sets the value of the eqdkp property.
     * 
     * @param value
     *     allowed object is
     *     {@link Eqdkp }
     *     
     */
    public void setEqdkp(Eqdkp value) {
        this.eqdkp = value;
    }

    /**
     * Gets the value of the game property.
     * 
     * @return
     *     possible object is
     *     {@link Game }
     *     
     */
    public Game getGame() {
        return game;
    }

    /**
     * Sets the value of the game property.
     * 
     * @param value
     *     allowed object is
     *     {@link Game }
     *     
     */
    public void setGame(Game value) {
        this.game = value;
    }

    /**
     * Gets the value of the info property.
     * 
     * @return
     *     possible object is
     *     {@link Info }
     *     
     */
    public Info getInfo() {
        return info;
    }

    /**
     * Sets the value of the info property.
     * 
     * @param value
     *     allowed object is
     *     {@link Info }
     *     
     */
    public void setInfo(Info value) {
        this.info = value;
    }

    /**
     * Gets the value of the players property.
     * 
     * @return
     *     possible object is
     *     {@link Players }
     *     
     */
    public Players getPlayers() {
        return players;
    }

    /**
     * Sets the value of the players property.
     * 
     * @param value
     *     allowed object is
     *     {@link Players }
     *     
     */
    public void setPlayers(Players value) {
        this.players = value;
    }

    /**
     * Gets the value of the multidkpPools property.
     * 
     * @return
     *     possible object is
     *     {@link MultidkpPools }
     *     
     */
    public MultidkpPools getMultidkpPools() {
        return multidkpPools;
    }

    /**
     * Sets the value of the multidkpPools property.
     * 
     * @param value
     *     allowed object is
     *     {@link MultidkpPools }
     *     
     */
    public void setMultidkpPools(MultidkpPools value) {
        this.multidkpPools = value;
    }

    /**
     * Gets the value of the itempools property.
     * 
     * @return
     *     possible object is
     *     {@link Itempools }
     *     
     */
    public Itempools getItempools() {
        return itempools;
    }

    /**
     * Sets the value of the itempools property.
     * 
     * @param value
     *     allowed object is
     *     {@link Itempools }
     *     
     */
    public void setItempools(Itempools value) {
        this.itempools = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatus(String value) {
        this.status = value;
    }

    /**
     * Gets the value of the error property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getError() {
        return error;
    }

    /**
     * Sets the value of the error property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setError(String value) {
        this.error = value;
    }

}
