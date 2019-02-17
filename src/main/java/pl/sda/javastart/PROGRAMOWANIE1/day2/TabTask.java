package pl.sda.javastart.PROGRAMOWANIE1.day2;

//zadelkaruj i zainicalizuj tablice intów o wielkosci podanej przez uzytkownika. Wypełnij ją wartościami
//losowymi. Sprawdz czy  wczytany ciag jest posortowany

import java.util.Arrays;
import java.util.Random;

public class TabTask {
    public static void main(String[] args) {
        Arrays.sort(randomtab(10));
        System.out.println(Arrays.toString(randomtab(10)));




    }

    private static int[] randomtab(int howlong) {

        int[] tab = new int[howlong];
        Random random = new Random();
        for (int i = 0; i < howlong; i++) {
            tab[i] = random.nextInt(10);

        }
        return tab;
    }


}


