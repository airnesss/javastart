package pl.sda.javastart.ReferencjeDoMetodIKonstruktorow;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SimpleStringComparator {
  //  Stwórz listę 5 imion w losowej kolejności. Korzystając z metody Collections.sort() oraz referencji do metody
  //  String.compareToIgnoreCase() posortuj ją w porządku rosnącym, a następnie wyświetl wynik na ekranie.
    public static void main(String[] args) {
        List<String>name = Arrays.asList("Karol", "Wojtek", "Alicja", "Bartek", "Romek");

        Collections.sort(name,String::compareToIgnoreCase);
        name.forEach(System.out::println);

       // for (String s : name) {
         //   System.out.println(s);
            
        }

    }
//}
