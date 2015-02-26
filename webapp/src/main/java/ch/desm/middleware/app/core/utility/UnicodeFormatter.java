package ch.desm.middleware.app.core.utility;

/**
 * Created by Sebastian on 24.02.2015.
 */
public class UnicodeFormatter  {

    static public String byteToHex(byte b) {
        // Returns hex String representation of byte b
        char hexDigit[] = {
                '0', '1', '2', '3', '4', '5', '6', '7',
                '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'
        };
        char[] array = { hexDigit[(b >> 4) & 0x0f], hexDigit[b & 0x0f] };
        String f = new String(array);
        return f;
    }

    static public String charToHex(char c) {
        // Returns hex String representation of char c
        byte hi = (byte) (c >>> 8);
        byte lo = (byte) (c & 0xff);
        return byteToHex(hi) + byteToHex(lo);
    }

    static public String removeControleCharacter(String message){
        return message.replaceAll("[\u0000-\u001f]", "");
    }

} // class
