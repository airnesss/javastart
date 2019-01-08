package pl.sda.javastart.Wlasne;

public class Task29 {
    //Utwórz metodę, do której przekazujesz dwa parametry a ona zwróci informację
    // (wartość logiczną - `boolean`) czy **obydwie** są parzyste
    public static void main(String[] args) {
        System.out.println(czySaParzyste(2,4));
    }

    public static boolean czySaParzyste(int a, int b) {
        if (a % 2 == 0 && b % 2 == 0) {
            return true;
        }else {
            return false;
        }
    }

}

