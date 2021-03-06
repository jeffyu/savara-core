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
package org.savara.bpel.parser.rules;

import org.savara.bpel.model.TProcess;
import org.savara.bpel.model.TScope;
import org.savara.bpel.model.TVariable;
import org.savara.common.logging.FeedbackHandler;
import org.savara.common.resources.ResourceLocator;
import org.scribble.protocol.model.Activity;

public interface ParserContext {

	/**
	 * This method applies the conversion process to the supplied component.
	 * 
	 * @param component The domain component
	 * @param activities The list of protocol activities to place the conversion results
	 */
	public void parse(Object component, java.util.List<Activity> activities, FeedbackHandler handler);
	
	/**
	 * This method returns the resource locator.
	 * 
	 * @return The resource locator
	 */
	public ResourceLocator getResourceLocator();
	
	/**
	 * This method returns the process.
	 * 
	 * @return The process
	 */
	public TProcess getProcess();
	
	/**
	 * This method returns the role associated with the
	 * endpoint being converted.
	 * 
	 *@return The role
	 */
	public String getRole();

	/**
	 * This method returns the variable associated with the
	 * supplied name.
	 * 
	 * @param name The name
	 * @return The variable, or null if not found
	 */
	public TVariable getVariable(String name);
	
	/**
	 * This method adds a variable to the context.
	 * 
	 * @param var The variable
	 */
	public void addVariable(TVariable var);

	/**
	 * This method removes a variable from the context.
	 * 
	 * @param var The variable
	 */
	public void removeVariable(TVariable var);

	/**
	 * This method pushes the supplied scope on the stack.
	 * 
	 * @param scope The scope
	 */
	public void pushScope(TScope scope);
	
	/**
	 * This method pops the top scope from the stack.
	 * 
	 */
	public void popScope();
	
	/**
	 * This method returns the current scope.
	 * 
	 * @return The scope, or null if not within a scope
	 */
	public TScope getScope();
	
}
