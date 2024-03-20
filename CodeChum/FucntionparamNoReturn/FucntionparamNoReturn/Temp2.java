package FucntionparamNoReturn;
import java.util.Scanner;

public class Temp2 {
    public static void main(String[] args) {
        System.out.println(addTen());
    }

    public static int addTen() {
        try (Scanner in = new Scanner(System.in)) {
            System.out.print("Enter an integer: ");
            int num = in.nextInt();

            return num + 10;
        }
    }
}
