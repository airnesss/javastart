package pl.sda.javastart.Wlasne;

public class Task13 {
    public static void main(String[] args) {
        //Utwórz metodę, do której przekazujesz dwa parametry. Metoda ma wyświetlić wszystkie potęgi pierwszej liczby
        // do momentu przekroczenia drugiej liczby.
        potegiLiczby(2,5);
    }
    public static void potegiLiczby (int a , int b) {
        int potega = 0;
        for (int i = 0; ; i++) {
            if (potega >= b) {
                break;
            } else {
                potega = (int) Math.pow(a, i);
            }
            System.out.println(potega);

        }
    }
}
