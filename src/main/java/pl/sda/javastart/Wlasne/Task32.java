package pl.sda.javastart.Wlasne;

public class Task32 {
    public static void main(String[] args) {
        //Utwórz metodę do której przekazujesz dowolną liczbę liczb:)
        // i sprawdzasz czy jakakolwiek jest mniejsza od zera. #varargs
        System.out.println(varagsMethod(10,10,10,5));
    }
    public static int varagsMethod(int arg0, int...args){
        int wynik = arg0;
        for (int i = 0; i <args.length ; i++) {
            wynik= wynik+args[i];
            if (arg0 < 0){


            }

        }
        return wynik;
    }
}
