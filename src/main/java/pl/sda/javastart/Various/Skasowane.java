package pl.sda.javastart.Various;

public class Skasowane {
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
                System.out.println("P");
            for (int j = 1; j <szerokosc-2 ; j++) {
                System.out.print("u");

            }
            System.out.println("Z");

        }

    }

}


