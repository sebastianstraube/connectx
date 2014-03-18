package ch.desm.middleware.modules.component.interlocking;

import java.util.Arrays;
import java.util.List;

import ch.desm.middleware.modules.communication.broker.CommunicationBroker;
import ch.desm.middleware.modules.communication.broker.message.CommunicationBrokerMessage;
import ch.desm.middleware.modules.communication.endpoint.CommunicationEndpointBase;
import ch.desm.middleware.modules.communication.endpoint.serial.ubw32.CommunicationEndpointUbw32ListenerInterface;
import ch.desm.middleware.modules.communication.endpoint.virtual.CommunicationEndpointMessageVirtual;
import ch.desm.middleware.modules.component.ComponentBase;

public class ComponentInterlockingObermattLangau extends ComponentBase
		implements CommunicationEndpointUbw32ListenerInterface {

	CommunicationEndpointMessageVirtual communicationEndpointUbw32;
	
	public ComponentInterlockingObermattLangau(CommunicationBroker broker, CommunicationEndpointMessageVirtual communicationEndpointUbw32) {
		super(broker);
		this.communicationEndpointUbw32 = communicationEndpointUbw32;
		
		this.registerEndpointListener((CommunicationEndpointBase)communicationEndpointUbw32);
	}
	
	@Override
	protected void registerEndpointListener(
			CommunicationEndpointBase listener) {
		try {
			communicationEndpointUbw32.addEndpointListener(this);
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
	}
	
	@Override
	protected void onBrokerMessage(CommunicationBrokerMessage message) {
		System.out.println("received a broker message:" + message + " in class"
				+ this.getClass());
	}

	@Override
	public String getType() {
		return enumComponentType.INTERLOCKING.name();
	}

	@Override
	public List<String> getRequiredTypes() {
		return Arrays.asList(enumComponentType.SIMULATION.name(),
				enumComponentType.CABINE.name());
	}
	
	@Override
	public void onIncomingEndpointMessage(String message) {
		System.out.println("received a message:\"" + message
				+ "\" from endpoint " + this.getClass());
	}
	
	/**
	 * test endpoint message handling
	 * @param message
	 */
	public void emulateEndpointMessage(String message) {
		onIncomingEndpointMessage(message);
	}
}
