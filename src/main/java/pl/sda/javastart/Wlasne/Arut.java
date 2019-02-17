package pl.sda.javastart.Wlasne;

import java.util.Arrays;

public class Arut {
    public static void main(String[] args) {
        int[]tab1= {2,3,4,5};

        tab1= Arrays.copyOf(tab1,tab1.length +1);

            System.out.println(Arrays.toString(tab1));

        }
    }

