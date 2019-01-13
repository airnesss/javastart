package pl.sda.javastart.Various;

public class AleksyPetla {
    public static void main(String[] args) {
        XYpoKolei(5);
    }

    public static void XYpoKolei(int wartosc) {
        for (int i = 0; i < wartosc; i++) {
            if (i % 2 == 0) {
                System.out.println("X");
            }else {
                System.out.println("Y");
            }

        }
    }
}
