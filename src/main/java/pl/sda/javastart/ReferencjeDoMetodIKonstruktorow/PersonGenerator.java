package pl.sda.javastart.ReferencjeDoMetodIKonstruktorow;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

public class PersonGenerator {
    public static void main(String[] args) {
        List<Person>pesons = generate(10,Person::new);
        pesons.forEach(System.out::println);


    }
    public static <T> List<T>generate(int num, Supplier<T>supplier){
        List<T>result = new ArrayList<T>();
        for (int i = 0; i <num ; i++) {
            result.add(supplier.get());

        }
        return result;
    }
}
