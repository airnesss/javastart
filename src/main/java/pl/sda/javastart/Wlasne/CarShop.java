package pl.sda.javastart.Wlasne;

public class CarShop {
    public static void main(String[] args) {
        Car audi = new Car();
        audi.brand = "Audi";
        audi.model = "a4";
        audi.doors = 4;
        audi.carColor = "czarny";
        audi.wheelsColor = "srebrny";
        audi.tiresColor = "czarny";

        String audiInfo = audi.brand + " " + audi.model + ",dzwi " + audi.doors + ",kolor nadwozia: " + audi.carColor +
        ",kolor felg :" + audi.wheelsColor + ",kolor opon :" + audi.tiresColor;
        System.out.println("wybrałeś następuący samochód :");
        System.out.println(audiInfo);
    }
}
