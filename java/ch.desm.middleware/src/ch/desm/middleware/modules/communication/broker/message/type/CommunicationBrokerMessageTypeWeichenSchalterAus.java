package ch.desm.middleware.modules.communication.broker.message.type;

import ch.desm.middleware.modules.communication.broker.message.CommunicationBrokerMessage;

public class CommunicationBrokerMessageTypeWeichenSchalterAus extends CommunicationBrokerMessage{

    public CommunicationBrokerMessageTypeWeichenSchalterAus(int id, int sourceComponent, int destinationComponent) {
        super(id, sourceComponent, destinationComponent);
    }
}