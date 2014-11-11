package ch.desm.middleware.app.core.communication.endpoint;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;

public abstract class EndpointCommon extends EndpointBase {

	private static final Logger LOGGER = Logger.getLogger(EndpointCommon.class);

    public abstract void init();

    public abstract void start();

    public abstract void stop();

    protected abstract void registerEndpointListener(EndpointBase listener);

	public void onIncomingEndpointMessage(String message) {
		
		try{
			if(listeners.isEmpty()){
				throw new IllegalStateException("no listeners registered");
			}
		}catch(IllegalStateException e){
			LOGGER.log(Level.ERROR, e);
		}
		
		for (EndpointCommonListenerInterface listener : this.listeners) {
			listener.onIncomingEndpointMessage(message);
		}
	}

	@Override
	public void addEndpointListener(EndpointCommonListenerInterface listener) throws Exception {
		if (!(listener instanceof EndpointCommonListenerInterface)) {
			throw new Exception("Only endpoints with message handling supported.");
		}
        this.listeners.add(listener);
	}

    /**
     * test endpoint message handling
     * @param message
     */
    public void emulateEndpointMessage(String message) {
        onIncomingEndpointMessage(message);
    }

}