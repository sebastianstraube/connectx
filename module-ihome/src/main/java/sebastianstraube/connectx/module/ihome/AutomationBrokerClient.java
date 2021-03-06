package sebastianstraube.connectx.module.ihome;

import sebastianstraube.connectx.core.communication.broker.BrokerInstance;
import sebastianstraube.connectx.core.communication.message.MessageCommon;
import sebastianstraube.connectx.core.communication.message.translator.MessageTranslatorMiddleware;
import sebastianstraube.connectx.core.component.ComponentBrokerClientBase;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;

import java.util.List;

public class AutomationBrokerClient extends ComponentBrokerClientBase {

	private static Logger LOGGER = Logger.getLogger(AutomationBrokerClient.class);

    AutomationService service;
	private AutomationMessageProcessor processor;
	private MessageTranslatorMiddleware translator;


	public AutomationBrokerClient(AutomationService service) {
		super(BrokerInstance.getSingleton());
        this.service = service;
		this.processor = new AutomationMessageProcessor();
		this.translator = new MessageTranslatorMiddleware();

	}

	/**
	 * 
	 */
	protected void onIncomingBrokerMessage(String message) {

		LOGGER.log(Level.TRACE, "broker (" + this.getClass() + ") received message: "
                + message);

		List<MessageCommon> messageCommon = translator
				.toMiddlewareMessageList(message);

		processor.processBrokerMessage(service, messageCommon);
	}

	/**
	 * 
	 */
	@Override
	protected void initializeTopicSubscriptions() {
		subscribeToTopic(MessageCommon.MESSAGE_TOPIC_MANAGEMENT);
	}



}
