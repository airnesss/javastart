package pl.sda.javastart.day4;

public class ForsExample2 {
    public static void main(String[] args) {
        printNumbersInTree(5);
    }
    public static void printNumbersInTree (int height){                          //FIXME
        for ( int i = 0; i < height; i++){                         //ilośc wierszy
            for (int j = 0; j <= i; j++){                     //ilosc kolumn
                System.out.print(i + 1 );                    //println wypisze pod soba

            }
            System.out.println();


        }
    }
}
