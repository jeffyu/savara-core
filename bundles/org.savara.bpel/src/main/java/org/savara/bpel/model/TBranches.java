//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.2-146 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2010.12.10 at 11:11:33 PM GMT 
//


package org.savara.bpel.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for tBranches complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tBranches">
 *   &lt;complexContent>
 *     &lt;extension base="{http://docs.oasis-open.org/wsbpel/2.0/process/executable}tExpression">
 *       &lt;attribute name="successfulBranchesOnly" type="{http://docs.oasis-open.org/wsbpel/2.0/process/executable}tBoolean" default="no" />
 *       &lt;anyAttribute processContents='lax' namespace='##other'/>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tBranches")
public class TBranches
    extends TExpression
{

    @XmlAttribute(name = "successfulBranchesOnly")
    protected TBoolean successfulBranchesOnly;

    /**
     * Gets the value of the successfulBranchesOnly property.
     * 
     * @return
     *     possible object is
     *     {@link TBoolean }
     *     
     */
    public TBoolean getSuccessfulBranchesOnly() {
        if (successfulBranchesOnly == null) {
            return TBoolean.NO;
        } else {
            return successfulBranchesOnly;
        }
    }

    /**
     * Sets the value of the successfulBranchesOnly property.
     * 
     * @param value
     *     allowed object is
     *     {@link TBoolean }
     *     
     */
    public void setSuccessfulBranchesOnly(TBoolean value) {
        this.successfulBranchesOnly = value;
    }

}
