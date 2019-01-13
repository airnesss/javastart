package pl.sda.javastart.Various;

import java.util.Scanner;

public class BartekStasiak {
    public static void main(String[] args) {


        Scanner in = new Scanner(System.in);


        System.out.println("Cześć, jak się czujesz?");


        String answerMood = in.nextLine();
        if (answerMood == "Dobrze") {
            System.out.println("Cieszę się, że czujesz się " + answerMood + ".");
        }else {
            System.out.println("Jest mi przykro że kiepsko sie czujesz");
        }
        System.out.println("Jak masz na imię?");

        String answerName = in.nextLine();

        System.out.println("Ile masz lat? ");

        String answerAge = in.nextLine();

        System.out.println("Hej, więc masz na imię " + answerName + ", jesteś w wieku " + answerAge + " lat, i " + answerMood + " się dziś czujesz.");

        System.out.println("Ile masz wzrostu(dokładnie!)");

        double answerWeigth = in.nextDouble();

        System.out.println("Masz na imię " + answerName + ", i masz " + answerWeigth + " cm.");

        System.out.println("A jak się teraz czujesz?");
        in.nextLine();

        String answerMoodNow = in.nextLine();

        System.out.println("Cieszę się, że czujesz się " + answerMoodNow);



    }
}
