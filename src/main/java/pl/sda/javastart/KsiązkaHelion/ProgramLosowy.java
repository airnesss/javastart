package pl.sda.javastart.KsiązkaHelion;

import javafx.scene.transform.Scale;

import java.util.Random;
import java.util.Scanner;

public class ProgramLosowy {
    public static void main(String[] args) {
        int zgadnijLiczbe;
        int wylosujLiczbe;
        Scanner sc = new Scanner(System.in);
        System.out.println("podaj liczbę to sprawdzenia");
        Random r = new Random();
        zgadnijLiczbe= Math.round(10*(r.nextInt()));
        wylosujLiczbe = sc.nextInt();
        if (wylosujLiczbe==zgadnijLiczbe){
            System.out.println("wygrałeś talon na kurwy i balon");
        }else{
            System.out.println("Przegrałeś");
            System.out.println("wylosowana liczba to" + zgadnijLiczbe);
        }
    }
}
