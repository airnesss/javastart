package pl.sda.javastart.Wlasne;

import java.util.Arrays;

public class Train {
    //Utwórz klasę reprezentującą pociąg
    //pola:
    //-masa pociągu
    //-nazwa pociągu
    //-liczba pasażerów
    //-liczba wagonów
    private double weight;
    private String name;
    private int passangers;
    private  Wagons []wagons;

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPassangers() {
        return passangers;
    }

    public void setPassangers(int passangers) {
        this.passangers = passangers;
    }


    public Wagons[] getWagons() {
        return wagons;
    }

    public void setWagons(Wagons[] wagons) {
        this.wagons = wagons;
    }

    @Override
    public String toString() {
        return "Train{" +
                "weight=" + weight +
                ", name='" + name + '\'' +
                ", numberOfPassengers=" + passangers +
                ", numberOfWagons=" + wagons +
                ", wagon=" + Arrays.toString(wagons) +
                '}';

    }
    public void addOneWagon(Wagons wagons){
        Wagons[] nowyWagon;
        nowyWagon = new Wagons[this.wagons.length +1];

        for (int i = 0; i <this.wagons.length ; i++) {
            nowyWagon[i]= this.wagons[i];

        }
        nowyWagon[this.wagons.length]= wagons;
        setWagons(nowyWagon);

    }
}
