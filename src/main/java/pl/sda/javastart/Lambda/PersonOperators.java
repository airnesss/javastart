package pl.sda.javastart.Lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class PersonOperators {
    public static void main(String[] args) {
        List<Person>persons = new ArrayList<>();
        persons.add(new Person("Marcin", "Kierzkowski",29));
        persons.add(new Person("Natalia", "Siwiec",25));
        persons.add(new Person("Justyna", "Rudnicka", 29));
        persons.add(new Person("Adam", "Rudnicki", 29));
        persons.add(new Person("Danuta","Nowak", 50));
        persons.add(new Person("Marek", "Szymczak", 70));

        consumeList(persons,person -> System.out.println(person));
        System.out.println(">>>");
        applyToList(persons,person -> {person.setAge(person.getAge()+1);return person;});
        System.out.println(persons);
        System.out.println(">>>");
        filterByPredicate(persons,person -> person.getAge()<50);


    }
    private static <T> void consumeList(List<T>list, Consumer<T>consumer){
        for (T t : list) {
            consumer.accept(t);

        }

    }
    private static <T> void applyToList(List<T>list, Function<T,T>pre){
        for (int i = 0; i <list.size() ; i++) {
            list.set(i,pre.apply(list.get(i)));
            
        }

    }
    private static <T> void filterByPredicate(List<T>list, Predicate<T>predicate){
        for (T t : list) {
            if (predicate.test(t)){
                System.out.println(t);
            }

        }
    }
}
