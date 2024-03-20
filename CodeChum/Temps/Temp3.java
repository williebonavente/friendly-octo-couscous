package Temps;
import java.util.Scanner;

public class Temp3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first character: ");
        char a = scanner.next().charAt(0);
        System.out.print("Enter second character: ");
        char b = scanner.next().charAt(0);

        char[] characters = new char[2];
        characters = combineChars(a, b);
        for (int i = 0; i < characters.length; i++) {
            System.out.println(characters[i]);
        }

    }

    public static char[] combineChars(char a, char b) {
        return new char[] { a, b };
    }
}