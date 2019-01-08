package pl.sda.javastart.KsiązkaHelion;

public class task3a6 {
    public static void main(String[] args) {
        int i = 1;
        System.out.println("program wyswietlajacy liczby całkowite od 1 do 20");
        while (i<=20){
            if (i<20)
                System.out.println(i + ",");
            else
                System.out.println(i + ".");
            i++;
        }
    }
}
