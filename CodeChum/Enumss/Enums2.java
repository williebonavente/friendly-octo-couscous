package Enumss;
import java.util.Scanner;

enum Week {
    MON("Monday"), // 0
    TUE("Tuesday"), // 1
    WED("Wednesday"), // 2
    THU("Thursday"), // 3
    FRI("Friday"), // 4
    SAT("Saturday"), // 5
    SUN("Sunday"); // 6

    private final String day;

    Week(String day) {
        this.day = day;
    }

    public String getDay() {
        return day;
    }
}

public class Enums2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter day number: ");
        int day = scanner.nextInt();

        if (day >= 0 && day < Week.values().length) {
            System.out.println(Week.values()[day].getDay());
        } else {
            System.out.println("Invalid input");
        }

        scanner.close();
    }
}