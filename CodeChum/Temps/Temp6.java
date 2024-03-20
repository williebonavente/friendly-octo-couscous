package Temps;
import java.util.Scanner;

public class Temp6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int size = in.nextInt();
        int[] array = new int[size];
        System.out.print("Enter array values: ");
        for (int i = 0; i < array.length; i++) {
            array[i] = in.nextInt();
        }
       System.out.print("Enter starting range: ");
        int x = in.nextInt();
       System.out.print("Enter end range: ");
        int y = in.nextInt();
        
    }

    public static void sumAtRange(int arr[], int size) {
        for(int i = 0; i < size; i++) {
            if(arr[i] % 2  == 0) {
                System.out.print(arr[i] + " ");
            }
        }
    }
}