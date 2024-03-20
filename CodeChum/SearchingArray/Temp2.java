package SearchingArray;
import java.util.Scanner;

public class Temp2 {
    public static void main (String[]args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int size = in.nextInt();
        int [] array = new int [size];
        System.out.println("Enter elements of the array: ");
        for (int i = 0; i < array.length; i++) {
            array[i] = in.nextInt();
        }

        System.out.print("Enter x: ");
        int x = in.nextInt();
        System.out.print("Enter y: ");
        int y = in.nextInt();
        int counter = 0;
        
        // Inclusive element for x and y
        for(int i = 0; i < array.length; i++) {
           if(array[i] == x) {
               counter++;
           }
        }

        if(y == counter) {
              System.out.print(x + " exists exactly " + y + " times in the array ");  
            }
        
        in.close();
    }
}