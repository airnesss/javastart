package pl.sda.javastart.Various;

public class Prostokąt {
    //Utwórz metodę, która wyświetli prostokąt o podanych wymiarach (użytkownik podaje jego wymiary jako parametry)
    //    //XXXXXXXXXX
    //    //X        X
    //    //X        X
    //    //XXXXXXXXXX
    public static void main(String[] args) {
        Rectangle(4, 7);

    }

    public static void Rectangle(int szerokosc, int długosc) {
        for (int i = 0; i < szerokosc; i++) {                  // 1 PĘTLA
            if (i == 0 || i == szerokosc - 1) {
                for (int j = 0; j < długosc; j++) {             // 2 PĘTLA
                    System.out.print("X");
                }
                System.out.println();
            } else {
                System.out.print("X");
                for (int j = 0; j < długosc - 2; j++) {            // 3 PĘTLA
                    System.out.print(" ");
                }
                System.out.println("X");
            }


        }

    }
}
