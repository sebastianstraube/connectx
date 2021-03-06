package sebastianstraube.connectx.module.desm.simulation.zusi;

import sebastianstraube.connectx.core.communication.message.MessageCommon;
import sebastianstraube.connectx.core.component.ComponentMessageProcessorThreadBase;
import sebastianstraube.connectx.module.desm.simulation.zusi.message.ZusiMessageProtocolStream;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;

import java.util.List;

/**
 * Created by Sebastian on 28.11.2014.
 */
public class ZusiEndpointTcpClientThread extends ComponentMessageProcessorThreadBase<String> {

    private Logger LOGGER = Logger.getLogger(ZusiEndpointTcpClientThread.class);
    private Object addZusiStreamLock;
    private ZusiMessageProtocolStream stream;
    private String topic;
    private ZusiService service;

    public ZusiEndpointTcpClientThread(ZusiService service, String topic){
        this.service = service;
        this.addZusiStreamLock = new Object();
        this.stream = new ZusiMessageProtocolStream();
        this.topic = topic;
    }

    @Override
    public void processPendingMessages(List<String> messages) {
        LOGGER.log(Level.INFO, "process pending endpoint message: " + messages.toString());
        service.getMessageProcessor().processEndpointMessage(service, messages, topic);
    }

    /**
     *
     * @param subStream
     */
    public void addZusiStream(String subStream){
        synchronized (addZusiStreamLock){

        this.stream.addStream(subStream);
        String extractedMessage = getSingleMessage();

        while(!extractedMessage.isEmpty()){
            this.stream.cutStream(extractedMessage.length());
            this.addMessage(extractedMessage);
            extractedMessage = getSingleMessage();
            }
        }
    }

    /**
     *
     * @return
     */
    private String getSingleMessage() {
        return service.getMessageCheck().getSingleZusiMessage(this.stream.getStream());
    }
}
