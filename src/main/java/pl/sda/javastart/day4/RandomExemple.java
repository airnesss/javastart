package pl.sda.javastart.day4;

import java.util.Arrays;
import java.util.Random;

public class RandomExemple {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(prepareRaodomArray(10)));

    }
    public static int [] prepareRaodomArray (int howLong){
        int [] tabForRandNum = new int[howLong];
        Random random = new Random();
        for (int i = 0; i<howLong; i++){
            tabForRandNum [i] = random.nextInt();
        }
        return tabForRandNum;
    }

}
