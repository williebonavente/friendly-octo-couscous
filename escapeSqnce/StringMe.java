package escapeSqnce;

import java.util.Scanner;

public class StringMe {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter string: ");
        String str1 = scanner.nextLine();
        System.out.print("Enter another string: ");
        String str2 = scanner.nextLine();
        String str3 = str1.substring(0);
    
        
        boolean isEqual = str1.equals(str2);

        int result = str1.compareTo(str2);

        System.out.println("Content comparison: " + isEqual);
        System.out.println("Lexicographic comparison: " + result);
        System.out.println("Copied string: " + str3);


        scanner.close();

    }
}
