package podstawyJezykaJava;

public class SkroconeOperatoryArytmetyczne {
    public static void main(String[] args) {
        int a;
        a = 10;
        //       a = a +5;         ale można też szybciej używając skróconego oparatora arytmetycznego:
        a += 5;
        a -= 2;
        a *= 2;
        a /= 2;
        a %= 5;

        System.out.println(a);
    }
}
