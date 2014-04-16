package ch.desm.middleware.modules.communication.broker;

import java.util.HashSet;
import java.util.Set;

public class Broker {
		
	/**
	 * 
	 */
    private static Set<BrokerClient> clients;

    /**
     * 
     */
    public Broker() {
    	Broker.clients = new HashSet<BrokerClient>();
    }

    /**
     * @param client
     */
    public void connect(BrokerClient client) {
    	Broker.clients.add(client);
    }

    /**
     * 
     * @param sendingClient
     * @param message
     */
    protected void publish(BrokerClient sendingClient, String message) {
        for(BrokerClient client : Broker.clients) {
            
        	if(client != sendingClient) {
                
            	client.receive(message);
            }
        }
    }

}
