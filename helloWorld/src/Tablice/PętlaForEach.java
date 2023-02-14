package Tablice;

public class PętlaForEach {
    public static void main(String[] args) {
        String[] colors = {"red", "green", "blue", "black", "white"};
        System.out.println("For:");
        for (int i = 0; i < colors.length; i++) {
            System.out.println(colors[i]);
        }

        System.out.println();
        System.out.println("For each:");
        for (String item : colors) {
            System.out.println(item);
        }
    }
}
