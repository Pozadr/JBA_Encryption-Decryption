package encryptdecrypt;

public class Cipher {

    static public String encode (String data, int key){
        StringBuilder result = new StringBuilder();

        for (char ch : data.toCharArray()) {
            int val = ch;
            val = val + key;
            result.append((char) val);
        }
        return result.toString();
    }


    static public String decode (String data, int key) {
        StringBuilder result = new StringBuilder();

        for (char ch : data.toCharArray()) {
            int val = ch;
            val = val - key;
            result.append((char) val);
        }
        return result.toString();
    }

}
