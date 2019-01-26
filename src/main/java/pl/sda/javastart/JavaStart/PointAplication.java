package pl.sda.javastart.JavaStart;

public class PointAplication {

    public static final int ADD_X = 0;
    public static final int ADD_Y = 1;
    public static final int MINUS_X = 2;
    public static final int MINUS_Y = 3;

    public static void main(String[] args) {
        Point p1 = new Point(10, 20);
        PointControler pc = new PointControler();
        System.out.println("Punkt: (" + p1.getX() + ";" + p1.getY() + ")");
        pc.addX(p1);
        System.out.println("Punkt addX: (" + p1.getX() + ";" + p1.getY() + ")");
        pc.addY(p1);
        System.out.println("Punkt addY: (" + p1.getX() + ";" + p1.getY() + ")");
        pc.minusX(p1);
        System.out.println("Punkt minusX: (" + p1.getX() + ";" + p1.getY() + ")");
        pc.minusY(p1);
        System.out.println("Punkt minusY: (" + p1.getY() + ";" + p1.getY() + ")");
        System.out.println();

        System.out.println("A teraz wersja ze SWITCH :");


        int option = MINUS_Y;
        switch (option) {
            case ADD_X:
                pc.addX(p1);
                break;
            case ADD_Y:
                pc.addY(p1);
                break;
            case MINUS_X:
                pc.minusX(p1);
                break;
            case MINUS_Y:
                pc.minusY(p1);
                break;
            default:
                System.out.println("Podałeś błędną wartość");
        }
        System.out.println("punkt po zmianie wynosi : (" + p1.getX() + ";" + p1.getY() + ")");

    }
}
