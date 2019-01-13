package pl.sda.javastart.Wlasne;

public class OOPForTank {// tu sie buduje czołg

    public static void main(String[] args) {
        Tank tank = new Tank();
        tank.setName("TigerBonzo ");
        tank.setFuelUsage(60);
        tank.setFuelTankCapacity(600);
        tank.setWeight(500);
        double fuel = 80;
        System.out.println(tank);

    }
}
