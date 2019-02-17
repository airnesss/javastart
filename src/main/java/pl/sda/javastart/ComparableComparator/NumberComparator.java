package pl.sda.javastart.ComparableComparator;

import java.util.Arrays;
import java.util.Comparator;

public class NumberComparator  {
    //Napisz program, w którym utworzysz tablicę 20 dowolnych liczb całkowitych, a następnie posortujesz tablicę w
    // porządku rosnącym i malejącym, za każdym razem wyświetlając wynik posortowania na ekranie. Wykorzystaj interfejs
    // Comparator i anonimowe klasy wewnętrzne
    public static void main(String[] args) {
        Integer[] numbers = {2, 5, 10, 7, 15, 39, 37, 23, 6, 78, 81, 70, 69, 17, 1, 55, 60};

        System.out.println("Nieposortowane: ");
        System.out.println(Arrays.toString(numbers));

        Arrays.sort(numbers);
        System.out.println("Posortowane rosnąco : ");
        System.out.println(Arrays.toString(numbers));

        Arrays.sort(numbers, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return -(o1.compareTo(o2));
            }
        });
        System.out.println("Posortowane malejąco : ");
        System.out.println(Arrays.toString(numbers));


    }

}

