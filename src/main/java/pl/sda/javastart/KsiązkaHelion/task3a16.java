package pl.sda.javastart.KsiązkaHelion;

import java.util.Random;

public class task3a16 {
    public static void main(String[] args) {
        int iloscLiczb = 5, i;
        double liczba , suma = 0 , min, max;
        System.out.println("Program losuje " + iloscLiczb + " liczb całkowitych od 0 do 9 ");
        System.out.println("a następnie znajduje najmniejszą i najwiekszą ");
        System.out.println("oraz oblicza średnie ze wszystkich wylosowanych liczb");
        Random r = new Random();

        min = Math.round(5*(r.nextDouble()));
        System.out.println();
        System.out.println("wylosowano liczby : " + min + ",");
        max =min;
        suma= suma+max;
        for ( i = 1; i <=iloscLiczb-1 ; i++) {
            liczba= Math.round(10*(r.nextDouble()));
            System.out.println(liczba + ",");
            if (max<liczba) max = liczba;
            if (liczba<min) min = liczba;
            suma= suma+liczba;


        }
        System.out.println();
        System.out.println("najwieksza liczba to " + max + ",");
        System.out.println("najmniejsza liczba to" + min + ",");
        System.out.println("średnia to" + suma/iloscLiczb + ".");
    }
}
