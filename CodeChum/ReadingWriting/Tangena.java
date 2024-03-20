import java.util.Scanner;
import java.io.PrintWriter;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Tangena {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Character> letters = new ArrayList<>();
        List<Character> numbers = new ArrayList<>();

        while (true) {
            System.out.print("Enter a character: ");
            String input = scanner.nextLine();

            if (input.length() != 1) {
                break;
            }

            char charInput = input.charAt(0);

            if (Character.isLetter(charInput)) {
                letters.add(charInput);
            } else if (Character.isDigit(charInput)) {
                numbers.add(charInput);
            } else {
                break;
            }
        }

        // Create the letters directory and file
        File lettersDir = new File("letters");
        lettersDir.mkdirs();
        try (PrintWriter lettersWriter = new PrintWriter(new File(lettersDir, "inputted.txt"), "UTF-8")) {
            for (char letter : letters) {
                lettersWriter.println(letter);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Create the numbers directory and file
        File numbersDir = new File("numbers");
        numbersDir.mkdirs();
        try (PrintWriter numbersWriter = new PrintWriter(new File(numbersDir, "inputted.txt"), "UTF-8")) {
            for (char number : numbers) {
                numbersWriter.println(number);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}