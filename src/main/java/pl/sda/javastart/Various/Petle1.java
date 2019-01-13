package pl.sda.javastart.Various;

public class Petle1 {
    //Napisz program drukujący na ekranie 19 gwiazdek:
    //*******************
    public static void main(String[] args) {
drukowanie(19);

    }
    public static void drukowanie (int ilosc){
        for (int i = 0; i <= ilosc ; i++) {
            System.out.print("*");

        }
    }
}
