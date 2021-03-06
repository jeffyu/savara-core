/*
 * JBoss, Home of Professional Open Source
 * Copyright 2008-11, Red Hat Middleware LLC, and others contributors as indicated
 * by the @authors tag. All rights reserved.
 * See the copyright.txt in the distribution for a
 * full listing of individual contributors.
 * This copyrighted material is made available to anyone wishing to use,
 * modify, copy, or redistribute it subject to the terms and conditions
 * of the GNU Lesser General Public License, v. 2.1.
 * This program is distributed in the hope that it will be useful, but WITHOUT A
 * WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS FOR A
 * PARTICULAR PURPOSE.  See the GNU Lesser General Public License for more details.
 * You should have received a copy of the GNU Lesser General Public License,
 * v.2.1 along with this distribution; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston,
 * MA  02110-1301, USA.
 */
package org.savara.scenario.simulator.sca.internal.binding.ws.runtime;

import org.apache.tuscany.sca.assembly.EndpointReference;
import org.apache.tuscany.sca.interfacedef.InterfaceContract;
import org.apache.tuscany.sca.interfacedef.Operation;
import org.apache.tuscany.sca.invocation.Invoker;
import org.apache.tuscany.sca.provider.ReferenceBindingProvider;
import org.savara.scenario.simulator.sca.internal.MessageStore;
import org.savara.scenario.simulator.sca.internal.ServiceStore;

public class WSReferenceBindingProvider implements ReferenceBindingProvider {

    private EndpointReference endpoint;
    private InterfaceContract contract;
    private ServiceStore m_serviceStore;
    private MessageStore m_messageStore;

    public WSReferenceBindingProvider(EndpointReference endpoint, ServiceStore sstore, MessageStore mstore) {
        this.endpoint = endpoint;
        m_serviceStore = sstore;
        m_messageStore = mstore;
    }
    
    public Invoker createInvoker(Operation operation) {
    	WSReferenceInvoker ret=new WSReferenceInvoker(operation, endpoint, m_messageStore);
    	
        m_serviceStore.addReference(endpoint.getBinding().getURI(), ret);

        return(ret);
    }

    public void start() {
    }

    public void stop() {
    }

    public InterfaceContract getBindingInterfaceContract() {
        return contract;
    }

    public boolean supportsOneWayInvocation() {
        return false;
    }

}
