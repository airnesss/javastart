package pl.sda.javastart.Interface;

import java.util.InputMismatchException;
import java.util.NoSuchElementException;

class Main {
    public static void main(String[] args) {
        Main main = new Main();

        ShapeCalc shapeCalc = new ShapeCalc();
        Shape shape = null;

        boolean readComplete = false;
        while (!readComplete){
            try {
                main.printOptions();
                shape = shapeCalc.createShape();
                readComplete = true;
            }catch (InputMismatchException ex){
                System.out.println("Wprowadziłeś dane w złym formacie, spróbuj ponownie");
            }catch (NoSuchElementException e){
                System.out.println("Wybrany kształt jest niepoprawny, spróbuj ponownie");
            }
        }
        System.out.println(shape);

        shapeCalc.closeScanner();

    }

    public void printOptions() {
        System.out.println("Wybierz figurę , której chcesz obliczyć pole i obwód :");
        System.out.println("Prostokąt " + Shape.rectangle);
        System.out.println("Koło " + Shape.circle);
        System.out.println("Trójkąt " + Shape.triangle);


    }

}
