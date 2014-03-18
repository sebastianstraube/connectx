package ch.desm.middleware.modules.core;

import ch.desm.middleware.modules.communication.broker.CommunicationBroker;
import ch.desm.middleware.modules.communication.broker.message.CommunicationBrokerMessage;
import ch.desm.middleware.modules.communication.endpoint.serial.CommunicationEndpointRs232;
import ch.desm.middleware.modules.communication.endpoint.serial.CommunicationEndpointRs232.EnumSerialPorts;
import ch.desm.middleware.modules.communication.endpoint.virtual.CommunicationEndpointMessageVirtual;
import ch.desm.middleware.modules.component.interlocking.ComponentInterlockingObermattLangau;
import ch.desm.middleware.modules.component.virtual.ComponentVirtualSimulationLocsim;

public class Main {

	public static void main(String[] args) {

		CommunicationBroker broker = new CommunicationBroker();

		CommunicationEndpointMessageVirtual communicationEndpointVirtualLocsim = new CommunicationEndpointMessageVirtual();
		CommunicationEndpointRs232 communicationEndpointInterlocking = new CommunicationEndpointRs232(EnumSerialPorts.COM5);

		ComponentVirtualSimulationLocsim componentVirtualSimulationLocsim = new ComponentVirtualSimulationLocsim(
				broker, communicationEndpointVirtualLocsim);
		
		ComponentInterlockingObermattLangau componentInterlockingObermattLangnau = new ComponentInterlockingObermattLangau(
				broker, communicationEndpointInterlocking);

//		communicationEndpointVirtualLocsim.emulateIncomingEndpointMessage("test message from virtual locsim endpoint");
//		communicationEndpointCabine.emulateIncomingEndpointMessage("test message from virtual cabine endpoint");
		

		CommunicationBrokerMessage messageFromLocsim = new CommunicationBrokerMessage(0, "test message from component simulation locsim");
		CommunicationBrokerMessage messageFromInterlocking = new CommunicationBrokerMessage(1, "test message from component interlocking OL");
		
//		componentVirtualSimulationLocsim.emulateEndpointMessage("TEST_COMMAND");
//		componentVirtualSimulationLocsim.emulateBrokerMessage(messageFromLocsim);
//		componentInterlockingObermattLangnau.emulateBrokerMessage(messageFromInterlocking);
		componentInterlockingObermattLangnau.emulateEndpointMessage("C,14784,199,65505,16383,64528,52939,64575");
	}

}
