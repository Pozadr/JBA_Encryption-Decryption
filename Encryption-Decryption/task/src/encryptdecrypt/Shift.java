package encryptdecrypt;

public class Shift extends Cipher {

    public Shift(String data, int key) {
        super(data, key);
    }

    @Override
    public String encode() {
        return null;
    }

    @Override
    public String decode() {
        return null;
    }

    @Override
    public String getAlgorithmName() {
        return "Shift";
    }
}
