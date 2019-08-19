
package edu.up.bsi.conv.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for acha_primos complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="acha_primos">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="numero" type="{http://soap.conv.bsi.up.edu/}numero" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "acha_primos", propOrder = {
    "numero"
})
public class AchaPrimos {

    protected Numero numero;

    /**
     * Gets the value of the numero property.
     * 
     * @return
     *     possible object is
     *     {@link Numero }
     *     
     */
    public Numero getNumero() {
        return numero;
    }

    /**
     * Sets the value of the numero property.
     * 
     * @param value
     *     allowed object is
     *     {@link Numero }
     *     
     */
    public void setNumero(Numero value) {
        this.numero = value;
    }

}
