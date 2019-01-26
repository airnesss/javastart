package pl.sda.javastart.Enum;

public class Tshirt {
    public static final int SMALL = 1;
    public static final int MEDIUM = 2;
    public static final int LARGE = 3;

    private Size size;

    public Size getSize() {
        return size;
    }

    public void setSize(Size size) {
        //Definiujemy w setterze blokade zeby któś np nie ustawił rozmiaru jako ładny !!
        //Następnie zroiblismy ENUM wiec zmieniamy z int size na SIZE
        // if (size >= SMALL && size <= LARGE)
        this.size = size;
        // else
        // System.out.println("NIEZYDENTYFIKOWANY ROZMIAR");
    }

}
