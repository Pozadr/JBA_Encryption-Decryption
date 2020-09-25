import java.util.ArrayList;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> inputList = new ArrayList<>();
        do {
            String tmp = scanner.next().trim();
            if ("0".equals(tmp)) {
                break;
            } else {
                inputList.add(tmp);
            }
        } while (true);


        for (String s : inputList) {
            try {
                System.out.println(Integer.parseInt(s) * 10);
            } catch (Exception e) {
                System.out.println("Invalid user input: " + s);
            }
        }


    }
}