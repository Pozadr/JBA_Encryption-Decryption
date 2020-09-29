package encryptdecrypt;

interface CipherMethod {
    String encode(String data, int key);
    String decode(String data, int key);
    String getAlgorithmName();

}
