package pl.sda.javastart.Wlasne;

import java.util.Scanner;

public class MeterToKilometer {
    public static void main(String[] args) {
        float speed;
        Scanner in = new Scanner(System.in);
        System.out.println("Change meters to kilometers");

        speed = in.nextInt();
        speed = ((speed * 1/1000));
        System.out.println("Change meters to kilometers " + speed);


    }
}
