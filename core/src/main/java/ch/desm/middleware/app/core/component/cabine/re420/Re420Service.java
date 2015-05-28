package ch.desm.middleware.app.core.component.cabine.re420;

import ch.desm.middleware.app.common.ComponentServiceBase;
import ch.desm.middleware.app.core.communication.broker.Broker;
import ch.desm.middleware.app.core.communication.endpoint.rs232.ubw32.EndpointUbw32MessageProcessing;
import ch.desm.middleware.app.core.communication.message.translator.MessageTranslatorMiddleware;
import ch.desm.middleware.app.core.component.cabine.re420.maps.*;

/**
 * Created by Sebastian on 11.04.2015.
 */
public class Re420Service extends ComponentServiceBase {

    private Re420BrokerClient client;
    private MessageTranslatorMiddleware translator;
    private Re420EndpointUbw32 endpointUbw;
    private Re420MessageProcessor processor;
    private Re420MapZusiFahrpult mapZusi;
    private EndpointUbw32MessageProcessing endpointUbw32MessageProcessing;

    /**
     *
     * @param broker
     */
    public Re420Service(Broker broker, String port){
        this.client = new Re420BrokerClient(broker, this);
        this.endpointUbw = new Re420EndpointUbw32(this, port);
        this.translator = new MessageTranslatorMiddleware();
        this.processor = new Re420MessageProcessor();
        this.mapZusi = new Re420MapZusiFahrpult();
        this.endpointUbw32MessageProcessing = new EndpointUbw32MessageProcessing();
    }

    public Re420EndpointUbw32 getEndpoint(){
        return this.endpointUbw;
    }

    public MessageTranslatorMiddleware getTranslator(){
        return translator;
    }

    @Override
    public Re420MessageProcessor getMessageProcessor(){
        return processor;
    }

    public Re420BrokerClient getBrokerClient(){
        return client;
    }

    public Re420MapZusiFahrpult getMapZusi(){
        return mapZusi;
    }

    public Re420MapPetrinetCabineRe420 getMapPetrinetRe420(){
        return new Re420MapPetrinetCabineRe420();
    }

    public EndpointUbw32MessageProcessing getEndpointMessageProcessor(){
        return endpointUbw32MessageProcessing;
    }

    public Re420MapUbw32Digital getMapDigital(){
        return new Re420MapUbw32Digital();
    }

    public Re420MapUbw32Analog getMapAnalog(){
        return new Re420MapUbw32Analog();
    }
}
