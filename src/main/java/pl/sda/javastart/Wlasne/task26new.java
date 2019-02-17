package pl.sda.javastart.Wlasne;

import java.util.Arrays;

public class task26new {
    public static void main(String[] args) {
        int[]a={6,1,7};
        int[]b={5,3,8};
        int[]c= new int[b.length];
        for (int i = 0; i <c.length ; i++) {

           c[i]= a[i]+b[i];
        }
        System.out.println(Arrays.toString(c));

    }
}
