import java.util.Scanner;

public class DivisiBle {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n;
        do {
            System.out.print("Enter value: ");
            n = in.nextInt();
        } while (n % 3 != 0 || n % 5 != 0);
    }
}