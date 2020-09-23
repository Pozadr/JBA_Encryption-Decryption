package encryptdecrypt;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String command = scanner.nextLine().trim();
        String input = scanner.nextLine();
        int key = scanner.nextInt();
        StringBuilder result = new StringBuilder();

        switch (command){
            case "enc": {
                for (char ch : input.toCharArray()) {
                    int val = ch;
                    val = val + key;
                    result.append((char) val);
                }
                break;
            }
            case "dec": {
                for (char ch : input.toCharArray()) {
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
