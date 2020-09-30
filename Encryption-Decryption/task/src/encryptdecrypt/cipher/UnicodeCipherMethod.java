package encryptdecrypt.cipher;

import encryptdecrypt.CipherMethod;

public class UnicodeCipherMethod implements CipherMethod {

    @Override
    public String encode (String data, int key){
        StringBuilder result = new StringBuilder();

        for (char ch : data.toCharArray()) {
            int val = ch;
            val = val + key;
            result.append((char) val);
        }
        return result.toString();
    }

    @Override
    public String decode (String data, int key) {
        StringBuilder result = new StringBuilder();

        for (char ch : data.toCharArray()) {
            int val = ch;
            val = val - key;
            result.append((char) val);
        }
        return result.toString();
    }

    @Override
    public String getAlgorithmName() {
        return "Unicode";
    }

}
