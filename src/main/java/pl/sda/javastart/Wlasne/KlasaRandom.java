package pl.sda.javastart.Wlasne;

import java.util.Random;

public class KlasaRandom {
    public static void main(String[] args) {
        Random rand = new Random();
        int number = rand.nextInt(3);
        System.out.println(number);

    }
}
