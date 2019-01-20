package pl.sda.javastart.homeworkOOP1;

public class Circle extends Figure {
    private Point p;
    private double r;

    public Circle(Point p, double r) {
        this.p = p;
        this.r = r;

    }

    public Point getP() {
        return p;
    }

    public void setP(Point p) {
        this.p = p;
    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
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
