package Array;

import java.util.Random;

public class Randomly {
    public static void main(String[]args) {
        Random random = new Random();
        int [] myList = new int[5];
        for(int i = 0; i < myList.length; i++) {
            myList[i] = random.nextInt(101);
            System.out.println(myList[i]);
        }
    }
}
