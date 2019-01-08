package pl.sda.javastart.KsiązkaHelion;

public class task3a12Various {
    public static void main(String[] args) {
        int i = 1;
        int suma = 0;

        while (i <= 10) {
            if (i % 2 != 0)
                suma = suma + i;
            i++;

        }
        System.out.println(suma);

    }
}