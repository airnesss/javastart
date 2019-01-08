package pl.sda.javastart.Wlasne;

public class TestResult {
    public static void main(String[] args) {
        System.out.println(testResult(80));
    }

    public static int testResult(int wynik) {
        int ocena = 0;
        if (wynik < 50) {
            ocena = 2;
        } else if (wynik >= 50 && wynik <= 60) {
            ocena = 3;
        } else if (wynik >= 61 && wynik <= 70) {
            ocena = 4;
        } else if (wynik >= 71 && wynik <= 80) {
            ocena = 5;
        } else if (wynik >= 81 && wynik <= 100) {
            ocena = 6;
        } else {
            System.out.println("Wynik , który wpisales jest niepoprawny. Wpisz wynik od 0-100");
        }
        return ocena;
    }
}
