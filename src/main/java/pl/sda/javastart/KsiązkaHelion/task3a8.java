package pl.sda.javastart.KsiązkaHelion;

public class task3a8 {
    public static void main(String[] args) {
        int i = 1;
        int suma = 0;
        System.out.println("[program wyswietla sume licz całkowitych od 1 do 100");
        do {
            suma = suma+i;
            i++;
        }while (i<=100);
        System.out.println("suma liczb całkowitych od 1 do 100 wynosi " + suma);
    }
}
