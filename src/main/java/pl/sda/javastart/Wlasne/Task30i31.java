package pl.sda.javastart.Wlasne;

public class Task30i31 {
    //Utwórz metodę, do której przekazujesz trzy liczby a ona zwróci informację (wartość logiczną - `boolean`)
    // czy suma pierwszych dwóch daje trzecią. *w drugiej wersji sprawdź czy jakiekolwiek dwie dają trzecią.
    public static void main(String[] args) {
       // System.out.println(threeNumbers(3,4,7));
        System.out.println(sumaWiekszaOdZera(3,-2));

    }
    public static boolean threeNumbers (int a, int b , int c){
        if (a+b==c){
            return true;
        }else {
            return false;
        }
    }
    //Utwórz metodę, do której przekazujesz dwie liczby a ona zwróci informację (wartość logiczną - `boolean`)
    // czy **chociaż jedna z nich** jest większa od zera
public static boolean sumaWiekszaOdZera (int a , int b){
        if (a > 0 || b > 0){
            return true;
        }else{
            return false;
        }
}

}

