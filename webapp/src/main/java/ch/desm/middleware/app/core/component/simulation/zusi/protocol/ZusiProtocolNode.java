package ch.desm.middleware.app.core.component.simulation.zusi.protocol;

import ch.desm.middleware.app.core.common.utility.UtilConvertingHex;

/**
 * Created by Sebastian on 06.03.2015.
 */
class ZusiProtocolNode extends ZusiProtocolNodeBase {

    public static final int BYTE_LENGTH_BYTE = 1;
    public static final int BYTE_LENGTH_SHORTINT = 1;
    public static final int BYTE_LENGTH_WORD = 2;
    public static final int BYTE_LENGTH_SMALLINT = 2;
    public static final int BYTE_LENGTH_INTEGER = 4;
    public static final int BYTE_LENGTH_SINGLE = 4;
    public static final int BYTE_LENGTH_DOUBLE = 8;
    public static final int BYTE_LENGTH_NODEID = 2;
    /**
     * id of node
     */
    private Integer id;

    /**
     * nr of hex bytes for en- and decoding e.g. (x0001) has 2 bytes
     */
    private int nrBytes;

    /**
     * data store, represented as int array
     */
    private int[] data;

    /**
     *
     * @param id
     */
    public ZusiProtocolNode(int id){
        this(id, "");
    }

    /**
     *
     * @param hexId
     */
    public ZusiProtocolNode(String hexId){
        this(Integer.valueOf(hexId, 16), "");
    }

    /**
     *
     * @param hexId
     */
    public ZusiProtocolNode(String hexId, String data){
        this(Integer.valueOf(hexId, 16), data);
    }

    /**
     *
     * @param id
     * @param data
     */
    public ZusiProtocolNode(int id, String data){
        this.id = id;
        this.data = convertData(data);
        this.nrBytes = data.length();
    }

    /**
     *
     * @param id
     * @param data
     */
    public ZusiProtocolNode(int id, String data, int nrBytes){
        this.id = id;
        this.data = convertData(data);
        this.nrBytes = nrBytes;
    }

    /**
     *
     * @param id
     * @param data
     */
    public ZusiProtocolNode(int id, int data, int nrBytes){
        this.id = id;
        this.data = getArray(data, nrBytes);
        this.nrBytes = nrBytes;
    }

    /**
     *
     * @param id
     * @param data
     */
    public ZusiProtocolNode(int id, int data){
        this(id, data, 2);
    }

    /**
     *
     * @param data
     * @return
     */
    private int[] convertData(String data){
        int dataArray[]= new int[data.length()];

        for(int i=0; i<data.length();i++){
            dataArray[i] = Integer.valueOf(data.charAt(i));
        }

        return dataArray;
    }

    /**
     *
     * @return
     */
    public int getNrBytes(){
        return nrBytes;
    }

    /**
     *
     * @return
     */
    public int[] getDataAsArray(){
        return data;
    }

    /**
     *
     * @return
     */
    public String getDataAsHex(int length){
        return UtilConvertingHex.toHex(data, length);
    }

    /**
     *
     * @return
     */
    public Integer getId(){
        return id;
    }

    /**
     *
     * @return
     */
    public String getIdAsHex(){
        return UtilConvertingHex.toHex(id, 4);
    }

    /**
     *
     * @param data
     * @return
     */
    private int[] getArray(int data, int length){
        int[] a = new int[length];
        for(int i=0; i<length;i++){
            if(i<length-1) {
                a[i] = 0;
            }else{
                a[i] = data;
            }
        }

        return a;
    }

}

