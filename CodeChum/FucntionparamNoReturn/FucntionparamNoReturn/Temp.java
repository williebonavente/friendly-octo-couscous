package FucntionparamNoReturn;
import java.util.Random;
public class Temp {
    public static int generateNumbers(){
        Random random = new Random();
        int randomNumber = random.nextInt(100);
        return randomNumber;
    }



    public static void main(String[] args) {
        int randomNumber = generateNumbers();
        System.out.println("The random number is: " + randomNumber);
    }
}
