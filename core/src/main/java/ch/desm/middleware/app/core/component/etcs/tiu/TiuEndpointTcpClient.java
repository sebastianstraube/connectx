package ch.desm.middleware.app.core.component.etcs.tiu;

import ch.desm.middleware.app.core.communication.endpoint.tcp.EndpointTcpClient;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import java.io.IOException;

public class TiuEndpointTcpClient extends EndpointTcpClient {

    private static Logger LOGGER = Logger.getLogger(TiuEndpointTcpClient.class);

    private TiuService service;
    private TiuEndpointTcpClientThread messageHandler;

	public TiuEndpointTcpClient(TiuService service, String ip, int port, String topic, String name) {
		super(ip, port, name);
        this.registerEndpointListener();
        this.service = service;
        this.messageHandler = new TiuEndpointTcpClientThread(service, topic);
        messageHandler.start();
    }

    @Override
    public void onIncomingEndpointMessage(String stream){
        LOGGER.log(Level.TRACE, "client receive message: " + stream);
        messageHandler.addEtcsStream(stream);
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
    public void disconnect(String reason){
        try {
            stop();
            socket.close();
            LOGGER.log(Level.INFO, "socket closed: " + socket.toString() + ", reason: " + reason);
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

    /**
     *
     */
    @Override
    public void reset(){

    }

}