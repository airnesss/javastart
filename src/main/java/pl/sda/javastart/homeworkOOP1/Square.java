package pl.sda.javastart.homeworkOOP1;

public class Square extends Figure{
    private Point p;
    private double side;

    public Square(Point p, double side) {
        this.p = p;
        this.side = side;
    }

    public Point getP() {
        return p;
    }

    public void setP(Point p) {
        this.p = p;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public String toString() {
        return null;
    }

    @Override
    double getArea() {
        return 0;
    }

    @Override
    double getCircuit() {
        return 0;
    }

    @Override
    Point[] getEdges() {
        return new Point[0];
    }
}
