import java.util.Scanner;

public class Testing {
    public static void main(String[] args) {

        int total = 50;

        // Hey there, start typing your Java code here...
        Scanner in = new Scanner(System.in);
        System.out.print("Enter first positive integer: ");
        int first = in.nextInt();
        System.out.print("Enter second positive integer: ");
        int second = in.nextInt();
        int sum = first + second;
        if (sum % 2 == 0) {
            System.out.print((sum + total));    
        }
        else {
        if (first % 2 == 0) {
            int firstOnly = first + total - second;
            System.out.print(firstOnly);
        } else {
            if (second % 2 == 0) {
                int secondOnly = second + total - first;
                System.out.print(secondOnly);
            }     
        }
        
            int diff = second - first;
            System.out.print(diff);
            }
        }
        
        in.close();
	    }
    }
}