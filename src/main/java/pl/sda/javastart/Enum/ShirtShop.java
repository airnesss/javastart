package pl.sda.javastart.Enum;

public class ShirtShop {
    public static void main(String[] args) {
        //Wykorzystujemy ENUM
        //  Tshirt tshirt = new Tshirt();
        //tshirt.setSize(Size.MEDIUM);
        // System.out.println("Dostępne rozmiary to :");
        // System.out.println("SMALL" + Tshirt.SMALL);
        // System.out.println("MEDIUM" + Tshirt.LARGE);
        //System.out.println("LARGE" + Tshirt.LARGE);
        System.out.println("Dostępne rozmiary to ");
        System.out.println(Size.SMALL.getDescription());
        System.out.println(Size.MEDIUM.getDescription());
        System.out.println(Size.LARGE.getDescription());
        System.out.println();

        Tshirt tshirt = new Tshirt();
        tshirt.setSize(Size.MEDIUM);
        System.out.println(tshirt.getSize());
        System.out.println(tshirt.getSize().getDescription());
        System.out.println();

      //Dzięki metodzie values() kod można uczynić dużo bardziej uniwersalnym.
        // Możemy np. zastąpić wyświetlanie dostępnych rozmiarów na pętlę:
        System.out.println("Dostępne rozmiary Tshirtów to :");
        for (Size s : Size.values()) {
            System.out.println(s.getDescription());


            
        }
        System.out.println("Wybrałeś Tshirt w rozmiarze: " + tshirt.getSize().getDescription());

    }
}
//a co jeśli chcielibysmy dodac nowy rozmiar XL ? Trzeba by wszystko zmieniac dlatego zrbiłem enum!