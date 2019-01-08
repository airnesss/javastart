package pl.sda.javastart.Wlasne;

public class Task16FibonacciPopraw {
    public static void main(String[] args) {
        fibonaczi(7);

    }
    public static void fibonaczi (int param){
        int temp = 0;
        int temp1 = 0;
        for (int i = 0; i <= 7 ; i++) {
            temp = (temp + 1) + i;
            System.out.println(temp);

        }
    }
}
