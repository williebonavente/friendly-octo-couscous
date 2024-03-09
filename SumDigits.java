import java.util.Scanner;

public class SumDigits {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number between 0 and 1000: ");
        int inputNumber = input.nextInt();
        
        int digit1 = inputNumber % 10;
        int digit2 = (inputNumber / 10) % 10;
        int digit3 = (inputNumber / 100) % 10;
        int digit4 = (inputNumber / 1000) % 10;
        
        int sum = digit1 + digit2 + digit3 + digit4;
        
        System.out.println("The sum of the digits is " + sum);
        input.close();
    }
}

