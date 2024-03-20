package Temps;
import java.util.Scanner;

public class Temp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = in.nextInt();
        ageTeller(age);
        
        in.close();
    }

    public static void ageTeller(int age) {
        System.out.print("Your age is " + age);
    } 
}
