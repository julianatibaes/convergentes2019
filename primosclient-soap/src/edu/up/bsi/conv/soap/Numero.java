
package edu.up.bsi.conv.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for numero complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="numero">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="valorInicial" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="quantidade" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "numero", propOrder = {
    "valorInicial",
    "quantidade"
})
public class Numero {

    protected int valorInicial;
    protected int quantidade;

    /**
     * Gets the value of the valorInicial property.
     * 
     */
    public int getValorInicial() {
        return valorInicial;
    }

    /**
     * Sets the value of the valorInicial property.
     * 
     */
    public void setValorInicial(int value) {
        this.valorInicial = value;
    }

    /**
     * Gets the value of the quantidade property.
     * 
     */
    public int getQuantidade() {
        return quantidade;
    }

    /**
     * Sets the value of the quantidade property.
     * 
     */
    public void setQuantidade(int value) {
        this.quantidade = value;
    }

}
