package pl.sda.javastart.Wlasne;

import java.util.Scanner;

public class TabliczkaMnożenia {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("podaj wysokość");
        int height = scanner.nextInt();
        System.out.println("podaj szerokość");     // FIXME
        int width = scanner.nextInt();

        //multiplicationTableFor(3,3);
        multiplicationTableWhile(4,4);

    }
    public static void multiplicationTableFor(int hight, int width){
        for (int i = 1; i <= hight; i++) {
            for (int j = 1; j <= width ; j++) {
                System.out.println((i*j)+"\t");

            }
            System.out.println();

        }
    }
    public static void multiplicationTableWhile (int height, int width ){
        int i = 1;
        while (i <= height){
            int j = 1;

            while (j <= width){
                System.out.println(i*j + "\t");
                j++;
            }
            i++;
            System.out.println();
        }
    }



}
