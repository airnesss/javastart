package pl.sda.javastart.Wlasne;

public class IfsPrzypomnienie {
    public static void main(String[] args) {
        System.out.println(isEven(5));
        System.out.println(podzielna(15));
        System.out.println(isEvenTernary(9));
        System.out.println(addTax(100,23));
        System.out.println(introduction("Maciej",88,true));
        System.out.println(czySąPażyste(10,5));
        System.out.println(sumaTrzech(10,20,30));
        System.out.println(cosWiekszegoNizZero(-110,-5));




    }
    public static boolean isEven(int a){
        if (a%2 ==0){
            return true;
        }else {
            return false;
        }


    }
    public static boolean podzielna (int a){
        if (a%3==0 && a%5 ==0){

            return true;
        }else {
            return false;
        }
    }
    public static boolean isEvenTernary (int a){
        boolean result = a%2 == 0 ? true : false;
        return result;
    }
    public static double addTax (double price , int tax){
        double aftertax = price * tax/ 100 + tax;
        return aftertax;
    }
    public static String introduction (String name, int age, boolean genderParam){
        String gender;
        if (genderParam){
            gender = "mężczyzną";
        }else {
            gender = "kobietą";
        }
        return "Cześć jestem " + name + " mam " + age + " i jestem " + gender;
    }
    public static boolean czySąPażyste (int firstValue, int secondValue){
        if (firstValue % 2== 0 && secondValue % 2== 0){
            return true;
        }else {
            return false;
        }

    }
    public static boolean sumaTrzech ( int firstValue, int secondValue, int thirdValue){
        if (firstValue + secondValue == thirdValue){
            return true;
        }else {
            return false;
        }
    }
    public static boolean cosWiekszegoNizZero (int firstValue, int secondValue){
        if (firstValue > 0 || secondValue > 0){
            return true;
        }else {
            return false;
        }
    }
        }



