package pl.sda.javastart.Rekurencja;

public class NumberAdderRekurency {
    public static void main(String[] args) {


        System.out.println(sum(4));

    }

    static int sum(int n) {
        if (n > 1) {
            System.out.println(n + "+ " + "sum (" + (n - 1) + ")");
            return n + sum(n - 1);
        } else {
            return n;
        }

    }

}
