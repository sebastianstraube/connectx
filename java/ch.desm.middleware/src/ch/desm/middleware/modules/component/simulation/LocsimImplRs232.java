package ch.desm.middleware.modules.component.simulation;

import ch.desm.middleware.modules.communication.broker.Broker;
import ch.desm.middleware.modules.communication.endpoint.EndpointCommon;
import ch.desm.middleware.modules.communication.message.MessageCommon;
import ch.desm.middleware.modules.communication.message.MessageCommon.EnumMessageType;
import ch.desm.middleware.modules.communication.message.type.component.cabine.Stufenschalter1;

public class LocsimImplRs232 extends LocsimBase implements LocsimListenerRs232{

	public LocsimImplRs232(Broker broker, EndpointCommon communicationEndpointDll) {
		super(broker, communicationEndpointDll);
	}

	@Override
	/**
	 * TODO Implementation
	 * 
	 */
	protected void onIncomingBrokerMessage(MessageCommon message) {
		System.out.println("received a broker message:" + message
				+ " from component " + this.getClass());
		
		
	}

	@Override
	public void onStufenschalter(int id, String value) {
		
		publish(new Stufenschalter1(EnumMessageType.CABINE, id, value));
	}


	@Override
	/**
	 * TODO implementation
	 * 
	 */
	public void onIncomingEndpointMessage(String message) {
		System.out.println("received an endpoint message :\"" + message
				+ " from endpoint " + this.getClass());
		
		if(this instanceof LocsimImplRs232){
			
			if(message.equals("stufenschalter.1.off")){
				onStufenschalter(1, "off");
			}
			
		}else{
			
			try {
				throw new Exception("unknown endpoint");
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		
	}
	
	/**
	 * test endpoint message handling
	 * @param message
	 */
	public void emulateEndpointMessage(String message) {
		onIncomingEndpointMessage(message);
	}

}
