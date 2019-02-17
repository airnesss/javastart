package pl.sda.javastart.PROGRAMOWANIE1.day4;

public class Calc {
    public static void main(String[] args) {
        System.out.println(adition(3,5));
        System.out.println(substraction(5,6));
        System.out.println(multiply(5,6));
        System.out.println(divide(10,2));

    }
    public static int adition (int a, int b){
        return a + b;
    }
    public static int substraction (int a, int b){
        return a-b;
    }
    public static int multiply (int a , int b){
        return a*b;
    }
    public static int divide(int a, int b){
        return a/b;
    }

    }

