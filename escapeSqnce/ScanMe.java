package escapeSqnce;

import java.util.Scanner;


public class ScanMe {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();
        System.out.println("Your age is: " + age);

        scanner.close();
    }
}

/*
 
For Others
For reading other data types, you can use similar methods of Scanner class:

Long Integer: long longIntVariable = scanner.nextLong();
Floating-Point Number (Float): float floatVariable = scanner.nextFloat();
Double: double doubleVariable = scanner.nextDouble();
Character: char charVariable = scanner.next().charAt(0);
Boolean: boolean booleanVariable = scanner.nextBoolean();

 */