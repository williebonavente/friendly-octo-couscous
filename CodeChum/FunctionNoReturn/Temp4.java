package FunctionNoReturn;
import java.util.Scanner;

public class Temp4 {
    public static void main(String[] args) {

        printNumbers();

    }

    public static void printNumbers() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int num = in.nextInt();

        boolean isFirst = true;

        for (int i = 1; i <= num; i++) {
            if (!isFirst) {
                System.out.print(", ");
            }
            System.out.print(i);
            isFirst = false;
        }
        in.close();

    }
}
