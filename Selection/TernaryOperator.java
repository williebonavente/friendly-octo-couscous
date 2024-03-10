package Selection;

import java.util.Scanner;

public class TernaryOperator {
    public static void main(String[]args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter three integers: ");
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        int z = scanner.nextInt();
        
        System.out.println((x < y && y < z) ? "sorted" : "not sorted");
        
        // Rewrite the following 
        int age = 16;
        int ticket = (age >= 16) ? 20 : 10;
        System.out.println(ticket);
        
        scanner.close();
    }
}
