package FucntionparamNoReturn;
import java.util.Scanner;

public class Temp3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        char firstChar = combineChar(in);
        char secondChar = combineChar(in);
        System.out.println(firstChar + "" + secondChar); // Concatenate the characters as strings
        in.close();
    }

    public static char combineChar(Scanner in) {
        System.out.print("Enter a character: "); // Update the prompt message
        char character = in.next().charAt(0);
        return character;
    }
}
