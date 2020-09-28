package encryptdecrypt;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {

        // default settings
        String mode = "enc";
        int key = 0;
        String data = "";
        String inPath = "empty";
        String outPath = "empty";
        String alg = "shift";

        // check input from console String[] args
        for (int i = 0; i < args.length; i = i + 2) {
            switch (args[i]) {
                case "-mode": {
                    mode = args[i + 1];
                    break;
                }
                case "-key": {
                    key = Integer.parseInt(args[i + 1]);
                    break;
                }
                case "-data": {
                    data = args[i + 1];
                    break;
                }
                case "-in": {
                    inPath = args[i + 1];;
                    break;
                }
                case "-out": {
                    outPath = args[i + 1];
                    break;
                }
                case "-alg": {
                    alg = args[i + 1];
                }
                default: {
                    break;
                }
            }
        }

        // check the input path and read the file to one String
        if (!"empty".equals(inPath)) {
            try {
                data = (FileData.readFileAsString(inPath));
            } catch (IOException e) {
                System.out.println("Cannot read file: " + e.getMessage());
            }
        }

        // creating cipher object depends on user input
        Cipher cipher;
        if ("unicode".equals(alg)) {
            cipher = new Unicode(data, key);
        } else {
            cipher = new Shift(data, key);
        }


        switch (mode){
            case "enc":
            {
                if ("empty".equals(outPath)) {
                    System.out.println(cipher.encode());
                    break;
                } else { // outPath not empty
                    FileData.writeStringToFile(outPath, cipher.encode());
                }
                break;
            }
            case "dec": {
                if ("empty".equals(outPath)) {
                    System.out.println(cipher.decode());
                    break;
                } else { // outPath not empty
                    FileData.writeStringToFile(outPath, cipher.decode());
                }
                break;

            }
            default: {
                System.out.println("Wrong input command");
            }
        }

    }
}
