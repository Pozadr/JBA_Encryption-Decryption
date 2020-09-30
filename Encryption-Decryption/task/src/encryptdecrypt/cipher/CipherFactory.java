package encryptdecrypt.cipher;

public class CipherFactory {

    public static CipherMethod newInstance(String alg) {
        switch (alg) {
            case "unicode": {
                return new UnicodeCipherMethod();
            }
            case "shift": {
                return new ShiftCipherMethod();
            }
            default: {
                return null;
            }
        }
    }

}
