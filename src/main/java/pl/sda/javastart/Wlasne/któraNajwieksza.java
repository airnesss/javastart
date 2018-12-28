package pl.sda.javastart.Wlasne;

public class któraNajwieksza {
    public static void main(String[] args) {
        System.out.println(najwieksza(5,10,15));

    }
    public static int najwieksza (int a, int b, int c){
        if (a > b && a > c){
            return a;
        }
        if (b > a && b > c){
            return b;
        }
        return c;
    }
}
