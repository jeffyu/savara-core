
/**
 * Please modify this class to meet your needs
 * This class is not complete
 */

package org.jboss.examples.store;

import java.math.BigInteger;
import java.util.logging.Logger;

/**
 * This class was generated by Apache CXF 2.4.0
 * 2011-06-08T17:04:28.022+01:00
 * Generated source version: 2.4.0
 * 
 */

@javax.jws.WebService(
                      serviceName = "StoreService",
                      portName = "StoreInterfacePort",
                      targetNamespace = "http://www.jboss.org/examples/store",
                      wsdlLocation = "wsdl/PurchaseGoodsProcess_Store.wsdl",
                      endpointInterface = "org.jboss.examples.store.StoreInterface")
                      
public class StoreInterfaceImpl implements StoreInterface {

    private static final Logger LOG = Logger.getLogger(StoreInterfaceImpl.class.getName());

    /* (non-Javadoc)
     * @see org.jboss.examples.store.StoreInterface#buy(org.jboss.examples.store.BuyRequestType  content )*
     */
    public org.jboss.examples.store.BuyConfirmedType buy(BuyRequestType content) throws AccountNotFoundFault , BuyFailedFault    { 
        LOG.info("Executing operation buy");
        System.out.println(content);
        try {
            org.jboss.examples.store.BuyConfirmedType _return = 
            		new org.jboss.examples.store.BuyConfirmedType();
            _return.setId("1");
            _return.setAmount(BigInteger.valueOf(500));
            //_return.setDeliveryDate();
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
        //throw new AccountNotFoundFault("AccountNotFoundFault...");
        //throw new BuyFailedFault("BuyFailedFault...");
    }

}
