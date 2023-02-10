package podstawyJezykaJava;

public class TypyDanych {
    public static void main(String[] args) {

        /* LICZBOWE - CALKOWTE */
        byte zmByte = Byte.MAX_VALUE;       // tak można sprawdzić max wartość dla zmiennej
        short zmShort = Short.MAX_VALUE;
        int zmInt = Integer.MAX_VALUE;
        long zmLong = Long.MAX_VALUE;

        /* LICZBOWE - ZMIENNOPRZECINKOWE */
        float zmFloat = 25.525F;
        double zmDouble = 50.782D;          // ma podwójnie większą precyzję

        /* LOGICZNE */
        boolean zmBool = true;

        /* ZNAKOWE */
        char zmChar = 'A';

        String zmString = "Tekst";
        zmChar = zmString.charAt(0); // chcę pozyskac znak pod indeksem 0
        System.out.println(zmChar);
    }
}
