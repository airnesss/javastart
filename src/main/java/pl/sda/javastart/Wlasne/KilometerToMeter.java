package pl.sda.javastart.Wlasne;

import java.util.Scanner;

public class KilometerToMeter {
    public static void main(String[] args) {
        float speed;
        Scanner in = new Scanner(System.in);
        System.out.println("Change Kilometers To Meters");

        speed = in.nextInt();
        speed = ((speed * 1000*1));
        System.out.println("Change Kilometers To Meters " + speed);
    }
}
