package FunctionNoReturn;
import java.util.Scanner;

public class Temp5 {
    public static void printHelloWorld() {
        System.out.println("Hello World");
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int size = in.nextInt();
        for(int i = 0; i < size; i++) {
            printHelloWorld();
        }
        in.close();
    }
}