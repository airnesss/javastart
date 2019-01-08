package pl.sda.javastart.KsiązkaHelion;

public class task3a12 {
    public static void main(String[] args) {
        int i=1;
        int suma = 0;
        System.out.println("program wyswietla sume liczb całkowitych od 1 do 100 ale tylko liczby parzyste");
        while (i<100){
            if (i%2==0)
                suma = suma+i;
            i++;
        }
        System.out.println("suma liczb wynosi" + suma);
    }
}
