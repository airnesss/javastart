package pl.sda.javastart.Wlasne;
import java.time.LocalDateTime;

public class LocalDataTime {
    public static void main(String[] args) {
        //System.out.println(przwitajOsobe("Marcin", 55,true));
        System.out.println(wydrukujCzas());
    }
    public static String przwitajOsobe(String imie,int wiek, boolean plec){
        if (plec == true){
            return "Czesc, jestem " + imie + ", mam " + wiek + " lat. Jestem mężczyzną";
        } else {
            return "Czesc, jestem " + imie + ", mam " + wiek + " lat. Jestem kobietą";
        }

    }
    public static String wydrukujCzas(){
        int minuta;
        int godzina;
        int dzien;
        int miesiac;
        int rok;

        LocalDateTime now = LocalDateTime.now();
        minuta = now.getMinute();
        godzina = now.getHour();
        dzien = now.getDayOfMonth();
        miesiac = now.getMonthValue();
        rok = now.getYear();

        //”12:23 23.11.2017”

        return String.valueOf(godzina) + ":" + String.valueOf(minuta) + " " + String.valueOf(dzien) + "." + String.valueOf(miesiac) + "." + String.valueOf(rok);
    }
}