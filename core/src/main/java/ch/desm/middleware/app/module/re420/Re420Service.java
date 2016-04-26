package ch.desm.middleware.app.module.re420;

import ch.desm.middleware.app.core.component.ComponentServiceBase;
import ch.desm.middleware.app.core.communication.broker.Broker;
import ch.desm.middleware.app.core.component.ComponentMessageProcessorBase;
import ch.desm.middleware.app.core.communication.message.translator.MessageTranslatorMiddleware;
import ch.desm.middleware.app.module.re420.map.*;

/**
 * Created by Sebastian on 11.04.2015.
 */
public class Re420Service extends ComponentServiceBase {

    private Re420BrokerClient client;
    private MessageTranslatorMiddleware translator;
    private Re420EndpointUbw32 endpointUbw;
    private Re420MessageProcessor processor;
    private Re420MapZusiFahrpult mapZusi;
    private ComponentMessageProcessorBase componentEndpointUbw32MessageProcessor;

    private final Re420MapPetrinetCabineRe420 re420MapPetrinetCabineRe420 = new Re420MapPetrinetCabineRe420();
    private final Re420MapUbw32Digital re420MapUbw32Digital = new Re420MapUbw32Digital();
    private final Re420MapUbw32Analog re420MapUbw32Analog = new Re420MapUbw32Analog();

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
        this.componentEndpointUbw32MessageProcessor = new Re420MessageProcessor();
    }

    public Re420EndpointUbw32 getEndpoint(){
        return endpointUbw;
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
        return re420MapPetrinetCabineRe420;
    }

    public ComponentMessageProcessorBase getEndpointMessageProcessor(){
        return componentEndpointUbw32MessageProcessor;
    }

    public Re420MapUbw32Digital getMapDigital(){
        return re420MapUbw32Digital;
    }

    public Re420MapUbw32Analog getMapAnalog(){
        return re420MapUbw32Analog;
    }
}
