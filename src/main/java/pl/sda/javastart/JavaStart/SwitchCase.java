package pl.sda.javastart.JavaStart;

public class SwitchCase {
    public static void main(String[] args) {
        final String name1 = "Adaś";
        final String name2 = "Marcin";

        String name = "Adaś";
        switch (name){
            case name1:
                System.out.println("Siemano Adaś! Witaj w programie");
            case name2:
                System.out.println("Witam Prezesa Panie Marcinie");
                break;
                default:
                    System.out.println("Witaj nieznany użytkowniku");
        }
    }
}
