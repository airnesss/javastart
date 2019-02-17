package pl.sda.javastart.ListArray;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class PolimorficList {
    public static void main(String[] args) {
        //  LinkedList<Integer> ints1 = new LinkedList<>();
        // ArrayList<Integer> ints2 = new ArrayList<>();

//Referenjce ogolniejszego typu bo dzięki temu mozemy przekazac dwa typy:
        List<Integer> ints1 = new LinkedList<>();
        List<Integer> ints2 = new ArrayList<>();

        for (int i = 0; i < 100; i++) {
            ints1.add(i);
            ints2.add(i);


        }
        printList(ints1);
        printList(ints2);
    }

    static void printList(List<Integer> list) {
        for (Integer integer : list) {
            System.out.println(integer);

        }
    }
}
