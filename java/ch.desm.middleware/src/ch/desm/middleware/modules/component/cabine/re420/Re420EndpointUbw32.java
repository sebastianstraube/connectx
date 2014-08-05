package ch.desm.middleware.modules.component.cabine.re420;

import ch.desm.middleware.modules.communication.endpoint.serial.ubw32.EndpointUbw32;
import ch.desm.middleware.modules.component.cabine.re420.maps.Re420MapUbw32Analog;
import ch.desm.middleware.modules.component.cabine.re420.maps.Re420MapUbw32Digital;

public class Re420EndpointUbw32 extends EndpointUbw32 {

	protected Re420MapUbw32Digital re420MapDigital;
	protected Re420MapUbw32Analog re420MapAnalog;
	
	public Re420EndpointUbw32(EnumSerialPorts enumSerialPort) {		
		super(enumSerialPort, Re420MapUbw32Digital.PINBITMASK_CONFIGURATION_DIGITAL, Re420MapUbw32Analog.PINBITMASK_INPUT_ANALOG);
		
		re420MapDigital = new Re420MapUbw32Digital();
		re420MapAnalog = new Re420MapUbw32Analog();
	}
	
	public Re420MapUbw32Analog getMapAnalog(){
		return re420MapAnalog;
	}
	
	public Re420MapUbw32Digital getMapDigital(){
		return re420MapDigital;
	}
	
	/**
	 * test endpoint message handling
	 * @param message
	 */
	public void emulateEndpointMessage(String message) {
		onIncomingEndpointMessage(message);
	}
}