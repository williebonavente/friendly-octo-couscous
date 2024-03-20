package Temps;
import java.util.Scanner;

public class ArrayMe {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int size = in.nextInt();
        int[] array = new int[size];
        System.out.print("Enter array values: ");
        for (int i = 0; i < array.length; i++) {
            array[i] = in.nextInt();
        }
        displayArray(array, size);
        in.close();
    }

    public static void displayArray(int arr[], int size) {
        boolean isFirst = true;
        for (int i = 0; i < arr.length; i++) {
            if (!isFirst) {
                System.out.print(", ");
            }
            System.out.print(arr[i]);
            isFirst = false;
        }
    }
}
