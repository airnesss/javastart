package pl.sda.javastart.ListArray;

import java.util.ArrayList;

public class Lists {
    public static void main(String[] args) {

        ArrayList<Integer>ints = new ArrayList<>();

        //LinkedList<Integer>ints = new LinkedList<>();

        for (int i = 0; i <100 ; i++) {
            ints.add(i);
            
        }
       // System.out.println(ints);
        System.out.println("ints.get(50)" + ints.get(50) );
        System.out.println("ilość elementów na liscie " + ints.size());
        System.out.println("Czyszczę listę ");
        ints.clear();
        System.out.println("Ilość elementów na liscie ");
        System.out.println(ints.size());
    }
}
