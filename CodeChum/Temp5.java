import java.util.Scanner;

public class Temp5 {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int size = in.nextInt();
        int[] array = new int[size];
        System.out.println("Enter elements of the array: ");
        for (int i = 0; i < array.length; i++) {
            array[i] = in.nextInt();
        }

        System.out.print("Enter x: ");
        int x = in.nextInt();
        int greatest = 0; 
        if (array.length > 0) {
            for (int i = 0; i < array.length; i++) {
                if (array[i] % x == 0 && array[i] >= x) {
                    if (array[i] > greatest) {
                        greatest = array[i];
                    } else {
                        greatest = array[i];
                    }
                }
            }
        }
        if (greatest == 0) {
            return;
        } else {
            System.out.print(greatest);
        }
        
        in.close();
    }
}