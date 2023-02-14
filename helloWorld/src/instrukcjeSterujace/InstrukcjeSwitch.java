package instrukcjeSterujace;

public class InstrukcjeSwitch {
    public static void main(String[] args) {
        int day = 0;

        switch (day) {
            case 1:
                System.out.println("Poniedziałek");
                break;
            case 2:
                System.out.println("Wtorek");
                break;
            case 3:
                System.out.println("Sroda");
                break;
            case 6:
            case 7:
                System.out.println("Weekend");
                break;
            default:
                System.out.println("Inny dzień");
                break;
        }
    }
}
