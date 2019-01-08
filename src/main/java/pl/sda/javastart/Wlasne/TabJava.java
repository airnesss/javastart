package pl.sda.javastart.Wlasne;

public class TabJava {
    public static void main(String[] args) {
        int[]tablica = new int[10];
        for (int i = 0; i < tablica.length ; i++) {
            tablica[i] = i + 1;
                                                         //program uzupelnia tab 10 elementami i nastepnie je wyswietla
        }
        for (int i = 0; i < tablica.length ; i++) {
            System.out.println("liczba" + tablica[i]);

        }

    }


}
