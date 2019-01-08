package pl.sda.javastart.day1;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Calculator {
    public String add;
    public String divide;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Wprowadź pierwszą liczbę");
        double firstValue = scanner.nextDouble();
        System.out.println("Wprowadz drugą liczbę");
        double secondValue = scanner.nextDouble();
        System.out.println("a+b=" + (firstValue + secondValue));
        System.out.println("a-b=" + (firstValue - secondValue));
        System.out.println("a*b=" + (firstValue * secondValue));
        System.out.println("a/b=" + (firstValue / secondValue));
        System.out.println("wartosc bezwgledna z odejmowania a i b = "+ Math.abs(firstValue - secondValue));
        System.out.println("wartosc maksymalna wynosi " + Math.max(firstValue, secondValue));
        System.out.println("wartosc minimalna wynosi " + Math.min(firstValue, secondValue));
        System.out.println("a^b" + Math.pow(firstValue, secondValue));




    }


}
