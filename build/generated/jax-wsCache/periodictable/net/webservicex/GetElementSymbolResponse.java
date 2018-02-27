
package net.webservicex;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para anonymous complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="GetElementSymbolResult" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "getElementSymbolResult"
})
@XmlRootElement(name = "GetElementSymbolResponse")
public class GetElementSymbolResponse {

    @XmlElement(name = "GetElementSymbolResult")
    protected String getElementSymbolResult;

    /**
     * Obtiene el valor de la propiedad getElementSymbolResult.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGetElementSymbolResult() {
        return getElementSymbolResult;
    }

    /**
     * Define el valor de la propiedad getElementSymbolResult.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGetElementSymbolResult(String value) {
        this.getElementSymbolResult = value;
    }

}
