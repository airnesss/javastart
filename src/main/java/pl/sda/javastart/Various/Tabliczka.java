package pl.sda.javastart.Various;

public class Tabliczka {
    public static void main(String[] args) {
        System.out.println("program wyswietla tabliczke mnozenia ");
        int n = 5;
        for (int i = 1; i <=n ; i++) {
            for (int j = 1; j <=n ; j++) {
                System.out.print(i*j + "\t");



            }
            System.out.println();



        }

    }

}
