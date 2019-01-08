package pl.sda.javastart.Wlasne;

import java.util.Scanner;

public class PetlaLiczacaKwadratyIszesciany {
    public static void main(String[] args) {

printSomeNumbers(5);
    }

    public static void printSomeNumbers(int endNumber) {
        for (int i = 0; i < endNumber; i++) {
            System.out.println(i);
        }
        int number;
        int square;
        int cube;
        for (number = 1; number < 11; number++) {
            square = number * number;
            cube = number * square;
            System.out.println(number + "\t" + square + "\t" + cube);
        }

    }


}
