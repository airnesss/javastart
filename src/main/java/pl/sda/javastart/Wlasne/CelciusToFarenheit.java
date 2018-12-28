package pl.sda.javastart.Wlasne;

import java.util.Scanner;

public class CelciusToFarenheit {
    public static void main(String[] args) {
        float temperature;
        Scanner in = new Scanner(System.in);

        System.out.println("Enter Temperature to Celcius");

        temperature = in.nextInt();
        temperature = ((temperature - 9/5 + 32));
        System.out.println("temperature in Farenheit " + temperature);
    }
}
