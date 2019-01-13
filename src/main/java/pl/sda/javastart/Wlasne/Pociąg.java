package pl.sda.javastart.Wlasne;

public class Pociąg {
    double weight;
    String name;
    int passangers;
    int wagons;
    int[] Wagon;

    public Pociąg(int weight, String name, int passangers, int wagons, int[] Wagon) {
        this.weight = weight;
        this.name = name;
        this.passangers = passangers;
        this.wagons = wagons;
        this.Wagon = Wagon;


    }

    @Override
    public String toString() {
        return weight+name+passangers+wagons+Wagon;
    }
}