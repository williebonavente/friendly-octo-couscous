import java.util.Scanner;

public class VowelMovement {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        char inChar;
        do {
            System.out.print("Enter a character: ");
            inChar = in.next().charAt(0);
            System.out.println(inChar);
        } while (!isVowel(inChar));
        System.out.print(inChar);
        in.close();
    }

    public static boolean isVowel(char c) {
        c = Character.toLowerCase(c);
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }
}
