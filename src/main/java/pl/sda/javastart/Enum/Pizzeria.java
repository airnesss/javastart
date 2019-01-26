package pl.sda.javastart.Enum;

import java.util.Scanner;

public class Pizzeria {
    public static void main(String[] args) {

        System.out.println("Dostępne pizze :");
        for (Pizza p : Pizza.values()) {
            System.out.println(p);
        }
        Scanner sc = new Scanner(System.in);
        System.out.println("Jaka pizze wybierasz ?");
        Pizza pizza = Pizza.valueOf(sc.nextLine());

        System.out.println("dziękujemy za zamówienie pizzy " + pizza.name());
    }
}
