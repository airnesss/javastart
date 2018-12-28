package pl.sda.javastart.Wlasne;

import java.util.Scanner;

public class WczytywanieLiczbOdUzytkownika {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int liczba;
        for (int i = 0; i < 2; i++) {
            System.out.println("Podaj liczbę do sprawdzenia: ");
            liczba = sc.nextInt();    // co oznacza ta klasa ?? FIXME

            if (liczba % 2 == 0) {
                System.out.println("Liczba " + liczba + " jest parzysta!");
            } else {
                System.out.println("Liczba " + liczba + " jest nieparzysta!");
            }

        }

        sc.close();
    }


    }





