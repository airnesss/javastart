package pl.sda.javastart.PROGRAMOWANIE1.day1;

import pl.sda.javastart.PROGRAMOWANIE1.day1.Stos;

import java.util.Random;

public class task2tablice {
    //zadelkaruj i zainicjalizuj tablice longów o wielkosci podanej przez uzytkowanika, wypełnij ja wartosciami ciagu
    //fibonacii
    public static void main(String[] args) {
        //  System.out.println(Arrays.toString(fibo(7)));
        //   System.out.println(Arrays.toString(randomArrays(10, 10, 20)));


        Stos stos = new Stos();
        stos.push(5);
        stos.push(8);
        stos.push(10);
        stos.peek();
        stos.pop();
        stos.peek();

    }

    private static long[] fibo(int a) {

        long[] tab = new long[a];
        for (int i = 0; i < tab.length; i++) {
            if (i < 2) {
                tab[i] = 1;
            } else {
                tab[i] = tab[i - 2] + tab[i - 1];
            }

        }
        return tab;
    }
    //zadelkaruj i zaincijalizuj tablice intów o wielkosci podanej przez uzytkownika i wypełnij ja losowymi wartosciami

    private static int[] randomArrays(int size, int min, int max) {

        int[] tab = new int[size];
        Random random = new Random();
        for (int i = 0; i < tab.length; i++) {
            tab[i] = random.nextInt(20);


        }
        return tab;

    }
    //napisz metode pobierająca dwie tablice jako argument. Jako wynik zwraca ona jedną tablice , której elementy są
    //sumą wartosci na tych samych indeksach. Tablice nie musza być równe wielkosci

    private static int[] sumTwoArrays(int[] a, int[] b) {
        int[] sum;
        boolean aGreater = a.length > b.length ? true : false;
        sum = new int[aGreater ? a.length : b.length];
        for (int i = 0; i < sum.length; i++) {
            if (aGreater) {
                if (i < b.length) {
                    sum[i] = a[i] + b[i];
                } else {
                    sum[i] = a[i];
                }
            } else {
                if (i < a.length) {
                    sum[i] = a[i] + b[i];
                } else {
                    sum[i] = b[i];
                }
            }

        }
        return sum;


    }

}



