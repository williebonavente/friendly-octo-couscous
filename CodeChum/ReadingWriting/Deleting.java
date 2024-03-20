import java.io.File;

public class Deleting {

    public static void main(String[] args) {
        File file = new File("files/example.txt");
        if(file.delete()) {
            System.out.println("File deleted successfully");
        } else {
            System.out.println("Failed to delete the file ");

        }
    }

}
