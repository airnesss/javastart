package pl.sda.javastart.Wlasne;

import java.util.Scanner;

public class KalculatorWlasne {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("pierwsza cyfra");
        double pierwszaWartosc = scanner.nextDouble();
        System.out.println("druga cyfra");
        double drugaWartosc = scanner.nextDouble();
        System.out.println("a+b=" + (pierwszaWartosc + drugaWartosc));
        System.out.println("a-b" + (pierwszaWartosc - drugaWartosc));
        System.out.println("a^b=" + Math.pow(pierwszaWartosc,drugaWartosc));


    }
}
