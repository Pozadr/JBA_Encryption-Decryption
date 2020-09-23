import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine().trim();

        char[] inputArr = input.toCharArray();
        for (char ch : inputArr) {
            System.out.print(ch);
            System.out.print(ch);
        }
    }
}