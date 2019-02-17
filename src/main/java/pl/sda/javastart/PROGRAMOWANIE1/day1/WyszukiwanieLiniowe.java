package pl.sda.javastart.PROGRAMOWANIE1.day1;

import java.util.List;

public class WyszukiwanieLiniowe {
    public static void main(String[] args) {


        Integer[] tab = new Integer[]{1, 2, 3, 4, 5, 6};
        System.out.println(lineSearch(4, tab));  // na  4 indeksie mamy liczbe 3
    }

    private static int lineSearch(Object o, Object[] tab) {
        for (int i = 0; i < tab.length; i++) {
            if (o.equals(tab[i])) {
                return i;
            }
        }
        return -1;
    }

    private static int lineSearch(Object o, List<Object> list) {
        for (int i = 0; i < list.size(); i++) {
            if (o.equals(list.get(i))) {
                return i;
            }
        }
        return -1;
    }
}