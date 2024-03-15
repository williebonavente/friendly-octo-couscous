import java.util.Scanner;

public class CharacterContinue {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        char x = ' ';
        do {
            for (int i = 0; i < 3; i++) {
                System.out.print("Enter a character: ");
                x = scan.next().charAt(0);
                if (Character.isDigit(x)) {
                    i--; // decrement i to repeat the iteration
                    continue;
                }
                // print the character three times
                for (int j = 0; j < 3; j++) {
                    System.out.print(x + " ");
                }
                System.out.println();
            }
        } while (x != 'X' && x != 'x');
        scan.close();
    }
}