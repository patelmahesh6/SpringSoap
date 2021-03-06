
package com.panthera.student_ws;

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
 *         &lt;element name="serviceStatus" type="{http://www.panthera.com/student-ws}serviceStatus"/>
 *         &lt;element name="students" type="{http://www.panthera.com/student-ws}students"/>
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
    "serviceStatus",
    "students"
})
@XmlRootElement(name = "addStudentResponse")
public class AddStudentResponse {

    @XmlElement(required = true)
    protected ServiceStatus serviceStatus;
    @XmlElement(required = true)
    protected Students students;

    /**
     * Gets the value of the serviceStatus property.
     * 
     * @return
     *     possible object is
     *     {@link ServiceStatus }
     *     
     */
    public ServiceStatus getServiceStatus() {
        return serviceStatus;
    }

    /**
     * Sets the value of the serviceStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceStatus }
     *     
     */
    public void setServiceStatus(ServiceStatus value) {
        this.serviceStatus = value;
    }

    /**
     * Gets the value of the students property.
     * 
     * @return
     *     possible object is
     *     {@link Students }
     *     
     */
    public Students getStudents() {
        return students;
    }

    /**
     * Sets the value of the students property.
     * 
     * @param value
     *     allowed object is
     *     {@link Students }
     *     
     */
    public void setStudents(Students value) {
        this.students = value;
    }

}
