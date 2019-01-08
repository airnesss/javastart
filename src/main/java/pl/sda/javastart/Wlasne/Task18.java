package pl.sda.javastart.Wlasne;

public class Task18 {
    // Napisz program, który oblicza silnię dla zadanej liczby przez użytkownika (do n=12) przy użyciu while
    public static void main(String[] args) {
        silnia(12);

    }
    public static void silnia (int param){
        int temp = 1;                //silnia zaczyna sie od 1
        for (int i = 1; i <=param ; i++) {
            temp = temp*i;
            System.out.println(temp);

        }
    }

}
