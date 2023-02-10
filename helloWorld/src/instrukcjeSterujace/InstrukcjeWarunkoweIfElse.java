package instrukcjeSterujace;

public class InstrukcjeWarunkoweIfElse {
    public static void main(String[] args) {
        int number = -10;

        if (number > 0) {
            System.out.println("Liczba większa od 0");
        } else if (number == 0) {
            System.out.println("Liczba jest równa 0");
        } else {
            System.out.println("Liczba mniejsza od 0");
        }

    }
}
