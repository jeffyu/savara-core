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
package org.savara.scenario.simulator.sca;

import org.savara.scenario.model.Event;
import org.savara.scenario.model.ReceiveEvent;
import org.savara.scenario.model.SendEvent;
import org.savara.scenario.simulation.SimulationHandler;

public class TestSimulationHandler implements SimulationHandler {

	public void noSimulator(Event event) {
		System.out.println("NO SIMULATOR: "+printable(event));
	}

	public void processed(Event event) {
		System.out.println("PROCESSED: "+printable(event));
	}

	public void unexpected(Event event) {
		System.out.println("UNEXPECTED: "+printable(event));
	}

	public void error(String mesg, Event event, Throwable e) {
		System.out.println("ERROR: ("+mesg+") "+printable(event)+" exception="+e);
	}
	
	protected String printable(Event event) {
		String ret=null;
		
		if (event instanceof SendEvent) {
			SendEvent send=(SendEvent)event;
			ret = "send "+send.getOperationName();
		} else {
			ReceiveEvent recv=(ReceiveEvent)event;
			ret = "recv "+recv.getOperationName();
		}
		
		return(ret);
	}
}