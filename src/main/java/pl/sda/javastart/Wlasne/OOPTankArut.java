package pl.sda.javastart.Wlasne;

public class OOPTankArut {
    public static void main(String[] args) {
        TankArut Rudy = new TankArut("T-1000",5000,200,20);
        System.out.println("SPALANIE: ");
        System.out.println(Rudy.dystans(200,20));

        System.out.println(Rudy);
    }
}
