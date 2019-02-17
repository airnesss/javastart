package pl.sda.javastart.day5;

import org.apache.commons.lang3.StringUtils;

import java.util.Arrays;
import java.util.stream.Collectors;

public class StreamsExample {
    private static String[] animals = new String[]{"cat", "dog ", "mouse", "rat",
            "pig", "rabbit", "hamster", " ", "parrot", "cat", "",
            "dog", "cat", "  pig", "dog", null, "parrot"};                    // na null nie mozna wykonac !!

    public static void main(String[] args) {
        firstStream();
        secondStream();
        sortExample();
    }

    private static void firstStream() {
        // String[] unique;
        for (String animal : animals) {
            if (animal == null) {
                continue;
            }
            animal = animal.trim();
            if (animal.length() >= 4) {
                //todo unikalnosc
                System.out.println(animal);
            }
        }
        System.out.println("A teraz idą dane ze stream: ");
        Arrays.stream(animals)
                .filter(e -> e != null)
                .map(e -> e.trim())                                  // Zmiana na inny typ ale tu były stringi wiec sa stringi
                .filter(e -> e.length() >= 4).distinct()
                .forEach(e -> System.out.println(e));
    }

    private static void secondStream() {
        for (String animal : animals) {
            if (animal == null) {
                continue;
            }
            System.out.print(animal + ",");             // todo brak przecinka po ostatnim
        }
        System.out.println("# teraz stream :");
        String result = Arrays.stream(animals)
                .filter(a -> StringUtils.isNotBlank(a))                   //isnotblank sprawdza czy nie sa empty null i blank METODA STATYCZNA
                .map(a -> a.trim())
                .collect(Collectors.joining(","));
        System.out.println(result);                               // collect odpowiada za zwracanie STRING dlatego musimy zroic result !
    }

    private static void sortExample() {                    //to jest klasa sortExample
        String name1 = "Anna";
        String name2 = "Ola";
        System.out.println(name1.compareTo(name2));
        System.out.println("Sortowanie alfabetyczne");
        Arrays.stream(animals)
                .filter(e -> StringUtils.isNotBlank(e))
                .distinct()
                .map(e -> e.trim())
                .sorted((e, f) -> e.compareTo(f)).forEach(e -> System.out.print(e + " "));
        System.out.println("sortowanie po długosci nazwy");
        Arrays.stream(animals)
                .filter(e -> StringUtils.isNotBlank(e))
                .map(e -> e.trim())
                .distinct()
                .sorted((e,f) -> Integer.valueOf(e.length()).compareTo(Integer.valueOf(f.length())))   //zmiana na duzy INT zeby wywołac metode i porównanie długoscci
                        .forEach(e -> System.out.println(e + " "));




    }

}


