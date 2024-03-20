package Enumss;
enum Countries {
    CANADA(23),
    THAILAND(100),
    VIETNAM(33),
    PHILIPPINES(22),
    SINGAPORE(50),
    CHINA(98);

    private final int value;

    Countries(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}

public class Enums4 {
    private static Countries Countries;

    public static void main(String[] args) {
        @SuppressWarnings("static-access")
        Countries country = Countries.PHILIPPINES;

        System.out.print(country.getValue());
    }
}
    