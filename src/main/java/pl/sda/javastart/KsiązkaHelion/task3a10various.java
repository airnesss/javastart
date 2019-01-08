package pl.sda.javastart.KsiązkaHelion;

public class task3a10various {
    public static void main(String[] args) {
        int i = 1;
        int suma = 0;
        for ( i = 0; i <=100 ; i++) {
            if (i%2!=0)
                suma = suma+i;


        }
        System.out.println("suma liczb od 1 do 10 ale nieparzystych to " + suma);
    }

}
