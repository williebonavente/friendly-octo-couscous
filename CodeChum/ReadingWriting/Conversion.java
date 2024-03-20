import java.io.*;
import java.util.*;

public class Conversion {
    public static void main(String[] args) throws IOException {
        // Open the file in read mode
        File file = new File("data.txt");
        Scanner scanner = new Scanner(file);

        // List to store the squares
        List<Integer> squares = new ArrayList<>();

        // Read each line, convert to integer, calculate the square, and store in the list
        while (scanner.hasNextLine()) {
            int num = Integer.parseInt(scanner.nextLine());
            squares.add(num * num);
        }
        scanner.close();

        // Open the file in append mode
        FileWriter dataFile = new FileWriter("data.txt", true);

        // Write the squares to the file
        for (int square : squares) {
            dataFile.write("\n" + square);
        }
        dataFile.close();
    }
}