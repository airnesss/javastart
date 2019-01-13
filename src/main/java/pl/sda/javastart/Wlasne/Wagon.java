package pl.sda.javastart.Wlasne;

public class Wagon {
    int weight;
    String wagonClass;
    int passangers;
    boolean isFoodAvailable;

    public Wagon (int weight, String wagonClass, int passangers, boolean isFoodAvailable){
        this.weight = weight;
        this.wagonClass = wagonClass;
        this.passangers = passangers;
        this.isFoodAvailable = isFoodAvailable;
    }

    @Override
    public String toString() {
        return weight+wagonClass+passangers+isFoodAvailable;
    }
}
