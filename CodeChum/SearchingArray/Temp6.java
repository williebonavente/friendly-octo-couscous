package SearchingArray;
import java.util.Scanner;

public class Temp6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int size = in.nextInt();
        int[] array = new int[size];
        System.out.println("Enter elements of the array: ");
        for (int i = 0; i < array.length; i++) {
            array[i] = in.nextInt();
        }
        boolean found = false;
        System.out.print("Enter x: ");
        int x = in.nextInt();
        for (int i = 0; i < array.length; i++) {
            if (array[i] == x) {
                found = true; // Set found to true when element is found
                System.out.println(array[i]  + " is found at index " + i);
            }
        }
        if(!found) { // Use !found instead of found == false
            System.out.println(x + " does not exist in the array ");
        }
        in.close();
    }
}