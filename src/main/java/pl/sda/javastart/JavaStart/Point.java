package pl.sda.javastart.JavaStart;

public class Point {
    private int x;
    private int y;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;

    }
    public Point(){};                      //KONSTRUKTOR BEZPARAMETROWY

    public Point (int x, int y){
        setX(x);                         //Konstruktor PARAMETROWY
        setY(y);
    }
}

