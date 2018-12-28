package pl.sda.javastart.Wlasne;

import java.util.Scanner;

public class AleksyZadanko {
    public static void main(String[] args) {
        //System.out.println(poleKwadratu(5));
        System.out.println(pole());

    }

    public static float poleKwadratu(float a) {
        return a * a;
    }

    //metoda ma obliczac pole kwadratu albo pole trojkata w zaleznosci czy uzytkownik napisze na klawiaturze 1 albo 2
    public static float pole() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("użytkowniku jeżeli chcesz pole kwadratu nacisnij 1 a jesli trójkata to nacisnij 2");
        float wybor = scanner.nextFloat();
        if (wybor == 1) {
            System.out.println("podaj bok kwadratu");
            float a = scanner.nextFloat();
            return a*a;
        } else if (wybor == 2) {
            System.out.println("podaj podstawe i wysokość");
            float a = scanner.nextFloat();
            float h = scanner.nextFloat();
            return a*h/2;

        } else {
            return 0;
        }
    }
}
