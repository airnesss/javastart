package pl.sda.javastart.day7;

public class ExceptionExample {
    public static void main(String[] args) {
        try {
            System.out.println(divide(2, 0));
        } catch (ArithmeticException e) {                            //e - moze byc co kolwiek
            System.out.println("Wystąpił wyjątek" + e.getMessage());
        }
        System.out.println(divide(2, 2));
        try {

            divadeWithException(2, 0);
            //} catch ( ArithmeticException e){
            // System.out.println("Wystąpił wyjątek " + e.getMessage());
        } finally {
            System.out.println("blok FINALLY");


        }
        //FIXME
        System.out.println("Koniec programu");
    }


    public static int divide(int a, int b) {
        return a / b;
    }

    public static int divadeWithException(int a, int b) {
        if (b == 0) {
            throw new MyruntimeException("Nie dziel przez zero!");
        }
        return a / b;
    }

    public static int divadeWithCheckedException(int a, int b) throws MyCheckedException {
        if (b == 0) {

            throw new MyCheckedException("Nie dziel przez zero!");
        }
        return a / b;
    }
}
