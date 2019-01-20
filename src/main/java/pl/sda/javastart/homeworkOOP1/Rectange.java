package pl.sda.javastart.homeworkOOP1;

public class Rectange extends Figure{
    private  Point p;
    private double width;
    private double height;

    public Rectange(Point p, double width, double height) {
        this.p = p;
        this.width = width;
        this.height = height;
    }

    public Point getP() {
        return p;
    }

    public void setP(Point p) {
        this.p = p;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
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
