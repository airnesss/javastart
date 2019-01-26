package pl.sda.javastart.JavaStart;

public class TestZTablic {
    // Napisz program składający się z jednej klasy o dowolnej nazwie. W metodzie main zadeklaruj tablicę dwuwymiarową liczb
    //typu double. Wypełnij ją liczbami zgodnie z poniższym rysunkiem
    //Wylicz i wyświetl na ekranie wyniki poniżej opisanych działań
    //Sumę iloczynów przekątnych tablicy,
    //iloczyn sum środkowego wiersza i środkowej kolumny tablicy,
    //sumę wszystkich elementów znajdujących się przy krawędzi tablicy.
    public static void main(String[] args) {
        double[][] tab = new double[3][];
        double[] line0 = {1.0, 1.5, 2.0};
        double[] line1 = {1.5, 2.0, 2, 5};
        double[] line2 = {2.0, 2.5, 3.0};

        tab[0] = line0;
        tab[1] = line1;
        tab[2] = line2;

        double result = (tab[0][0] * tab[1][1] * tab[2][2] + tab[0][2] * tab[1][1] * tab[2][0]);
        System.out.println("suma iloczynów przekątnych tablicy wynosi: " + result);

        double result2 = (tab[0][1] * tab[1][1] * tab[2][1] + tab[1][0] * tab[1][1] * tab[1][2]);
        System.out.println("suma iloczynu środkowego wiersza i środkowej kolumny wynosi: ");
        System.out.println(result2);

    }
}
