package pl.sda.javastart.KsiązkaHelion;

public class task3a11Various {
    public static void main(String[] args) {
        int i = 1;
        int suma = 0;
        do {
            if (i%2!=0)
                suma=suma+i;
            i++;
        }while (i<=10);
        System.out.println("suma liczb od 1 do 10 ale tylko nieparzyste " + suma);
    }
}
