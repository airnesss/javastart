package pl.sda.javastart.Interface;

class Rectangle implements Shape {


    private double a;
    private double b;

    public Rectangle(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    @Override
    public double calculateArea() {
        return a * b;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * a + 2 * b;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Prostokąt :");
        sb.append("Bok A " + a + " ,");
        sb.append("Bok B" + b + " ,");
        sb.append("Pole " + calculateArea() + " ,");
        sb.append("Obwód " + calculatePerimeter() + " ,");
    return sb.toString();
    }
}
