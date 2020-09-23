package encryptdecrypt;

public class Main {
    public static void main(String[] args) {
        String message = "we found a treasure!";
        char[] chArr = new char[message.length()];

        for (int i = 0; i < message.length(); i++) {
            char ch = message.charAt(i);
            switch (ch){
                case 'a': ch = 'z'; break;
                case 'b': ch = 'y'; break;
                case 'c': ch = 'x'; break;
                case 'd': ch = 'w'; break;
                case 'e': ch = 'v'; break;
                case 'f': ch = 'u'; break;
                case 'g': ch = 't'; break;
                case 'h': ch = 's'; break;
                case 'i': ch = 'r'; break;
                case 'j': ch = 'q'; break;
                case 'k': ch = 'p'; break;
                case 'l': ch = 'o'; break;
                case 'm': ch = 'n'; break;
                case 'n': ch = 'm'; break;
                case 'o': ch = 'l'; break;
                case 'p': ch = 'k'; break;
                case 'q': ch = 'j'; break;
                case 'r': ch = 'i'; break;
                case 's': ch = 'h'; break;
                case 't': ch = 'g'; break;
                case 'u': ch = 'f'; break;
                case 'v': ch = 'e'; break;
                case 'w': ch = 'd'; break;
                case 'x': ch = 'c'; break;
                case 'y': ch = 'b'; break;
                case 'z': ch = 'a'; break;
                default:
            }
            chArr[i] = ch;
        }
        for (char ch : chArr){
            System.out.print(ch);
        }
    }
}
