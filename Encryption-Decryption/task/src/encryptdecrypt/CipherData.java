package encryptdecrypt;

public class CipherData {
    private CipherMethod method;

    public void setMethod(CipherMethod method) {
        this.method = method;
    }

    public String encode(String data, int key) {
        return this.method.encode(data, key);
    }

    public String decode(String data, int key) {
        return this.method.decode(data, key);
    }

    public void getAlgorithmName() {
        this.method.getAlgorithmName();
    }


}
