import java.io.File;
import java.util.Scanner;
import java.io.IOException;

public class Deletion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter file to remove: ");
        int want = scanner.nextInt();
        try {
            File test1 = new File("test1.txt");
            test1.createNewFile();
            File test2 = new File("test2.txt");
            test2.createNewFile();
            File test3 = new File("test3.txt");
            test3.createNewFile();

            if(want == 1) {
                test1.delete();
            } else if(want == 2) {
                test2.delete();
            } else if (want == 3) {
                test3.delete();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}