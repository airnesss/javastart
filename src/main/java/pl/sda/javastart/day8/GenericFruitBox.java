package pl.sda.javastart.day8;

public class GenericFruitBox<T> {                  // T,E lub R opcjonalnie ale moze byc wszystko
    private T fruit;

    public GenericFruitBox(T fruit) {
        this.fruit = fruit;
    }

    public T getFruit() {
        return fruit;
    }
}
