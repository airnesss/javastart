package pl.sda.javastart.TypyGeneryczne;

public class GenericTester {
    public static void main(String[] args) {

        //definiuje kontener przechowujący liczby całkowite
        Container<Integer> integers = new Container<Integer>();

        //Przypisuję nową tablice typu INTEGER
        integers.setArray(new Integer[5]);

        //do pierwszego elementu przyposiuje wartosc 5
        integers.getArray()[0] = 5;

        //tworzymy kontener przechowuący Stringi
        Container<String>strings = new Container<String>();

        //przypisujemy tablice typu STRING
        strings.setArray(new String[10]);

        //przyposiuemy pierwszy 1 i 2 element tablicy
        strings.getArray()[0] = "Natalia";
        strings.getArray()[1] = "Marcin";




        //Odczytanie informacji bez koniecznosci rzutowania
        Integer num = integers.get(0);
        String str = strings.get(0);

        System.out.println(num);
        System.out.println(str);
    }
}
