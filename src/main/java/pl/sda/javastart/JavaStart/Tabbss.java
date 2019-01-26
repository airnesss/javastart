package pl.sda.javastart.JavaStart;

public class Tabbss {
    public static void main(String[] args) {
        int[] numbers = new int[10];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i + 1;

        }
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Liczba :" + numbers[i]);

        }
        System.out.println("a teraz for each");
        int[] numbers2 = {1, 2, 3, 4, 5, };
        for (int tmp : numbers){
            System.out.println(tmp);

        }
    }
}

