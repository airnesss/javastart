package pl.sda.javastart.Various;

public class Petla3 {
    //Napisz program drukujący na ekranie prostokąt z literek X. Wysokość i szerokość prostokąta wczytujemy z
    //klawiatury:
    //XXXXXXXXXX
    //X        X
    //X        X
    //XXXXXXXXXX
    public static void main(String[] args) {
        petla3(4,10);


    }

    private static void petla3(int dlugosc, int szerokosc) {
        for (int i = 0; i < dlugosc; i++) {
            if (i == 0 || i == dlugosc - 1) {
                for (int j = 1; j < szerokosc-2; j++) {
                    System.out.print("X");
                }
                System.out.println();

            }else
                System.out.println("X");
            for (int j = 1; j <szerokosc-2 ; j++) {
                System.out.print(" ");

            }
            System.out.println("X");

        }

    }

}
