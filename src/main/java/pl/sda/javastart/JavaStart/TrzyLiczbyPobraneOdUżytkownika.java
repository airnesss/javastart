package pl.sda.javastart.JavaStart;

import java.util.Scanner;

public class TrzyLiczbyPobraneOdUżytkownika {
    public static void main(String[] args) {
        int[] numbers = new int[3];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("użytkowniku podaj liczbę");
            numbers[i] = sc.nextInt();

        }
        for (int temp : numbers) {
            System.out.println(temp);


        }
        sc.close();
    }
}
