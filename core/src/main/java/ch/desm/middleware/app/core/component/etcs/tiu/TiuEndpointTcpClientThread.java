package ch.desm.middleware.app.core.component.etcs.tiu;

import ch.desm.middleware.app.core.component.ComponentThreadMessageProcessorBase;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;

import java.util.LinkedList;

/**
 * Created by Sebastian on 28.11.2014.
 */
public class TiuEndpointTcpClientThread extends ComponentThreadMessageProcessorBase {

    private Logger LOGGER = Logger.getLogger(TiuEndpointTcpClientThread.class);
    private TiuService service;
    private Object processMessagesLock;
    private String topic;

    public TiuEndpointTcpClientThread(TiuService service, String topic){
        this.service = service;
        this.processMessagesLock = new Object();
        this.topic = topic;
    }

    @Override
    public void processPendingMessages() {
        synchronized (processMessagesLock){
            LinkedList<String> messages = new LinkedList<>();

            if(!messages.isEmpty()){
                LOGGER.log(Level.INFO, "process pending endpoint message: " + messages.toString());
                service.getMessageProcessor().processEndpointMessage(service, messages, topic);
            }
        }
    }

    /**
     *
     * @param subStream
     */
    public void addEtcsStream(String subStream){

    }

}
