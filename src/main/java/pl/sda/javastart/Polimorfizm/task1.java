package pl.sda.javastart.Polimorfizm;

public class task1 {
    public static void main(String[] args) {
        //program sorawdza czy podana liczba jest pierwsza
        System.out.println(czyPodanaLiczba(4));
        System.out.println(czyPodanaLiczba(6));
        System.out.println(czyPodanaLiczba(7));

    }

    private static boolean czyPodanaLiczba(int a) {
        if (a < 2) {
            return false;
        } else {

            for (int i = 2; i < a / 2; i++) {
                if (a % i == 0) {
                    return false;

                } else continue;

            }
        }
        return true;
    }
}