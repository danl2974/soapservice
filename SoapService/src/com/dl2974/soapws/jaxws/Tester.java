
package com.dl2974.soapws.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "tester", namespace = "http://soapws.dl2974.com/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tester", namespace = "http://soapws.dl2974.com/")
public class Tester {

    @XmlElement(name = "message", namespace = "")
    private String message;

    /**
     * 
     * @return
     *     returns String
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * 
     * @param message
     *     the value for the message property
     */
    public void setMessage(String message) {
        this.message = message;
    }

}
