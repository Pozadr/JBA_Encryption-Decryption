package encryptdecrypt.cipher;

public class CipherFactory {

    public static CipherMethod newInstance(String alg) {
        if ("unicode".equals(alg)) {
            return new UnicodeCipherMethod();
        } else {  //shift
            return new ShiftCipherMethod();
        }
    }

}
