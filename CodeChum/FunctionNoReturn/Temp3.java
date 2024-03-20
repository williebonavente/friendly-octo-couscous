package FunctionNoReturn;
public class Temp3 {
    public static void main(String[] args) {
        
        love();
    }

    public static void love() {
        for(int i = 0; i < 4; i++) {
            String indentation = " ".repeat(i * 2);
            System.out.println(indentation + "I love programming");
        }
    }
}