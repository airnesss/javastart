package pl.sda.javastart.ColletionsMethods;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class CollectionOperations {
    public static void main(String[] args) {
        String sentence = "Strona testowa służy dwóm celom: stanowi wizualne potwierdzenie "
                + "działania drukarki i może również zawierać informacje pomocne podczas "
                + "rozwiązywania problemów, takie jak szczegóły dotyczące sterownika drukarki.";
        List<String> words = Arrays.asList(sentence.split(" "));
        System.out.println("Lista oryginalna  :");
        printColetions(words);
//WYMIESZANIE SŁÓW
        Collections.shuffle(words);
        System.out.println("Lista SHUFFLE : ");
        printColetions(words);

        //SORTOWANIE
        Collections.sort(words, String.CASE_INSENSITIVE_ORDER); // dzięki temu porównuje po kolejnosci znaków. ignoruje wielkie litery
        System.out.println("Lista sort :");
        printColetions(words);

        //Wyszukiwanie binarne
        int position = Collections.binarySearch(words,"drukarki");
        System.out.println("Słowo /drukarki/ jest w liscie na " + position + " miejscu " );

        //Ilość wystąpień
        int freq = Collections.frequency(words, "Strona");
        System.out.println("Słowo /strona/ występuje na liście " + freq + " razy ");
//Najmniejszy element na liscie
        System.out.println("Najmniejszy element na liście to " + Collections.min(words));


    }

    public static void printColetions(Collection<String> collections) {
        for (String collection : collections) {
            System.out.println(collection + "; ");

        }
        System.out.println();
    }
}
