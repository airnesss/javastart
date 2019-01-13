package pl.sda.javastart.Various;

public class Petle2 {
    //Napisz program drukujący na ekranie wieżę z literek O:
    //O
    //OO
    //OOO
    //OOOO
    //OOOOO
    public static void main(String[] args) {
        drukowanieO(5);

    }
    private static void drukowanieO(int ilosc){
        for (int i = 0; i <ilosc ; i++) {
            for (int j = 0; j <=i ; j++) {
                System.out.print("O");

            }
            System.out.println();

        }
    }
}
