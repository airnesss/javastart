package pl.sda.javastart.Lambda;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class FunctionalTask {
    //Napisz aplikację, w której z wykorzystaniem klasy Random i wyrażenia lambda wygenerujesz 10 losowych liczb
    // (interfejs Supplier). Wyświetl listę na ekranie również wykorzystując wyrażenia lambda (interfejs Consumer).
    //
    //Następnie napisz metodę, która usunie z listy wszystkie liczby podzielne przez 2 (użyj iteratora i własnej
    // metody wykorzystującej interfejs Predicate).
    //
    //Ponownie wyświetl wynik na ekranie.
    public static void main(String[] args) {
        Random random = new Random();
        List<Integer> randomNumbers = new ArrayList<>();
        //GENERUJEMY LICZBY
        generate(randomNumbers, 5, () -> random.nextInt(1000));
        //wypisanie
        consume(randomNumbers, x -> System.out.println(x + " "));
        //usuwamy podzielne przez 2
        filter(randomNumbers, x -> x % 2 == 0);
        //Drugie wyświetlenie
        consume(randomNumbers, x -> System.out.println(x + " "));


    }

    //Supplier<T> - posiada metodę get() - tworzy nowy obiekt typu T
    private static <T> void generate(List<T> list, int toGenerate, Supplier<T> sup) {
        for (int i = 0; i < toGenerate; i++) {
            list.add(sup.get());

        }
    }
    //Consumer<T> - posiada metodę accept(T t) - przyjmuje argument typu T, ma za zadanie wykonać pewną operację i nie zwraca wyniku
    private static <T> void consume(List<T> list, Consumer<T> consumer) {
        for (T t : list) {
            consumer.accept(t);
        }
    }
    //Predicate<T> - posiada metodę test(T t) - przyjmuje argument typu T i zwraca wartość typu boolean,
    private static <T> void filter(List<T> list, Predicate<T> predicate) {
        Iterator<T> iterator = list.iterator();
        while (iterator.hasNext()) {
            T tmp = iterator.next();
            if (predicate.test(tmp)) {
                iterator.remove();
            }
        }
    }
}
