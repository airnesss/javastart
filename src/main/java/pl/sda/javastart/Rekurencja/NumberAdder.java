package pl.sda.javastart.Rekurencja;

public class NumberAdder {
    public static void main(String[] args) {

        //metoda sumuje liczby z przedziału od 1 do n ( w tym wypadku 3 )

        System.out.println(sum(3));

    }

    static int sum(int n) {
        int sum = 0;
        while (n > 0) {
            sum = sum + n;
            n++;
        }
        return sum;
    }


}
