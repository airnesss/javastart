package pl.sda.javastart.KsiązkaHelion;

public class task3a11 {
    public static void main(String[] args) {
        int i=1;
        int suma = 0;
        System.out.println("program wyswietla sume liczb całkowitych od 1 do 100 ale tylko liczby parzyste");
     do {
         if (i%2==0)
             suma = suma+i;
             i++;
     }while (i<=100);
        System.out.println("suma liczb wynosi" + suma);
    }
}
