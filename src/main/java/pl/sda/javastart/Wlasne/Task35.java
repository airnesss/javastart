package pl.sda.javastart.Wlasne;

public class Task35 {
    public static void main(String[] args) {
        System.out.println("program wyswietlajacy tabliczke mnozenia do 100");
        int n = 10;
        for (int wiersze = 1; wiersze <=n ; wiersze++) {
            for (int kolumny = 1; kolumny <=n ; kolumny++) {
                System.out.print(wiersze*kolumny + "\t");
            }
            System.out.println();
        }
    }


}

