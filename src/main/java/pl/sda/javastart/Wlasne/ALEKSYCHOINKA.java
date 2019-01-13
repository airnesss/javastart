package pl.sda.javastart.Wlasne;

public class ALEKSYCHOINKA {
    public static void main(String[] args) {
        aleksy();


    }

    private static void aleksy() {
        for (int i = 6; i >= 1; i--) {

            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
           System.out.println();
        }
    }

}
