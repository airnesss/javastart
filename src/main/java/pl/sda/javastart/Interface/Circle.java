package pl.sda.javastart.Interface;

class Circle implements Shape {
    private double r;

    public Circle(double r) {
        this.r = r;
    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }

    @Override
    public double calculateArea() {
        return Shape.Pi * r * r;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * Shape.Pi * r;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Koło :");
        sb.append("Promień" + r + " ,");
        sb.append("Obwód " + calculatePerimeter() + " ," );
        return sb.toString();
    }
}
