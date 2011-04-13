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
package org.savara.bpmn2.parser.rules;

import org.scribble.common.logging.Journal;
import org.scribble.protocol.ProtocolContext;

public interface BPMN2ParserContext {

	/**
	 * This method returns the protocol context.
	 * 
	 * @return The protocol context
	 */
	public ProtocolContext getProtocolContext();
	
	/**
	 * This method returns the journal for reporting issues.
	 * 
	 * @return The journal
	 */
	public Journal getJournal();
	
	/**
	 * This method returns the current scope.
	 * 
	 * @return The scope
	 */
	public Scope getScope();
	
	/**
	 * This method pushes the scope, to clear the current
	 * state associated with a parent scope.
	 */
	public void pushScope();
	
	/**
	 * This method pops the scope associated with a parent
	 * conversation.
	 */
	public void popScope();
	
}