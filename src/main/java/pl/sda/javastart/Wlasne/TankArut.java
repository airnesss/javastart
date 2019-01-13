package pl.sda.javastart.Wlasne;

public class TankArut {
    private String nazwa;
    private double masa;
    private double pojemnoscZbiornika;
    private double spalanie;

    public TankArut(String name, double weight, double capaCity, double fuelUsage){
        this.nazwa = name;
        this.masa = weight;
        this.pojemnoscZbiornika = capaCity;
        this.spalanie = fuelUsage;
    }
    public int dystans (int capaCity, int fuelUsage){
        return capaCity/fuelUsage*100;
    }

    @Override
    public String toString() {
        return "Jestem czołgiem o masie" + nazwa + "o masie" + masa + "oraz spalam" + spalanie;
    }
}
