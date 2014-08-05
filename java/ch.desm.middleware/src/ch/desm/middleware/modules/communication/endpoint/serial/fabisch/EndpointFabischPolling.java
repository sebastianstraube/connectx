package ch.desm.middleware.modules.communication.endpoint.serial.fabisch;

import org.apache.log4j.Logger;

import ch.desm.middleware.modules.communication.endpoint.dll.EndpointDllPolling;
import ch.desm.middleware.modules.core.daemon.DaemonThread;

/**
 * Inherits the Daeon class to execute polling
 * @author Sebastian
 *
 */
class EndpointFabischPolling extends DaemonThread {
	
	private static Logger log = Logger.getLogger(EndpointDllPolling.class);
	
	private EndpointFabisch endpoint;
	private int waitTimeMs;
	
	EndpointFabischPolling(EndpointFabisch endpoint, int waitTimeMs) {
		super("EndpointFabischPolling (" + endpoint.getSerialPortName()+")");
		
		this.endpoint = endpoint;
		this.waitTimeMs = waitTimeMs;
	}	
	
	@Override
	public void run() {
		try {

			while (!isInterrupted()) {
				Thread.sleep(waitTimeMs);
				log.trace("Polling Thread active: " + this.getName() + " wait time: " + waitTimeMs);
				endpoint.pollingCommand();
			}

		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}