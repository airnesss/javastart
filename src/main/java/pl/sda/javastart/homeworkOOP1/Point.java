package pl.sda.javastart.homeworkOOP1;

public class Point {
    private double x;
    private double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;

    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;                                  //Getter i setter służą do ustawiania i pobierania wartosci dla danego obiektu klasy
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }
}
