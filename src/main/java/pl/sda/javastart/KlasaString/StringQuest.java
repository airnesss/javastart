package pl.sda.javastart.KlasaString;

import java.util.Scanner;

public class StringQuest {
    public static void main(String[] args) {
        //Pobierz od użytkownika liczbę, która określać będzie ile wyrazów użytkownik chce wprowadzić. Następnie wczytaj
        // od niego listę ciągów znaków na podstawie, których wygenerujesz wynik.
        //Wynikiem jest wyraz składający się z ostatnich liter każdego z wprowadzonych słów. Wykorzystaj klasy String
        // i StringBuilder.
        //WEJSCIE 
        // :5
        //Roman
        //kratka
        //kanar
        //robot
        //nuty
        
        //WYJSCIE:
        //Narty

        Scanner sc = new Scanner(System.in);
        System.out.println("Podaj liczbę wyrazów");
        int wordsNum = sc.nextInt();
        sc.nextLine();
        String[]words = new String[wordsNum];
        for (int i = 0; i <wordsNum ; i++) {
            System.out.println("Podaj kolejne słowo ");
            words[i]= sc.nextLine();

        }
        StringBuilder build = new StringBuilder();
        for (int i = 0; i <wordsNum ; i++) {
            System.out.println(build.append(words[i].charAt(words[i].length()-1)));
            //Długość słowa znamy dzięki metodzie length() jednak musimy ją pomniejszyć o 1, ponieważ podobnie jak w
            // przypadku tablic mamy tutaj do czynienia z indeksowaniem od 0.
            
        }
        System.out.println("Nowe słowo " + build.toString());
        //Na końcu wyświetlamy nasz gotowy wyraz wywołując metodę toString() na obiekcie builder.
        sc.close();


    }

}
