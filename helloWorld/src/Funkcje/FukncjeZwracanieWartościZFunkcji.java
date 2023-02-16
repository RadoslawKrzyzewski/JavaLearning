package Funkcje;

public class FukncjeZwracanieWartościZFunkcji {

    public static void main(String[] args) {
        int sum = add(2, 5);
        System.out.println(sum);

        System.out.println(add(10, 5));          // też tak można
    }

    public static int add(int a, int b) {
        return a + b;
    }
}
