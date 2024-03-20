import java.io.File;
import java.io.IOException;

public class Creating {
    public static void main(String[] args) {
        File file = new File("files/example.txt"); // Update the file path to include the "files" directory
        try {
            if (file.createNewFile()) {
                System.out.println("File created successfully");
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            System.out.println("Failed to create the file.");
        }
    }
}