package pl.sda.javastart;

import pl.sda.javastart.day4.Car;
import pl.sda.javastart.day7.ColorEnum;

import java.util.Arrays;

public class OOP4 {
    public static void main(String[] args) {
        whiteCar();
        System.out.println(Arrays.toString(ColorEnum.values()));
        ColorEnum[]colours = ColorEnum.values();
        for (ColorEnum x: colours){                         //WERSJA Z PĘTLA
            x.getPlName();
            System.out.println(x.getPlName());

        }
        System.out.println("STREAM: ");
        Arrays.stream(ColorEnum.values())                // WERSJA Z stream,strumień
                .map(e-> e.getPlName()).forEach(e-> System.out.println(e));
    }

    private static void whiteCar() {
        Car car = new Car();
        car.setColour(ColorEnum.WHITE);
        System.out.println(car.getColour().getColorNumber());
    }
}
