package pl.sda.javastart.JavaStart;

public class TablicaWielowymiarowa {
    public static void main(String[] args) {


        String[]firstNames = {"Marcin", "Natalia", "Adaś"};
        String[]lastNames = {"Kierzkowski", "Siwiec", "Rudnicki"};

        String[][]firstLast ={firstNames,lastNames};
        System.out.println("Pierwsza osoba to :");
        System.out.println(firstLast[0][0] + " " + firstLast[1][0]);
        System.out.println("Druga osoba to :");
        System.out.println(firstLast[0][1] + " " + firstLast[1][1]);
        System.out.println("Trzecia osoba to :");
        System.out.println(firstLast[0][2] + " " + firstLast[1][2] );
    }
}