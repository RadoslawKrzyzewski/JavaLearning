package podstawyJezykaJava;

public class OperatoryLogiczne {
    public static void main(String[] args) {
        boolean zmienna;
        zmienna = 2 == 1 || 5 > 10;         // lub
        zmienna = 2 == 2 && 15 > 10;        // i
        zmienna = !(2 == 0);                // negacja

        zmienna = true || false && false;   // najpierw jest and a potem or - zawsze!!!

        System.out.println(zmienna);
    }
}
