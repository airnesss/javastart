package pl.sda.javastart.PROGRAMOWANIE1.day4;

import java.util.Scanner;

public class CalcWithScaner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Wprowadz pierwszą liczb5ę: ");
        double firstValue = sc.nextDouble();
        System.out.println("Wprowadź drugą liczbę: ");
        double secondValue = sc.nextDouble();
        System.out.println("ADDITION: " + (firstValue + secondValue));
        System.out.println("SUBSTRACTION :" + (firstValue-secondValue));
        System.out.println("MULTIPLY :" + (firstValue*secondValue));
        System.out.println("DIVIDE: " + (firstValue/secondValue));
        System.out.println("POW :" + Math.pow(firstValue,secondValue));
    }
}
