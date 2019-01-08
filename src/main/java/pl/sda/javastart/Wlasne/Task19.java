package pl.sda.javastart.Wlasne;

import java.util.Scanner;

public class Task19 {
    // doWhileCalculator - należy napisać program przyjmujący dwie liczby (scanner) i wykonujący na nich różne działania
    // w pętli while (w zależności od wyboru - "+", "-" itd - tu można użyć if...else lub switch).
    // Program powinien zakończyć działanie po wpisaniu "koniec".
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("wybierz dwie liczby które bedą wykonywały działania");
        int firstNum = scanner.nextInt();
        int sescondNum = scanner.nextInt();
        System.out.println("wybierz + albo - albo wpisz Koniec");
        Scanner scanner1 = new Scanner(System.in);
        String obliczenie = scanner1.next();

        switch (obliczenie) {
            case "+":

                System.out.println(firstNum + sescondNum);
                break;
            case "-":
                    System.out.println(firstNum-sescondNum);
                    break;
            case "koniec":
                System.out.println("koniec");
                break;
        }
    }

}
