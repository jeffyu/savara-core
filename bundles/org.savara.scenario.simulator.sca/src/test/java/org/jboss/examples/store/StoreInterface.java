package org.jboss.examples.store;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;

import org.oasisopen.sca.annotation.Remotable;

/**
 * This class was generated by Apache CXF 2.4.0
 * 2011-06-08T17:04:28.039+01:00
 * Generated source version: 2.4.0
 * 
 */
 
@WebService(targetNamespace = "http://www.jboss.org/examples/store", name = "StoreInterface")
//@XmlSeeAlso({ObjectFactory.class, org.jboss.examples.logistics.ObjectFactory.class, org.jboss.examples.creditagency.ObjectFactory.class})
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
@Remotable
public interface StoreInterface {

    @WebResult(name = "BuyConfirmed", targetNamespace = "http://www.jboss.org/examples/store", partName = "content")
    @WebMethod(action = "http://www.jboss.org/examples/store/buy")
    public BuyConfirmedType buy(
        @WebParam(partName = "content", name = "BuyRequest", targetNamespace = "http://www.jboss.org/examples/store")
        BuyRequestType content
    ) throws AccountNotFoundFault, BuyFailedFault;
}
