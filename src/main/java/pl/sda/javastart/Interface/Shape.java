package pl.sda.javastart.Interface;

public interface Shape {
   // Napisz program rozszerzający możliwości przykłady z lekcji. Stwórz kalkulator, który komunikujący się z
    // użytkownikiem i pobierający od niego dane, który pozwala na wyliczenie pola i obwodu prostokąta, trójkąta
    // i koła.

    int rectangle = 1;
    int circle = 2;
    int triangle = 3;

    double Pi = 3.14;

    public double calculateArea();
    public double calculatePerimeter();

}
