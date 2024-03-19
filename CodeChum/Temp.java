import java.util.Scanner;

public class Temp {
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int size = in.nextInt();
        int [] array = new int[size];
        System.out.println("Enter elements of the array: ");
        for(int i = 0; i < array.length; i++){
            array[i] = in.nextInt();
        }
        System.out.print("Enter x: ");
        int target = in.nextInt();
        int index = linearSearch(array, target);
        if(index != -1) {
            System.out.println( target + " exists in the array ");
        } 
        in.close();
    }

    public static int linearSearch(int[] arr, int target) {
	for (int i = 0; i < arr.length; i++) {
	if (arr[i] == target) {
	return i; // Return the index of the target element if found
		}
	}
		return -1; // Return -1 if the element is not found in the array
	}

    
}