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
package org.savara.monitor;

import java.util.UUID;

/**
 * This class represents the identity of a conversation instance.
 *
 */
public class ConversationInstanceId {

	private String m_id=null;
	
	/**
	 * The default constructor.
	 */
	public ConversationInstanceId() {
		m_id = UUID.randomUUID().toString();
	}
	
	/**
	 * The constructor that initializes the id.
	 * 
	 * @param id The id
	 */
	public ConversationInstanceId(String id) {
		m_id = id;
	}
	
	/**
	 * This method returns the id associated with
	 * the conversation instance.
	 * 
	 * @return The id
	 */
	public String getId() {
		return(m_id);
	}
	
	public int hashCode() {
		return(m_id.hashCode());
	}
	
	public boolean equals(Object obj) {
		boolean ret=false;
		
		if (obj instanceof ConversationInstanceId &&
				((ConversationInstanceId)obj).m_id.equals(m_id)) {
			ret = true;
		}
		
		return(ret);
	}
}
