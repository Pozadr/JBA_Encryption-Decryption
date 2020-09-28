package encryptdecrypt;

abstract class Cipher {
    protected String data;
    protected int key;
    public Cipher (String data, int key) {
        this.data = data;
        this.key = key;
    }
    public abstract String encode();
    public abstract String decode();
    public abstract String getAlgorithmName();


}
