package ch.desm.middleware.modules.communication.endpoint.virtual;

import java.util.Hashtable;

import org.apache.log4j.Logger;

import ch.desm.middleware.modules.core.daemon.DaemonThread;

class EndpointInterlockingLogicPolling extends DaemonThread {

	public EndpointInterlockingLogicPolling(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	protected static Logger log = Logger.getLogger(EndpointInterlockingLogicPolling.class);
	
	private Object lock = new Object();
//	private EndpointInterlockingPetriNet net;
	private Hashtable<String, Boolean> map;
	String transition;
	Boolean value;
	boolean isChanged;
	
//	public EndpointInterlockingLogicPolling(String name, EndpointInterlockingPetriNet net) {
//		super(name);
//		this.map = new Hashtable<String, Boolean>();
//		this.net = net;
//		
//		net.writeActors();
//		net.init();
//		
//		this.start();
//	}
	
	public void addToMap(String muh) {
		synchronized(lock) {
//			this.map.put(muh, muh);
		}
	}
	
	/**
	 * 
	 */
	@Override
	public void run() {
		while (!isInterrupted()) {
			
		}
	}

}