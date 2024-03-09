import java.util.Scanner;

public class Mode {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the list: ");
        int size =  scanner.nextInt();
        int [] arr = new int [size];
        int maxCount = 0;
        int mode = 0;
        int count = 0;
        System.out.print("Enter " +  size + " numbers: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }
        for(int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if(arr[i] == arr[j]) {
                    count++;
                }
            }
            if(count > maxCount) {
                maxCount = count;
                mode = arr[i];
            }
        }
        System.out.println("Mode = " + mode);
        scanner.close();
    }
}
