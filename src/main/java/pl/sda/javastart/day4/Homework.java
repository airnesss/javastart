package pl.sda.javastart.day4;

import pl.sda.javastart.day3.ArraysExample;

import java.util.Arrays;
import java.util.Scanner;

public class Homework {
    public static void main(String[] args) {
        System.out.println(reversedArray(new int[]{1, 2, 4}));
        System.out.println(Arrays.toString(reversedArray(new int[]{1, 2, 3})));
        getAndPrint(4);

    }

    public static int[] reversedArray(int[] tab) {
        int length = tab.length;
        int[] tabResult = new int[length];
        for (int i = length; i > 0; i--) {
            tabResult[length - i] = tab[i - 1];
        }
        return tabResult;
    }

    public static void getAndPrint(int howMany) {
        Scanner scanner = new Scanner(System.in);
        int[] tabForNumber = new int[howMany];
        for (int i = 0; i < howMany; i++) {
            System.out.println("podaj liczbę " + i + ":");
            tabForNumber[i] = scanner.nextInt();

        }
        int sum = 0;
        double avg = 0;
        for (int i = 0; i < howMany; i++){
            sum = tabForNumber[i] + sum;

        }
        avg = sum/howMany;
        System.out.println("Twoja suma równa się: " + sum  + "\nTwoja srednia równa sie " + avg);
        int [] tabForMinMax =  ArraysExample.calculateMinMax(tabForNumber);
        System.out.println("Minimalna wartosc to: " + tabForMinMax[0] + "\nTwoja maksymalna wartosc to: " + tabForMinMax[1]);
    }
}
