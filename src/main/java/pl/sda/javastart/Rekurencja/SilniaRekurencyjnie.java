package pl.sda.javastart.Rekurencja;

public class SilniaRekurencyjnie {
    public static void main(String[] args) {
        //  Napisz program, który obliczy silnię liczby podanej jako argument wykorzystując wywołania rekurencyjne.
        int factArg = 5;
        int result = factorial(factArg);
        System.out.println("Silnia dla " + factArg + " wynosi: " + result);
    }

    static int factorial(int n) {

        //OPERATOR TRÓJARGUMENTOWY:
        return n > 1 ? n * factorial(n - 1) : 1;
    }

}
