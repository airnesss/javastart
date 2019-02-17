package pl.sda.javastart.Exceptions;

import java.util.Scanner;

public class InputMismatchException {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Podaj liczbę: ");

        int number = 0;

        //booleen - flaga okresla czy podana już prawidłowa liczbe

        boolean error = true;
        do {
            try {
                number = sc.nextInt();
                error = false;
                System.out.println("Wczytano poprawną liczbę ");

            } catch (java.util.InputMismatchException ex) {
                System.err.println("Podana wartośc nie jest liczbą całkowita ");
                sc.nextLine();
            }
        } while (error);
        System.out.println("podałeś " + number);
        sc.close();


    }
}
