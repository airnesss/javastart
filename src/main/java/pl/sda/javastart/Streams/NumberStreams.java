package pl.sda.javastart.Streams;

import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class NumberStreams {
    public static void main(String[] args) {
        Stream<Integer> numStream = Stream.iterate(0, x -> x + 1);

        // lista kwadratów kolejnych 100 liczb całkowitych
        List<Integer> squareNumebers = numStream.map(x -> x * x)
                .limit(100).collect(Collectors.toList());

        //zbiór kwadratów liczby
        Set<Integer> biggerThan5 = squareNumebers.stream()
                .filter(x -> x % 10 == 0)
                .map(x -> x / 10)
                .collect(Collectors.toCollection(TreeSet::new));

        System.out.println("List");
        squareNumebers.forEach(x -> System.out.println(x + ";"));
        System.out.println("\nSet");
        biggerThan5.forEach(x -> System.out.println(x + " ;"));


    }

}

