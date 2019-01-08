package pl.sda.javastart.KsiązkaHelion;

public class Task3a5 {
    public static void main(String[] args) {
        int i= 1;
        System.out.println("program wyswietla liczby całkowite od 1 do 20");
        do {
            if (i < 20)
                System.out.println(i + ",");
            else
                System.out.println(i + ".");
            i++;

        }
        while (i<=20);
    }
}
