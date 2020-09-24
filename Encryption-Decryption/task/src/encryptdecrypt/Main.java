package encryptdecrypt;

public class Main {
    public static void main(String[] args) {

        String mode = "enc";
        int key = 0;
        String data = "";

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
                default: {
                    break;
                }
            }
        }

        StringBuilder result = new StringBuilder();

        switch (mode){
            case "enc": {
                for (char ch : data.toCharArray()) {
                    int val = ch;
                    val = val + key;
                    result.append((char) val);
                }
                break;
            }
            case "dec": {
                for (char ch : data.toCharArray()) {
                    int val = ch;
                    val = val - key;
                    result.append((char) val);
                }
                break;
            }
            default: {
                System.out.println("Wrong input command");
            }
        }
        System.out.println(result);

    }
}
