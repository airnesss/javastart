package pl.sda.javastart.Wlasne;

public class OOPAirPlane {
    public static void main(String[] args) {
        AirPlane Boeing = new AirPlane();
        Boeing.setName("737");
        Boeing.setColor("white");
        Boeing.setWeight(100);
        Boeing.setFuelUsage(200);
        Boeing.setCapaCity(1000);
        System.out.println(Boeing);
    }
}
