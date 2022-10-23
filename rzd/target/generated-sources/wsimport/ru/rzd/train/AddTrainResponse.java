
package ru.rzd.train;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://train.rzd.ru}train" minOccurs="0"/&gt;
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
    "train"
})
@XmlRootElement(name = "addTrainResponse")
public class AddTrainResponse
    implements Serializable
{

    protected Train train;

    /**
     * Gets the value of the train property.
     * 
     * @return
     *     possible object is
     *     {@link Train }
     *     
     */
    public Train getTrain() {
        return train;
    }

    /**
     * Sets the value of the train property.
     * 
     * @param value
     *     allowed object is
     *     {@link Train }
     *     
     */
    public void setTrain(Train value) {
        this.train = value;
    }

}
