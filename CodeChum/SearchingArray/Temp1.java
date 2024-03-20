package SearchingArray;
import java.util.Scanner;

public class Temp1 {
    public static void main (String[]args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = in.nextInt();
        int [] array = new int [size];
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < array.length; i++) {
            array[i] = in.nextInt();
        }

        System.out.print("Enter x: ");
        int x = in.nextInt();
        System.out.print("Enter y: ");
        int y = in.nextInt();
        
        // Inclusive element for x and y
        for(int i = 0; i < array.length; i++) {
            if(array[i] >= x && array[i] <= y) {
                System.out.println(array[i] + " is between " + x + " and " +  y);
            }
        }
        
        in.close();
    }
}