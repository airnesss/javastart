package pl.sda.javastart.Wlasne;

import java.util.Scanner;

public class ProgramJavaStart {
    //program, który pozwoli wczytać 3 liczby całkowite od użytkownika i za każdym razem rozpozna,
    // czy liczba ta jest parzysta (podzielna przez 2), czy też nieparzysta
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int temp;
        for (int i = 0; i <3 ; i++) {
            System.out.println("podaj liczbę do sprawdzenia");
            temp = sc.nextInt();

            if (temp%2==0){
                System.out.println("licczba" + temp + "jest parzysta");

            }else{
                System.out.println("liczba " + temp + "jest nieparzysta");
            }

        }
        sc.close();



    }

}
