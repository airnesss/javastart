package pl.sda.javastart.Wlasne;

import java.time.LocalDateTime;
import java.util.Scanner;

public class Cwiczenia {
    public static void main(String[] args) {

        double temperatura;
        Scanner wojtek = new Scanner(System.in);
        System.out.println("podaj temperature w Farenheit");
        temperatura = wojtek.nextInt ();
        temperatura = ((temperatura -32)*5/9);
        System.out.println("temperatura w celciuszach" + temperatura);





    }


    }




