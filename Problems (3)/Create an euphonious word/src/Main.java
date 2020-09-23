import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();

        char[] inputArr = input.toCharArray();
        int vowelsCnt = 0;
        int result = 0;
        int notVowelCnt = 0;
        for (char c : inputArr) {
            if (c == 'a' || c == 'e' || c == 'i'
                    || c == 'o' || c == 'u' || c == 'y') {
                vowelsCnt++;
                if (vowelsCnt == 3) {
                    result++;
                    vowelsCnt = 1;
                }
                notVowelCnt = 0;
            } else {
                notVowelCnt++;
                if (notVowelCnt == 3) {
                    result++;
                    notVowelCnt = 1;
                }
                vowelsCnt = 0;
            }
        }

        System.out.println(result);
    }

}