package pl.sda.javastart.ComputerShopEqualsToString;

import java.util.Objects;

public class Computer {
    //  Computer - klasa posiada pola producer i model - czyli informacje o producencie i modelu laptopa, przy czym model
    //  jest reprezentowany za pomocą liczby całkowitej. Zdefiniuj w niej metodę equals(), która pozwoli na zweryfikowanie
    //  , czy jest to jedyny taki egzemplarz w sklepie. Przesłoń także metodę toString(), która pozwoli uzyskać czytelną
    //  informację o danym egzemplarzu.

    private String producer;
    private int model;

    public Computer(String producer, int model) {
        this.producer = producer;
        this.model = model;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public int getModel() {
        return model;
    }

    public void setModel(int model) {
        this.model = model;
    }

    @Override
    public String toString() {
        return producer + " " + model;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        Computer computer = (Computer) o;
        return model == computer.model && Objects.equals(producer, computer.producer);
    }

    @Override
    public int hashCode() {
        return Objects.hash(producer,model);
    }
}

//W klasie Computer definiujemy dwa pola. Choć metody hashCode() nie będziemy wykorzystywali, to stworzyłem ją w celu
// zachowania kontraktu z metodą equals(). Obie metody zostały wygenerowane przy pomocy środowiska. Nadpisałem także
// metodę toString(), aby móc wyświetlać obiekty typu Computer w wygodny i czytelny sposób.
