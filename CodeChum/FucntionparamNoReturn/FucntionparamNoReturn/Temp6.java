package FucntionparamNoReturn;
import java.util.Scanner;

public class Temp6 {

    public static int[] getIntegers() {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter first number: ");
            int a = scanner.nextInt();
            System.out.print("Enter second number: ");
            int b = scanner.nextInt();
            System.out.print("Enter third number: ");
            int c = scanner.nextInt();

            return new int[] { a, b, c };
        }
    }

    public static void main(String[] args) {

        int[] arr = new int[3];
        arr = getIntegers();
        boolean isFirst = true;
        for (int i = 0; i < 3; i++) {
            if (!isFirst) {
                System.out.print(", ");
            }
            System.out.print(arr[i]);
            isFirst = false;
        }
    }
}