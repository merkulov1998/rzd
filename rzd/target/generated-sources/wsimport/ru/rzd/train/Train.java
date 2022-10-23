
package ru.rzd.train;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for Train complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Train"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="locomotive-type" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="form-date" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="wagons" type="{http://train.rzd.ru}Wagons"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Train", propOrder = {
    "id",
    "name",
    "locomotiveType",
    "formDate",
    "wagons"
})
public class Train
    implements Serializable
{

    protected String id;
    @XmlElement(required = true)
    protected String name;
    @XmlElement(name = "locomotive-type", required = true)
    protected String locomotiveType;
    @XmlElement(name = "form-date", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar formDate;
    @XmlElement(required = true)
    protected Wagons wagons;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
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
     * Gets the value of the locomotiveType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocomotiveType() {
        return locomotiveType;
    }

    /**
     * Sets the value of the locomotiveType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocomotiveType(String value) {
        this.locomotiveType = value;
    }

    /**
     * Gets the value of the formDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFormDate() {
        return formDate;
    }

    /**
     * Sets the value of the formDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFormDate(XMLGregorianCalendar value) {
        this.formDate = value;
    }

    /**
     * Gets the value of the wagons property.
     * 
     * @return
     *     possible object is
     *     {@link Wagons }
     *     
     */
    public Wagons getWagons() {
        return wagons;
    }

    /**
     * Sets the value of the wagons property.
     * 
     * @param value
     *     allowed object is
     *     {@link Wagons }
     *     
     */
    public void setWagons(Wagons value) {
        this.wagons = value;
    }

}
