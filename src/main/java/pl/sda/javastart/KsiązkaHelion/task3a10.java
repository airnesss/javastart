package pl.sda.javastart.KsiązkaHelion;

public class task3a10 {
    public static void main(String[] args) {
        //program sumuje liczby parzyste od 1 do 100
        int i;
        int suma =0;
        System.out.println("program wyswietla sume liczby od 1 do 100 ale tylko parzyste");
        for ( i = 0; i <=100 ; i++) {
            if (i%2==0)
                suma=suma+i;
            }

        System.out.println("suma liczb od 1 do 100 ale tylko liczby parzyste " + suma);
        }

    }

