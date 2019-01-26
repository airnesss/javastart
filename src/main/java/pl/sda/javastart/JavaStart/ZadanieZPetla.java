package pl.sda.javastart.JavaStart;

import java.util.Scanner;

public class ZadanieZPetla {
    //Napisz program, który najpierw pobiera od użytkownika liczbę mówiącą o tym ile liczb użytkownik chce wprowadzić.
    // Następnie pobierz od niego tyle liczb ile zadeklarował, zsumuj je i wyświetl na ekranie. W programie wykorzystaj
    // co najwyżej dwie zmienne liczbowe (wliczając w to również potencjalne zmienne liczników pętli) i nie używaj tablic.
    // Wykorzystaj dowolny typ liczbowy.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Użytkowniku ile liczb chcesz zsumować ? ");

        int numbers = sc.nextInt();
        int sum = 0;

        while (numbers -- > 0){
            System.out.println("Podaj kolejną liczbę ");
            sum = sum + sc.nextInt();
        }
        System.out.println("Suma wszystkich podanych liczb to " + sum);
        sc.close();

    }
}
