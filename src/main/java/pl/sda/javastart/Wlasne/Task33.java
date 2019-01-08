package pl.sda.javastart.Wlasne;

public class Task33 {
    public static void main(String[] args) {
        System.out.println(speedLimit(169));

    }
    public static int speedLimit(int predkosc){
        int mandat = 0;
        if (predkosc >= 51 && predkosc <=60){
            mandat = 100;
        }else if (predkosc >= 61 && predkosc <= 70){
            mandat = 200;                               //FIXME
        }else if (predkosc > 71){
            mandat = 300;
        }
        return mandat;
    }
}
