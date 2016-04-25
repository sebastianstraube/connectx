package ch.desm.middleware.app.core.communication.message;


import org.apache.log4j.Level;
import org.apache.log4j.Logger;

public class MessageBase{
    private static Logger LOGGER = Logger.getLogger(MessageBase.class);

    public static final String MESSAGE_PARAMETER_PLACEHOLDER = "?";
    public static final String MESSAGE_ELEMENT_DELIMITER = ";";
    public static final String MESSAGE_MESSAGE_DELIMITER = "#";
	public static final String MESSAGE_PARAMETER_ON = "on";
	public static final String MESSAGE_PARAMETER_OFF = "off";
	
	public static final String MESSAGE_TOPIC_SIMULATION_LOCSIM = "locsim";
	public static final String MESSAGE_TOPIC_SIMULATION_LOCSIM_DLL = "locsim-dll";
	public static final String MESSAGE_TOPIC_SIMULATION_LOCSIM_RS232 = "locsim-rs232";
	public static final String MESSAGE_TOPIC_CABINE_RE420 = "kabinere420";
	public static final String MESSAGE_TOPIC_INTERLOCKING_OBERMATT = "stellwerkobermattlangnau";
	public static final String MESSAGE_TOPIC_PETRINET_OBERMATT = "petrinet_obermatt";
    public static final String MESSAGE_TOPIC_PETRINET_CABINE_RE420 = "petrinet_cabine_re420";
	public static final String MESSAGE_TOPIC_MANAGEMENT = "management";
    public static final String MESSAGE_TOPIC_SIMULATION_ZUSI_FAHRPULT = "zusi_fahrpult";
    public static final String MESSAGE_TOPIC_SIMULATION_ZUSI_AUSBILDUNG = "zusi_ausbildung";
    public static final String MESSAGE_TOPIC_ETCS_TIU = "etcstiu";
	
	private String topic;
    private String messageId;
	private String payload;
	
    /**
     * 
     */
    private MessageBase() {
    	this.messageId = String.valueOf(System.currentTimeMillis());
    }
        
    public MessageBase(String payload, String topic) {
    	this();
    	this.payload = payload;
    	this.topic = topic;

    }

    public static String replaceMiddlewareMessageDelimiter(String middlewareMessage, String parameterValue){
        return middlewareMessage.replace(MESSAGE_PARAMETER_PLACEHOLDER, parameterValue);
    }

    public static String getParameterValueEndpoint(String value) {
        switch (value) {
            case MESSAGE_PARAMETER_ON:
                return "1";
            case MESSAGE_PARAMETER_OFF:
                return "0";
            default:
                LOGGER.log(Level.ERROR, "unexpected (0,1) parameter value: " + value);
                return "";
        }
    }

    @Override
    public String toString(){
    	String s = "";
		s += "topic: " + topic;
		s += ", ";
    	s+= "messageId: "+messageId; 	
    	return s;
    }
    
    public String getMessageId() {
        return this.messageId;
    }
    
    public void setMessageId(String value) {
        this.messageId = value;
    }
    
    public String getPayload(){
    	return this.payload;
    }
    
    public void setPayload(String value) {
        this.payload = value;
    }
    
    public String getTopic(){
    	return this.topic;
    }
    
    public void setTopic(String value) {
        this.topic = value;
    }
}