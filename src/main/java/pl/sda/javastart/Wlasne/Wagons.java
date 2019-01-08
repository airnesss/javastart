package pl.sda.javastart.Wlasne;

public class Wagons {
    private double weight;
    private String WagonsClass;
    private int numberOfPassangers;
    private boolean isFoodAvaible;

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getWagonsClass() {
        return WagonsClass;
    }

    public void setWagonsClass(String wagonsClass) {
        WagonsClass = wagonsClass;
    }

    public int getNumberOfPassangers() {
        return numberOfPassangers;
    }

    public void setNumberOfPassangers(int numberOfPassangers) {
        this.numberOfPassangers = numberOfPassangers;
    }

    public boolean isFoodAvaible() {
        return isFoodAvaible;
    }

    public void setFoodAvaible(boolean foodAvaible) {
        isFoodAvaible = foodAvaible;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}


