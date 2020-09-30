import java.util.Scanner;

class Time {

    int hour;
    int minute;
    int second;

    public static Time noon() {
        // write your code here
        Time noon = new Time();
        noon.hour = 12;
        noon.minute = 0;
        noon.second = 0;
        return noon;
    }

    public static Time midnight() {
        // write your code here
        Time midnight = new Time();
        midnight.hour = 0;
        midnight.minute = 0;
        midnight.second = 0;
        return midnight;
    }

    public static Time ofSeconds(long seconds) {
        // write your code here
        Time ofSeconds = new Time();
        ofSeconds.hour = (int) (seconds / 3600) % 24;
        ofSeconds.minute = (int) (seconds / 60) % 60;
        ofSeconds.second = (int) seconds % 60;
        return ofSeconds;
    }

    public static Time of(int hour, int minute, int second) {
        // write your code here
        if (isInRange(hour, 0, 23) && isInRange(minute, 0, 59)
                && isInRange(second, 0, 59)) {
            Time of = new Time();
            of.hour = hour;
            of.minute = minute;
            of.second = second;
            return of;
        } else {
            return null;
        }
    }

    private static boolean isInRange(int number, int min, int max) {
        return number >= min && number <= max;
    }
}

/* Do not change code below */
public class Main {

    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);

        final String type = scanner.next();
        Time time = null;

        switch (type) {
            case "noon":
                time = Time.noon();
                break;
            case "midnight":
                time = Time.midnight();
                break;
            case "hms":
                int h = scanner.nextInt();
                int m = scanner.nextInt();
                int s = scanner.nextInt();
                time = Time.of(h, m, s);
                break;
            case "seconds":
                time = Time.ofSeconds(scanner.nextInt());
                break;
            default:
                time = null;
                break;
        }

        if (time == null) {
            System.out.println(time);
        } else {
            System.out.println(String.format("%s %s %s", time.hour, time.minute, time.second));
        }
    }
}
