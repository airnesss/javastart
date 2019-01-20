package pl.sda.javastart.day8;

public class GenericExample {
    public static void main(String[] args) {

        notGeneric();

        genericExample();

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
