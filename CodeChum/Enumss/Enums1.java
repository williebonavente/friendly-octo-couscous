package Enumss;
public class Enums1 {
    
    public static void main(String[] args) {
        
        
    }
    
    enum Months {
        JANUARY(1),
        FEBRUARY(2),
        MARCH(3),
        APRIL(4),
        MAY(5),
        JUNE(6),
        JULY(7);

        private final int value;

        Months(int value) {
            this.value = value;
        }

        public int getValue() {
            return value;
        }
    }
}
