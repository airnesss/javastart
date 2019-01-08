package pl.sda.javastart.KsiązkaHelion;

import java.util.Random;
import java.util.Scanner;

public class t2a5 {
    public static void main(String[] args) {
        double zgadnij_liczbe;
        double losuj_liczbe;
        Scanner sc = new Scanner(System.in);
        System.out.println("Podaj liczbe z przedziału 0-9");
        Random r = new Random();
        losuj_liczbe = Math.round(5 * (r.nextDouble()));
        zgadnij_liczbe = sc.nextDouble();
        if (zgadnij_liczbe == losuj_liczbe) {
            System.out.println("wygrałeś");
        } else {
            System.out.println("wylosowana liczba to :");
            System.out.println((int) losuj_liczbe);


        }
    }
}
