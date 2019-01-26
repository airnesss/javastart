package pl.sda.javastart.ComputerShopEqualsToString;

public class NotebookShop {
    //NotebookShop - klasa z metodą main. Utwórz w niej co najmniej 5 laptopów i dodaj je do bazy sklepu. Co najmniej 2
    // komputery muszą być takie same. Dla powtarzającego się egzemplarza sprawdź działanie metody checkAvailability(),
    // a na końcu wyświetl wszystkie notebooki dostępne w sklepie
    public static void main(String[] args) {
        DataStore dataStore = new DataStore();
        dataStore.add(new Computer("Asus", 60));
        dataStore.add(new Computer("Apple",90));
        dataStore.add(new Computer("HP",20));
        dataStore.add(new Computer("Lenovo",50));
        dataStore.add(new Computer("Lenovo",50));

        Computer compTOFind = new Computer("Lenovo", 50);
        int computersFound = dataStore.checkAvailability(compTOFind);
        System.out.println("Liczba Komputerów " + compTOFind + ": " + computersFound);
        System.out.println("Wszystkie dostępne komputery :");
        for (Computer c : dataStore.getComputer()) {
            System.out.println(c);
            
        }
    }
}
//W klasie testowej tworzymy obiekt DataStore, który będzie magazynem na dane. wstawiamy do bazy 5 komputerów, z czego 2
// się powtarzają. Później tworzymy obiekt compToFind, i zliczamy ilośc jego wystąpień w magazynie korzystając z metody checkAvailability().
//
//Na końcu wyświetlamy wszystkie komputery. Metoda dataStore.getComputers() zwraca tablicę, korzystając z pętli for-each
// przechodzimy po każdym elemencie i wyświetlamy go w konsoli. Dzięki temu, że w klasie Computer zdefiniowaliśmy metodę
// toString(), to obiekty w konsoli będą wyświetlane jako nazwa producenta i nazwa modelu rozdzielone spacją.
