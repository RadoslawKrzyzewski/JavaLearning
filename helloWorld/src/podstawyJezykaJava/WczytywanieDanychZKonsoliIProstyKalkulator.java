package podstawyJezykaJava;

import java.util.Scanner;

public class WczytywanieDanychZKonsoliIProstyKalkulator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a, b;
        System.out.println("Podaj wartość a = ");
        a = Integer.parseInt(scanner.nextLine());   // pierwszy sposób
        System.out.println("Podaj wartość b = ");
        b = scanner.nextInt();                      // drugi, szybszy sposób

        System.out.println("Wynik dodawania: " + (a + b));
        System.out.println("Wynik odejmowania: " + (a - b));
        System.out.println("Wynik mnożenia: " + (a * b));
        if (b != 0) {
            System.out.println("Wynik dzielenia: " + ((float) a * (float) b));
            System.out.println("Reszta z dzielenia: " + (a % b));
        } else {
            System.out.println("Dzielenie przez 0 zabronione");
        }
    }
}
