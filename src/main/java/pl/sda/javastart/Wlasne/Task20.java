package pl.sda.javastart.Wlasne;

import java.util.Scanner;

public class Task20 {
    public static void main(String[] args) {
        //Napisz program, który po podaniu kodu języka (dostępne PL, EN, DE, FR) wyświetli odpowiedni napis powitalny
        // (przy użyciu "switch") w danym języku (dla PL – „Dzień dobry. Witam serdecznie”, dla EN – „Good morning.
        // Welcome!”, dla DE – „Guten Morgen. Herzlich Willkommen!”, dla FR – „Bonne matin. Bienvenue!”).
        // Jeżeli wprowadzony kod nie odpowiada żadnemu z powyższych program powinien o tym poinformować i przywitać się
        // w języku angielskim.
        Scanner sc = new Scanner(System.in);
        System.out.println("Jakie powitanie chcesz otrzymać");
        String powitanie = sc.nextLine();
        switch (powitanie){
            case "PL":
                System.out.println("Dzień dobry. Witam serdecznie!");
                break;
            case "EN":
                    System.out.println("Good morning. Welcome");
                    break;
            case "DE":
                System.out.println("Guten Morgen. Herzlich Willkommen!");
                break;
            case "FR":
                System.out.println("Bone matin. Benvenue!");
                default:
                    System.out.println("Nie ma takiego przywitania");
                    System.out.println("Good morning. Welcome!");

        }
        sc.close();
    }
}
