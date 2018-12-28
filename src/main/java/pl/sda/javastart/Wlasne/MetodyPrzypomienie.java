package pl.sda.javastart.Wlasne;

public class MetodyPrzypomienie {
    public static void main(String[] args) {
        System.out.println("pole prostokata a*b");
        int a = 5;
        int b = 4;
        int c = a * b;
        System.out.println(c);
        int result = rectangleArea(10,20);
        System.out.println(result);
        System.out.println(rectangleCircuit(5,6));
        System.out.println(inchToMeter(20));
        System.out.println(minutesToDataValue(601));
        System.out.println(sumDigitsOfNumber(239));
        System.out.println(BMI(120,190));
    }
    public static int rectangleArea (int a, int b){
        int result = a * b;
        return result;
    }
    public static int rectangleCircuit ( int a, int b){
        int result = 2 * a + 2 * b;
        return result;
    }
    public static double inchToMeter (double inches){
        double result = inches * 0.254;
        return result;

        }
        public static String minutesToDataValue (int minutes){
        int m = minutes % 60;
        int h = minutes / 60;
        int d = minutes /(60*24);
        int y = minutes /(60*24*365);
        return y + "y" + d + "d" + h + "h" + m + "m";
        }
        public static int sumDigitsOfNumber (int number){
        int last = number%10;
        int middle = number%100/10;
        int first = number%1000/100;
        int sum = last + middle + first;
        return sum;

        }
        public static double BMI ( double weight, double height){
        double a =height = 170;
        double b = weight = 70;
        double result = weight / Math.pow(height, 2);
        return result;
        }
    }



