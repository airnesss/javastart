package pl.sda.javastart.Wlasne;

import java.util.Arrays;

public class TablicaCwiczenie {                        //wypelnij tablice elementami przu uzyciu petli
    public static void main(String[] args) {

        int[]table = new int[6];
        for(int i = 0; i<6; i++){
            table [i] = i+1;
        }
        System.out.println(Arrays.toString(table));


    }
}
