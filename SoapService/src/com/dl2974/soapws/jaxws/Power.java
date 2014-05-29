
package com.dl2974.soapws.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "power", namespace = "http://soapws.dl2974.com/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "power", namespace = "http://soapws.dl2974.com/")
public class Power {

    @XmlElement(name = "number", namespace = "")
    private String number;

    /**
     * 
     * @return
     *     returns String
     */
    public String getNumber() {
        return this.number;
    }

    /**
     * 
     * @param number
     *     the value for the number property
     */
    public void setNumber(String number) {
        this.number = number;
    }

}
