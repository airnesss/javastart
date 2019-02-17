package pl.sda.javastart.PROGRAMOWANIE1.day1;

import java.util.Arrays;

public class task1 {
    //wygwziadkuj linie o długosci zadanej przez uzytkowniak
    public static void main(String[] args) {
    //    gwiazdki(20);
      //  rectangle(4, 6);
       triangle(4);
       // trianglenew(6);


    }

    private static void gwiazdki(int a) {
        for (int i = 0; i < a; i++) {
            System.out.print("*");

        }
        System.out.println();
    }

    //wygwiazdkuj prostoka o dł boków
    private static void rectangle(int dlugosc, int szerokosc) {
        for (int i = 0; i < dlugosc; i++){
            for (int j = 0; j <szerokosc ; j++) {
                System.out.print("*");

            }
            System.out.println();
        }
    }
    private static void triangle(int height ){
        for (int i = 1; i <= height ; ++i) {
            for (int j = 1; j <=i ; j++) {
                System.out.print("*");

            }
            System.out.println();

        }

    }
    private static void trianglenew (int height){
        for (int i = 0; i < height; i++) {
            for (int j = 0; j <height - i ; j++)
                System.out.print(" ");
                for (int k = 0; k < 2 * i + 1; k++)
                    System.out.print("*");
                    System.out.println();

                }

            }


    }




