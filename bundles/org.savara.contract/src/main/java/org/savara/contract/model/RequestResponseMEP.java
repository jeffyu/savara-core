/*
 * JBoss, Home of Professional Open Source
 * Copyright 2008, Red Hat Middleware LLC, and others contributors as indicated
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
package org.savara.contract.model;

import org.savara.common.model.annotation.Annotation;

/**
 * This class represents the request response message exchange pattern.
 */
public class RequestResponseMEP extends MessageExchangePattern {
	
	private java.util.List<Type> m_responseTypes=
			new java.util.Vector<Type>();	
	private java.util.List<FaultDetails> m_faultDetails=
			new java.util.Vector<FaultDetails>();	
	
	/**
	 * The default constructor.
	 */
	public RequestResponseMEP() {
	}
	
	/**
	 * This method returns the list of response types.
	 * 
	 * @return The list of response types
	 */
	public java.util.List<Type> getResponseTypes() {
		return(m_responseTypes);
	}
	
	/**
	 * This method returns the list of fault details.
	 * 
	 * @return The list of fault details
	 */
	public java.util.List<FaultDetails> getFaultDetails() {
		return(m_faultDetails);
	}
	
	/**
	 * This method returns the fault details for the supplied
	 * name.
	 * 
	 * @param faultName The fault name
	 * @return The fault details, or null if not found
	 */
	public FaultDetails getFaultDetails(String faultName) {
		for (FaultDetails fd : m_faultDetails) {
			if (fd.getName().equals(faultName)) {
				return(fd);
			}
		}
		return(null);
	}
	
	public String toString() {
		StringBuffer buf=new StringBuffer();
		
		for (Annotation ann : getAnnotations()) {
			buf.append("\t\t[["+ann+"]]\r\n");
		}
		
		buf.append("\t\tRequestResponseMEP "+getOperation()+"( ");
		
		for (Type t : getTypes()) {
			buf.append(t.toString()+" ");
		}
		
		buf.append(") : ");
		
		for (Type t : getResponseTypes()) {
			buf.append(t.toString()+" ");
		}
		
		for (FaultDetails fd : getFaultDetails()) {
			buf.append(fd.toString()+" ");
		}
		
		buf.append("\r\n");
		
		return(buf.toString());
	}
}
