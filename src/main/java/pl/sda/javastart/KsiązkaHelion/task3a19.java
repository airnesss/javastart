package pl.sda.javastart.KsiązkaHelion;

public class task3a19 {
    //program wyswietlajacy tablicznke mnozenia dla liczby od 1 do 10 za pomoca for
    public static void main(String[] args) {
        int n = 10;
        int wiersze;
        int kolumny;
        for (wiersze = 1; wiersze <=n ; wiersze++) {
            for (kolumny = 1; kolumny <=n ;kolumny ++) {
                System.out.print(wiersze*kolumny + "\t");

            }
            System.out.println();
        }
    }
}

