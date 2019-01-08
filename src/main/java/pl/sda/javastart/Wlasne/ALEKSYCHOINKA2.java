package pl.sda.javastart.Wlasne;

public class ALEKSYCHOINKA2 {
    public static void main(String[] args) {
        aleksyT();

    }

    private static void aleksyT() {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");

            }
            System.out.println();

        }
    }
}
