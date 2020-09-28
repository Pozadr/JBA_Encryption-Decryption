package encryptdecrypt;

public class Unicode extends Cipher {

    public Unicode(String data, int key) {
        super(data, key);
    }

    @Override
    public String encode (){
        StringBuilder result = new StringBuilder();

        for (char ch : data.toCharArray()) {
            int val = ch;
            val = val + key;
            result.append((char) val);
        }
        return result.toString();
    }

    @Override
    public String decode () {
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
