package pl.sda.javastart.Wlasne;

import java.util.Scanner;

public class GuessGameWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int numer = 5;
        int userInput;
        System.out.println("zgadnij liczbe");

        while ((userInput = sc.nextInt())!=numer){             //czemu podwójny nazwias ??
            if (userInput>numer){
                System.out.println("podana liczba jest za duża , zgaduj dalej");

            }else{
                System.out.println("podana liczba jest za mała, zgaduj dalej");
            }
        }
        System.out.println("brawo zgadłaś wygrywasz SEKSIK ze swoim chłopakiem");
        sc.close();
    }
}
