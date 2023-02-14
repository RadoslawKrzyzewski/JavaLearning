package instrukcjeSterujace;

public class PętleInstrukcjeSkoku {

    public static void main(String[] args) {

        int i = 0;

        while (true) {
            i++;
            if (i % 2 == 1) {           // liczby nieparzyste
                continue;
            }
            System.out.println(i);
            if (i >= 10) {
                break;
            }
        }

    }
}
