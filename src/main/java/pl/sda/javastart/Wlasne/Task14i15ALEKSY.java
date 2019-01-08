package pl.sda.javastart.Wlasne;

public class Task14i15ALEKSY {
    public static void main(String[] args) {
        //14. Utwórz metodę przyjmującą parametr z liczbą wierszy i wypisującą liczby w ten sposób:
        //    1
        //  12
        //123 (
        //jedenDwaTrzy(5);
        reverseThree(5);
    } public static void jedenDwaTrzy(int height){         //FIXME
        for (int i = 1; i < height; i++) {
            for (int j = 1; j <=i ; j++) {             // int j decyduje o ilosci liczb w każdym wierszu
                System.out.print(i);
            }
            System.out.println();
        }
    }
    public static void reverseThree (int height){
        for (int i = 1; i < height;i++){
            for (int j = 1; j<height - i; j++)          //czemu tu nie ma nawiasu {FIXME
                System.out.print(" ");                // sterowanie spacjami
            for (int k = 1; k <= i ; k++)
                System.out.print(k);
                System.out.println();

            }

        }
    }

