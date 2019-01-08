package pl.sda.javastart.Wlasne;

import java.math.BigDecimal;

public class ZadaniaZMateuszem {
    public static void main(String[] args) {
        System.out.println(changeToDouble("2"));
        System.out.println(isStringEmptyOrNull("kot"));
        System.out.println(returnBigDecimal("3"));
        System.out.println(changeCelciusToFarenhait(40));
        System.out.println(changeFartoCl(50.0));
        System.out.println(changeMinutesToQuarters(56));

    }
    private static double changeToDouble (String a){
        return Double.valueOf(a);
    }
    // Czy podany STRING jest pusty albo nullowy
    private static boolean isStringEmptyOrNull (String a){
        return a == "" || a == null;
    }
    // Zmiana string na bigdecimal
    private static BigDecimal returnBigDecimal (String a){
     //   double b = Double.valueOf(a);     // zamian Sting na double
        return BigDecimal.valueOf(changeToDouble(a));   // zamiana dobula na bigdecimal bo bigdecimal mozna tylko z doubla
   // metoda w metodzie dla uproszczenia kodu kóra jest zrobiona wyżej

    }
    // zmiana z celcisza na farenhaita
    private static double changeCelciusToFarenhait (double temperature){
        return 32.0 / (9.0 /5.0) * temperature;     // zmienno przecinkowe bo przyjmuje i zwraca double
    }
     // zmiana z farenchait na celciusz
    private static double changeFartoCl (double temperature){
        return (temperature - 32.0)* 5.0/9.0;
    }
    //zmiana podanej ilosci minut na liczbe pewnych kwadransow
    private static int changeMinutesToQuarters (int minutes ){
        return (minutes - (minutes%15))/15;
    }

}
