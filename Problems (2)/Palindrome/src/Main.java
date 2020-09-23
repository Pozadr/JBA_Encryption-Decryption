import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine().trim();

        char[] inputArr = input.toCharArray();
        boolean result = true;
        for (int i = 0; i < inputArr.length; i++) {
            if (inputArr[i] != inputArr[inputArr.length - 1 - i]) {
                result = false;
                break;
            }
        }
        System.out.println(result ? "Yes" : "no");
    }
}