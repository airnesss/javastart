package pl.sda.javastart.Exceptions;


import java.util.InputMismatchException;
import java.util.Scanner;

public class CalcApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = 0;
        double b = 0;
        String operator = null;
        boolean readComplete = false;     //Zmienna pozwala sprawdzić czy wynik udało sie obliczyć czy też dane były niepoprawne
        while (!readComplete) {
            try {
                System.out.println("Podaj pierwszą liczbę");
                a = sc.nextDouble();
                sc.nextLine();
                System.out.println("Podaj operator arytmetyczny (+,-,* lub /);");
                operator = sc.nextLine();
                System.out.println("Podaj drugą liczbę");
                b = sc.nextDouble();
                readComplete = true;
            } catch (InputMismatchException e) {
                System.out.println("Wprowadzono nieporpawne dane, spróbuj jeszcze raz");
                sc.nextLine();
            }
        }

        Calculator calc = new Calculator();
        double result = 0;
        boolean calculationComplete = false;
        try {
            result = calc.Calculator(a, b, "=");
            calculationComplete = true;

        } catch (ArithmeticException | UnknownOperatorException e) {
            System.err.println(e.getMessage());
        }
        if (calculationComplete) {
            System.out.println(a + operator + b + "=" + result);
        } else {
            System.out.println("Nie można obliczyć wyniku wyrażenia " + a + operator + b);
        }
        sc.close();
    }
}
