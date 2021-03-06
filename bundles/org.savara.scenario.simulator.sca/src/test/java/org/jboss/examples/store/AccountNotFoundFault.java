
package org.jboss.examples.store;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 2.4.0
 * 2011-06-08T17:04:28.016+01:00
 * Generated source version: 2.4.0
 * 
 */

@WebFault(name = "AccountNotFound", targetNamespace = "http://www.jboss.org/examples/store")
public class AccountNotFoundFault extends Exception {
    public static final long serialVersionUID = 20110608170428L;
    
    private org.jboss.examples.store.AccountNotFoundType accountNotFound;

    public AccountNotFoundFault() {
        super();
    }
    
    public AccountNotFoundFault(String message) {
        super(message);
    }
    
    public AccountNotFoundFault(String message, Throwable cause) {
        super(message, cause);
    }

    public AccountNotFoundFault(String message, org.jboss.examples.store.AccountNotFoundType accountNotFound) {
        super(message);
        this.accountNotFound = accountNotFound;
    }

    public AccountNotFoundFault(String message, org.jboss.examples.store.AccountNotFoundType accountNotFound, Throwable cause) {
        super(message, cause);
        this.accountNotFound = accountNotFound;
    }

    public org.jboss.examples.store.AccountNotFoundType getFaultInfo() {
        return this.accountNotFound;
    }
}
