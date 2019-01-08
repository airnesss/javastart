package pl.sda.javastart.KsiązkaHelion;

public class task3a20 {
    //tabliczka mnozenia od 1 do 10 dla do while
    public static void main(String[] args) {
        int n = 10;
        int wiersze;
        int kolumny;

        wiersze = 1;
        do {
            kolumny = 1;
            do {
                System.out.print(wiersze * kolumny + "\t");
                kolumny++;
            }
            while (kolumny <= n);
            wiersze++;
            System.out.println();

        }
        while (wiersze <= n);
    }
}
