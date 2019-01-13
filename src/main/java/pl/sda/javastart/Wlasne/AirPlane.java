package pl.sda.javastart.Wlasne;

public class AirPlane {
    private String name;
    private String color;
    private double weight;
    private double fuelUsage;
    private double capaCity;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getFuelUsage() {
        return fuelUsage;
    }

    public void setFuelUsage(double fuelUsage) {
        this.fuelUsage = fuelUsage;
    }

    public double getCapaCity() {
        return capaCity;
    }

    public void setCapaCity(double capaCity) {
        this.capaCity = capaCity;
    }

    public int distance(int fuelUsage, int capaCity){
        return capaCity/fuelUsage*100;
    }

    @Override
    public String toString() {
        return "jestem samolotem o nazwie " + name + "o kolorze " + color + "i spalam: " + fuelUsage + "na 100km";
    }
}

