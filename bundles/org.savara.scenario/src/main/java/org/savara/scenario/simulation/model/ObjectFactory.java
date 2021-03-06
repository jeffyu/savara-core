//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-833 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.05.31 at 07:35:14 PM BST 
//


package org.savara.scenario.simulation.model;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.savara.scenario.simulation.model package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _Simulation_QNAME = new QName("http://www.savara.org/scenario/simulation", "simulation");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.savara.scenario.simulation.model
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Simulation }
     * 
     */
    public Simulation createSimulation() {
        return new Simulation();
    }

    /**
     * Create an instance of {@link RoleDetails }
     * 
     */
    public RoleDetails createRoleDetails() {
        return new RoleDetails();
    }

    /**
     * Create an instance of {@link SimulatorDetails }
     * 
     */
    public SimulatorDetails createSimulatorDetails() {
        return new SimulatorDetails();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Simulation }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.savara.org/scenario/simulation", name = "simulation")
    public JAXBElement<Simulation> createSimulation(Simulation value) {
        return new JAXBElement<Simulation>(_Simulation_QNAME, Simulation.class, null, value);
    }

}
