package ch.desm.middleware.app.core.component.simulation.zusi;

import ch.desm.middleware.app.core.communication.endpoint.tcp.EndpointTcpClient;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;

import java.io.IOException;

public class ZusiEndpointTcpClient extends EndpointTcpClient {

    private static Logger LOGGER = Logger.getLogger(ZusiEndpointTcpClient.class);

    private ZusiService service;
    private ZusiEndpointMessage bufferedMessages;

	public ZusiEndpointTcpClient(ZusiService service, String ip, int port) {
		super(ip, port);
        this.registerEndpointListener();
        this.service = service;
        this.bufferedMessages = new ZusiEndpointMessage(service);
    }

    @Override
    public void onIncomingEndpointMessage(String message){
        LOGGER.log(Level.INFO, "client receive message: " + message);

        bufferedMessages.addMessage(message);

        if(bufferedMessages.isTransferComplete()){
            LOGGER.log(Level.INFO, "buffered message is complete: " + message);

            //TODO next step to broker broadcast
            //service.getProcessor().processEndpointMessage(this, );
        }else{
            LOGGER.log(Level.INFO, "buffered message is incomplete: " + message);
        }

    }

    @Override
    protected void registerEndpointListener() {
        try {
            addEndpointListener(this);
        } catch (Exception e) {
            LOGGER.log(Level.ERROR, e);
        }
    }

    @Override
    public void disconnect(){
        try {
            stop();
            socket.close();
        } catch (IOException e) {
            LOGGER.log(Level.ERROR, e);
        }
    }

    @Override
    public void connect(){

        LOGGER.log(Level.INFO, "connecting to Server ...");
        try {
            socket.connect(socketAddress);
        } catch (IOException e) {
            LOGGER.log(Level.ERROR, e);
        }

        LOGGER.log(Level.INFO, "connected to Server with address:" + socket.getInetAddress() + ", remote port: " + socket.getPort()+ ", locale port: " + socket.getLocalPort());
    }

    public void sendMessageRegisterClient(){

        try {
            String stream = service.getMessageService().getStreamConnect();
            this.send(stream);
        } catch (IOException e) {
            LOGGER.log(Level.ERROR, e);
        }
    }

    public void sendMessageNeededData(){

        try {
            String stream = service.getMessageService().getMessageNeededData();
            this.send(stream);
        } catch (Exception e) {
            LOGGER.log(Level.ERROR, e);
        }
    }

}