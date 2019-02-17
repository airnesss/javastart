package pl.sda.javastart.Streams;

import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class NumerStreamMethod {
    public static final int DIVIDER = 10;

    public static void main(String[] args) {
        Stream<Integer> numStrem = Stream.iterate(0, x -> x + 1);
        //Lista kolenych kwadratów liczb
        List<Integer> squereNum = numStrem.map(NumerStreamMethod::squere)
                .limit(10).collect(Collectors.toList());

        //Zbiór kwadratów liczb
        Set<Integer> biggerThan5 = squereNum.stream()
                .filter(NumerStreamMethod::isDivide)
                .map(NumerStreamMethod::divie)
                .collect(Collectors.toCollection(TreeSet::new));

        squereNum.forEach(x -> System.out.println(x + ";"));
        biggerThan5.forEach(x -> System.out.println(x + ";"));

    }

    public static int squere(int x) {
        return x * x;
    }

    private static boolean isDivide(int x) {
        return x % DIVIDER == 0;
    }

    private static int divie(int x) {
        return x / DIVIDER;
    }
}
