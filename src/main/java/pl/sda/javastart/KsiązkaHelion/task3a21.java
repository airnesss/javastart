package pl.sda.javastart.KsiązkaHelion;

public class task3a21 {
    //tabliczka mnozenia od 1 do 10 z WHILE
    public static void main(String[] args) {
        int n =10;
        int kolumny;
        int wiersze;

        wiersze = 1;
        while (wiersze<=n){
            kolumny =1;
            while (kolumny<=n){
                System.out.print(wiersze*kolumny + "\t");
                kolumny++;
            }
            wiersze++;
            System.out.println();
        }

    }
}
