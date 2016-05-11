package ch.desm.middleware.module.desm.simulation.zusi;

import ch.desm.middleware.core.communication.broker.Broker;
import ch.desm.middleware.core.communication.message.MessageCommon;
import ch.desm.middleware.core.component.ComponentBrokerClientBase;
import ch.desm.middleware.core.component.ComponentMessageProcessorThreadBase;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;

import java.util.List;


public class ZusiBrokerClient extends ComponentBrokerClientBase {
    private static Logger LOGGER = Logger.getLogger(ZusiBrokerClient.class);

    private ComponentMessageProcessorThreadBase thread;
    private ZusiService service;

    public ZusiBrokerClient(Broker broker, ZusiService service) {
        super(broker);
        this.service = service;

        this.thread = new ZusiBrokerClientThread(service);
        this.thread.start();
    }

	@Override
	protected void onIncomingBrokerMessage(String message) {
		LOGGER.log(Level.INFO, this.getClass().getSimpleName() + " received broker message: " + message);

        List<MessageCommon> l = service.getTranslator().toMiddlewareMessageList(message);
        thread.addMessages(l);
    }

	@Override
	protected void initializeTopicSubscriptions() {
        subscribeToTopic(MessageCommon.MESSAGE_TOPIC_CABINE_RE420);
        subscribeToTopic(MessageCommon.MESSAGE_TOPIC_PETRINET_OBERMATT);
        subscribeToTopic(MessageCommon.MESSAGE_TOPIC_MANAGEMENT);
	}

}