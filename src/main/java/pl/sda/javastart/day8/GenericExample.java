package pl.sda.javastart.day8;

import java.util.Arrays;
import java.util.List;

public class GenericExample {
    public static void main(String[] args) {

        notGeneric();

        genericExample();

        List<Number> numbers = Arrays.asList(4, 8, 9, 10);
        System.out.println(sumAnyNumber(numbers));
        List<Long> longs = Arrays.asList(123L,23L);
        System.out.println(sumAnySpecifiedNumbers(longs));


    }
//  CASTOWANIE metoda gdzie przekazujemy konkretny typ czli long i chcemy uzyskac wynik jako LONG ale coś nie działa bo daje w dobule
    private static <T extends Number> T sumAnySpecifiedNumbers(List<T> numbers) {
        Double sum = 0d;
        for (T number : numbers) {
            sum = sum + number.doubleValue();

        }
        return (T) sum;
    }

    //metoda sumujaca liczby które sa na dany moment są dublami
    private static Double sumAnyNumber(List<Number> numbers) {
        double sum = 0d;
        for (Number number : numbers) {
            sum = sum + number.doubleValue();                   //value - przekonwertowane do double
        }
        return sum;
    }

    //nie musimy castowac
    private static void genericExample() {
        Apple apple = new Apple();
        GenericFruitBox<Apple> genericFruitBox = new GenericFruitBox<>(apple);
        Apple appleFromBox = genericFruitBox.getFruit();
        appleFromBox.introduceAplle();
    }

    //frutibox który nie jest generyczny
    private static void notGeneric() {
        Apple apple = new Apple();
        FruitBox fruitBox = new FruitBox(apple);
        Apple appleFromBox = (Apple) fruitBox.getFruit();
        appleFromBox.introduceAplle();
    }
}
