package pl.sda.javastart.Wlasne;

public class Task7 {
    public static void main(String[] args) {
        //printCubesOfNumbers(2,7);
        //countDown(5);
        printMultiplications(2);

    }
// wyswietlanie kolejnych liczb z wybranego zakresu i ich szczescianów
    public static void printCubesOfNumbers(int a, int b) {
        for (int i = a; i < b; i++) {
            System.out.println("liczba i wynosi " + i + " sześcian liczby i to " + i*i*i);
        }
    }
    //countdown - odliczanie w dół po podaniu liczby startowej
    public static void countDown (int a ) {
        for (int i = a; i >=0 ; i--) {
            System.out.println(i);
            

        }
        
    }
// printMultiplications - wypisanie wyników mnożenia podanej liczby przez kolejne liczby całkowite do tej liczby włącznie
    public static void printMultiplications(int a){
        for (int i = 0; i <= a; i++) {
            System.out.println(i*a);

        }
    }
}
