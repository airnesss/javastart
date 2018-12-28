package pl.sda.javastart.Wlasne;

public class IfsExample2 {
    public static void main(String[] args) {
        System.out.println(isEven(12));
        System.out.println(isEvenTernary(15));
        System.out.println(dividableByThreeAndFive(8));
        System.out.println(addTax(83,23));
        System.out.println(introduction("Maciej",88, true));
        System.out.println(twoParamsEven(300, 34));
        System.out.println(thirdParmsEven(12,20,30));
        System.out.println(isAnyBiggerThanZero(-2,-5));
        System.out.println(answerCall(true,true, false));
        System.out.println(checkWhichOeIsBigger(3,2,1));
}
    public static boolean isEven(int a){
        if (a % 2 == 0) {
            return true;

        } else {
            return false;
        }
    }
    public static boolean isEvenTernary(int a){
        boolean result = a % 2 == 0 ? true : false;
                return result;
    }
    public static boolean dividableByThreeAndFive(int a){
        boolean result = a % 3 == 0 && a % 5 ==0;
        return result;

    }
    public static double addTax(double price, int tax){
        double afterTax = price * tax / 100 + price;
        return afterTax;
    }
    public static String introduction(String name ,int age, boolean genderParam){
        String gender;
        if (genderParam){
            gender = "mężczyzną";
        }else {
            gender = "kobietą";

        }
        return "Cześć! Jestem Maciej, mam 88 lat i jestem mężczyzną";
    }
    public static boolean twoParamsEven(int firstValue, int secondValue){
        if (firstValue % 2 == 0 && secondValue % 2 == 0){
            return true;

        }else {
            return false;
        }



    }
    public static boolean thirdParmsEven(int firstVale, int secondValue, int thirdValue){
        if (firstVale + secondValue == thirdValue){
            return true;
        }else if (secondValue + thirdValue == firstVale){
            return false;

        }else if (thirdValue + firstVale == secondValue){
            return false;

        }else {
            return false;
        }
    }
    public static boolean isAnyBiggerThanZero(int a, int b){
        return  a > 0 || b > 0;
    }
    public static boolean answerCall(boolean isMama, boolean isMorning,boolean isAsleep){
        if (isAsleep){
        }else {
            return false;
        }
        if (isMorning & !isMama) {
            return false;
        }
        return true;

    }
    public static int checkWhichOeIsBigger(int a, int b, int c) {
        if (a > b && a > c) {
            return a;
        }
            if (b > a && b > c) {
                return b;
            }
                return c;
            }

        }
