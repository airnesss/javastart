package pl.sda.javastart.Wlasne;

import java.util.Arrays;
import java.util.Scanner;

public class ZadaniaZMateuszemNext {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(reverseArray(new int[]{1,2,3})));   //Arrays.toString - drukowanie tablicy jako String
        getFiveNumbers(5);
    }

    //Utwórz metode która jako parametr przyjmuje tablice i zwraca nowa tablice w odwrotnej kolejnosci
    private static int[] reverseArray(int[] firstArray){
        int[]result = new int [firstArray.length];
        for (int i= firstArray.length; i > 0; i--){       // i = 3 , w nastepne kolejce i = 2, nastepnie i = 1
            result[firstArray.length-i]=firstArray[i-1]; // dł tablicy jest niezmieniona

        }
        return result;
    }
    //napisz metode która pobiera od uzytkowników 5 różnych liczb całkowitych
    // za pomoca pętli FOR. Po zakonczeniu pobierania wypisz sume oraz srednia
    private static int getFiveNumbers (int param){
        int[]arrayForParam = new int[param];
        for (int i = 0; i < param; i++) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Podaj liczbe");
            arrayForParam[i] = scanner.nextInt();
        }
        int sum = 0;     // zawsze warto podać wartosc jako zero
        for (int i = 0; i < param; i++) {
            sum = arrayForParam[i] + sum;


        }
        return sum;
    }
}


