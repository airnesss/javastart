package pl.sda.javastart.Wlasne;

public class MethodExample1 {
    public static void main(String[] args) {
        System.out.println("Pole prostokąta a*b");
        int a = 5;
        int b = 3;
        int x = a * b;
        System.out.println(x);
        int result = rectangleArea(5, 3);
        System.out.println(result);
        System.out.println(rectangleCircut(5, 3));
        System.out.println(inchToMeter(5));
        System.out.println(minutesToDataValue(601));
        System.out.println(sumDigitsOfNumber(234));
        System.out.println(BMI(70,185));


    }

    public static int rectangleArea(int a, int b) {
        int result = a * b;
        return result;
    }

    public static int rectangleCircut(int a, int b) {
        int result = 2 * a + 2 * b;
        return result;
    }

    public static double inchToMeter(double inches) {
        double result = inches * 0.0254;
        return result;

    }

    public static String minutesToDataValue(int minutes) {
        int h = minutes / 60;
        int m = minutes % 60;
        int d = minutes / (24 * 60);
        int y = minutes / (24 * 60 * 365);
        return y + "y" + d + "d" + m + "m" + h + "h";

    }

    public static int sumDigitsOfNumber(int number) {
        int last = number % 10;
        int middle = number % 100 / 10;
        int first = number % 1000 / 100;
        int sum = last + middle + first;
        return sum;
    }
    private static double BMI (double weight, double height){
        double a = 70;
        double b = 185;
        double result = weight / Math.pow(height, 2);
        return result;
    }


}
