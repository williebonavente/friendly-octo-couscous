import java.util.Scanner;


public class TempTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first string: ");
        String str1 = scanner.nextLine();
        System.out.print("Enter second string: ");
        String str2 = scanner.nextLine();
        System.out.print("Enter third string: ");
        String str3 = scanner.nextLine();
        String concat = String.join(" ,", str1, str2, str3);
        System.out.println(concat);
        scanner.close();
    }
}
