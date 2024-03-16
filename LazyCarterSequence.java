import java.util.Scanner;

public class LazyCarterSequence {
    public static void main(String[] args) {
                // Formula Cn = n(n+1)/2+1
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for(int i = 0; i < n; i++){
            int sum = i * (i + 1) / 2 + 1;
            System.out.println(sum + " ");
        }
        in.close();
    }    
}
