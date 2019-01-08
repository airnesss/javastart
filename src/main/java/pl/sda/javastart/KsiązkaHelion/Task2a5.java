package pl.sda.javastart.KsiązkaHelion;

import org.omg.Messaging.SYNC_WITH_TRANSPORT;

import java.util.Random;
import java.util.Scanner;

public class Task2a5 {
    public static void main(String[] args) {
        //program w którym uzytkownik zgaduje liczbe z przedziału od 0 do 9 generowaną przez komputer
        double zgadnij_liczbę;
        double losuj_liczbe;
        Scanner sc = new Scanner(System.in);
        System.out.println("podaj liczbę z przedziału od 0 do 9");
        Random r = new Random();
        losuj_liczbe = Math.round(10*(r.nextDouble()));    // funkcja umożliwia zaokrąglenie liczby zmiennoprzecinkowej do całkowite
        zgadnij_liczbę = sc.nextDouble();
        if (zgadnij_liczbę == losuj_liczbe){
            System.out.println("gratulacje wygrałeś");
        }else {
            System.out.println("przegrałeś bo wylosowana liczba to");
            System.out.println((int) losuj_liczbe + ".");
        }



    }
}
