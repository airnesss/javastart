package pl.sda.javastart.ComputerShopEqualsToString;

public class DataStore {
    //DataStore - klasa przechowuje informacje o notebookach w tablicy. Pozwala na dodanie kolejnego komputera do bazy
    // poprzez metodę add() oraz wyświetlenie informacji o wszystkich notebookach. Powinna również istnieć metoda
    // checkAvailability(), która jako parametr przyjmuje obiekt klasy Computer i zwraca ilość identycznych komputerów
    // w sklepie.


    private static final int MAX_COMPUTERS = 100;
    public int checkAvailability;
    private Computer[]computers = new Computer[MAX_COMPUTERS];
    private int computersNumber;

    public Computer[] getComputer() {
        Computer[]comps = new Computer[computersNumber];
        for (int i = 0; i < computersNumber ; i++) {
            comps[i] = computers[i];

            
        }
        return comps;
    }

    public void setComputers(Computer[] computers) {
        this.computers = computers;
    }

    public int getComputersNumber() {
        return computersNumber;
    }

    public void setComputersNumber(int computersNumber) {
        this.computersNumber = computersNumber;
    }

    public void add(Computer comp) {
        if (computersNumber < MAX_COMPUTERS && comp != null) {
            computers[computersNumber] = comp;
            computersNumber++;
        }
    }

    public int checkAvailability(Computer find) {
        if (find == null)
            return 0;

        int count = 0;
        for (int i = 0; i < computersNumber; i++) {
            if (find.equals(computers[i])) {
                count++;
            }
        }
        return count;
    }
}
//W klasie DataStore tworzymy pole computers, które jest tablicą, która może pomieścić 100 obiektów typu Computer. Pole
// computersNumber pozwala śledzić faktyczną ilość komputerów w systemie. Jeśli ktoś doda np. 5 komputerów, to pole
// computersNumber powinno mieć wartość 5. Jego wartość zwiększamy za każdym razem, gdy ktoś wywoła metodę add().
// Metoda add() przyjmuje obiekt typu Computer, który chcemy wstawić do tablicy, ale przed dodaniem sprawdzamy,
// czy w tablicy jest jeszcze miejsce. W metodzie add() nie pozwalamy także na wstawianie do tablicy wartości null.
//
//Niestandardowo wygląda także getter getComputers(). W sytuacji, gdy w tablicy będziemy mieli np. tylko 5 obiektów,
// a reszta będzie nullami, to te nulle chcielibyśmy pominąć. W getterze tworzymy nową tablicę, kopiujemy do niej
// referencje na istniejące obiekty z tablicy computers i zwracamy taką tablicę, w której nie będzie żadnych nulli.
//
//Metoda checkAvailability() przyjmuje jako parametr obiekt typu Computer. Obiekt ten będzie porównany z każdym
// obiektem w tablicy i jeżeli takie dwa obiekty będą sobie równe, to zwiększamy licznik count, który zwracamy na
// końcu metody. Jeśli ktoś próbuje zliczyć ilość wystąpień nulli w tablicy, to zwracamy 0. W celu poprawnego działania,
// metoda ta wykorzystuje metodę equals() z klasy Computer. Jeżeli do porównywania wykorzystywalibyśmy operator == to
// wynik nie byłby poprawny.
