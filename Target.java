import java.util.Scanner;

public class Target {
    public static void main(String[]args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter target value: ");
        int target = in.nextInt();
        System.out.println("Enter the values: ");
        int sum = 0;
        int values;
        do {
            values = in.nextInt();
            if (values == -1) {
                break;
            }
            sum += values;
        } while(sum <= target || sum == target);
        System.out.print("Sum: " + sum);
        in.close();
    }
}