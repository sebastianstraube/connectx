package ch.desm.middleware.modules.component.simulation;

import java.util.Arrays;
import java.util.List;

import ch.desm.middleware.modules.communication.broker.CommunicationBroker;
import ch.desm.middleware.modules.communication.broker.message.CommunicationBrokerMessage;
import ch.desm.middleware.modules.communication.endpoint.CommunicationEndpointBase;
import ch.desm.middleware.modules.communication.endpoint.CommunicationEndpointMessageBase;
import ch.desm.middleware.modules.communication.endpoint.serial.CommunicationEndpointRs232ListenerInterface;
import ch.desm.middleware.modules.component.ComponentBase;

public class ComponentSimulationLocsim extends ComponentBase implements
		CommunicationEndpointRs232ListenerInterface {

	CommunicationEndpointMessageBase communicationEndpointRs232;

	public ComponentSimulationLocsim(CommunicationBroker broker,
			CommunicationEndpointMessageBase communicationEndpointRs232) {
		super(broker);
		this.communicationEndpointRs232 = communicationEndpointRs232;
		
		this.registerEndpointListener((CommunicationEndpointBase)communicationEndpointRs232);
	}

	@Override
	protected void registerEndpointListener(
			CommunicationEndpointBase listener) {
		try {
			communicationEndpointRs232.addEndpointListener(this);
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
	
	public String getType() {
		return enumComponentType.SIMULATION.name();
	}

	public List<String> getRequiredTypes() {
		return Arrays.asList(enumComponentType.INTERLOCKING.name());
	}
}
