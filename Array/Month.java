package Array;

import java.util.Scanner;
public class Month {
    public static void main(String[]args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter an integer representing month: ");
        int month = in.nextInt();
        String[]months = {"January", "February", "March", 
                            "April", "May", "June", "July", "August",
                            "September", "October", "November", "December"};
        
        if (month >= 1 && month <= 12) {
           for(int i = 0; i < months.length; i++){
               if(i != month) {
                   break;
               }
           }
            System.out.print(months[month - 1]);
       }
        else {
            System.out.print("Invalid month");
        }
        in.close();
    }
}
