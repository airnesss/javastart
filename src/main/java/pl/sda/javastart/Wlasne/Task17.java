package pl.sda.javastart.Wlasne;

public class Task17 {
    public static void main(String[] args) {
        // Wykorzystując pętlę while, napisz program, który wyświetli liczby całkowite od 1 do 20 niepodzielne przez 3.

        liczby1do20niepodzielnePrzez3(20,3);
    }

    public static void liczby1do20niepodzielnePrzez3(int lastNumber, int divider) {
        int i = 1;

        while (i <= lastNumber){

            if (i % divider != 0){
                System.out.print(i + "\t");
            }
            i++;
        }

    }
}
