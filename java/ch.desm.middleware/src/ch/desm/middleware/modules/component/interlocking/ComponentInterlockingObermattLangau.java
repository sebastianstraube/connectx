package ch.desm.middleware.modules.component.interlocking;

import java.util.Arrays;
import java.util.List;

import ch.desm.middleware.modules.communication.broker.CommunicationBroker;
import ch.desm.middleware.modules.communication.broker.message.CommunicationBrokerMessage;
import ch.desm.middleware.modules.communication.endpoint.CommunicationEndpointBase;
import ch.desm.middleware.modules.communication.endpoint.CommunicationEndpointMessageBase;
import ch.desm.middleware.modules.communication.endpoint.serial.ubw32.CommunicationEndpointUbw32ListenerInterface;
import ch.desm.middleware.modules.component.ComponentBase;

public class ComponentInterlockingObermattLangau extends ComponentBase
		implements CommunicationEndpointUbw32ListenerInterface {

	CommunicationEndpointMessageBase communicationEndpointUbw32;
	
	public ComponentInterlockingObermattLangau(CommunicationBroker broker, CommunicationEndpointMessageBase communicationEndpointUbw32) {
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
	protected void onIncomingBrokerMessage(CommunicationBrokerMessage message) {
		System.out.println("received a broker message:" + message
				+ " from component " + this.getClass());
		
		
	}

	@Override
	public void onIncomingEndpointMessage(String message) {
		System.out.println("received an endpoint message :\"" + message
				+ " from endpoint " + this.getClass());
		
		communicationEndpointUbw32.sendMessage(message);
	}
	
	@Override
	/**
	 * test endpoint message handling
	 * @param message
	 */
	public void emulateEndpointMessage(String message) {
		onIncomingEndpointMessage(message);
	}

	@Override
	/**
	 * test endpoint message handling
	 * @param message
	 */
	public void emulateBrokerMessage(CommunicationBrokerMessage message) {
		onIncomingBrokerMessage(message);
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
}
