package pl.sda.javastart.PROGRAMOWANIE1.day2;

public class Stack  {

   private double[] tab;
    int firstFree;

    public Stack(int maxSize) {
        tab = new double[maxSize];
        firstFree = 0;

    }

    //metoda zwracająca info o tym czy stos jest pusty
    public boolean isEmpty() {
        if (firstFree == 0) {
            return true;
        } else return false;
    }

    //metoda zdemująca ze stosu
    double Pop() throws IndexOutOfBoundsException {
        if (firstFree <= 0) {
            throw new IndexOutOfBoundsException("Stos jest pusty");
        }
        double temp = tab[firstFree - 1];
        firstFree--;
        return temp;
    }

    //metoda dodająca na stos
    void Push(double e) throws ArrayIndexOutOfBoundsException {
        if (firstFree < tab.length) {
            tab[firstFree] = e;
            firstFree++;
        } else {
            throw new ArrayIndexOutOfBoundsException("Przepełnianie stosu operacja nie powiodla sie");
        }
    }


}
