package encryptdecrypt.cipher;

public class ShiftCipherMethod implements CipherMethod {

    @Override
    public String encode(String data, int key) {
        StringBuilder result = new StringBuilder();

        for (char ch : data.toCharArray()) {
            int val = ch;
            if (val >= 65 && val <= 90) {
                val = val + key;
                if (val > 90) {
                    val = 64 + (val % 90);
                }
            } else if (val >= 97 && val <= 122) {
                val = val + key;
                if (val > 122) {
                    val = 96 + (val % 122);
                }
            }
            result.append((char) val);
        }
        return result.toString();
    }

    @Override
    public String decode(String data, int key) {
        StringBuilder result = new StringBuilder();

        for (char ch : data.toCharArray()) {
            int val = ch;
            if (val >= 65 && val <= 90) {
                val = val - key;
                if (val < 65) {
                    val = 91 - (65 - val);
                }
            } else if (val >= 97 && val <= 122) {
                val = val - key;
                if (val < 97) {
                    val = 123 - (97 - val);
                }
            }
            result.append((char) val);
        }
        return result.toString();
    }

    @Override
    public String getAlgorithmName() {
        return "Shift";
    }
}
