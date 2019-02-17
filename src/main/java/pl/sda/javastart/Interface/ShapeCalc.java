package pl.sda.javastart.Interface;

import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class ShapeCalc {
    private Scanner sc;

    public ShapeCalc() {
        Scanner sc = new Scanner(System.in);
    }

    public void closeScanner() {
        sc.close();
    }

    public Rectangle readRectangleData() throws InputMismatchException {
        System.out.println("Podaj informacje o prostokącie: ");
        System.out.println("Podaj długośc boku A i B");
        double a = 0;
        double b = 0;
        try {
            System.out.println("Podaj długośc boku A");
            a = sc.nextDouble();
            System.out.println("Podaj długosc boku B");
            b = sc.nextDouble();

        } catch (InputMismatchException ex) {
            sc.nextLine();
            throw ex;
        }
        return new Rectangle(a, b);


    }

    public Circle readCircleData() throws InputMismatchException {
        System.out.println("Podaj informacę o kole: ");
        System.out.println("Podaj długośc promienia");
        double r = 0;
        try {
            r = sc.nextDouble();
        } catch (InputMismatchException ex) {
            sc.nextLine();
            throw ex;
        }
        return new Circle(r);
    }

    public Triangle readTriangleData() throws InputMismatchException {
        System.out.println("Podaj informację o trójkącie : ");
        System.out.println("Podaj długosc boku A,B,C oraz wysokość");
        double a = 0;
        double b = 0;
        double c = 0;
        double h = 0;
        try {
            System.out.println("Podaj długosc boku A");
            a = sc.nextDouble();
            System.out.println("Podaj długosc boku  B");
            b = sc.nextDouble();
            System.out.println("Podaj długosc boku C");
            c = sc.nextDouble();
            System.out.println("Podaj wysokość rzuconą na bok A");
        } catch (InputMismatchException ex) {
            sc.nextLine();
            throw ex;

        }
        return new Triangle(h,a,b,c);
    }
    public Shape createShape () throws NoSuchElementException , InputMismatchException{
        try {
            int shapeType = sc.nextInt();
            sc.nextLine();
            switch (shapeType){
                case Shape.rectangle:
                    return readRectangleData();
                case Shape.circle:
                    return readCircleData();
                case Shape.triangle:
                    return readTriangleData();
                    default:
                        throw new NoSuchElementException();
            }
        }catch (InputMismatchException e){
            sc.nextLine();
            throw e;
        }
    }
}
