package pl.sda.javastart.Wlasne;

import java.util.Scanner;

public class FarenhiteToCelcius {
    public static void main(String[] args) {
        float temperature;
        Scanner in = new Scanner(System.in);

        System.out.println("Enter Temperature to Farenheit");
        temperature = in.nextInt();
        temperature = ((temperature - 32)*5)/9;
        System.out.println("temperature in celsius " + temperature);
    }
}
