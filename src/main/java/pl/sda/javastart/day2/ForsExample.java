package pl.sda.javastart.day2;

public class ForsExample {
    public static void main(String[] args) {
        for (int i = 0; i < 4; i++)
            System.out.println("Marcin");
        pringNumbersWithoutDividableByParam(3);
        sumNaturalNumbersToLimit(1000);

    }

    public static void pringFewNaturalNumbers(int endoNumber) {
        for (int i = 0; i < endoNumber; i++) {
            System.out.println(i);
        }
    }

    public static void pringNumbersWithoutDividableByParam(int param) {
        System.out.println("parametr =" + param);
        for (int i = 0; i <= 10; i++) {
            if (i % param != 0) {


                System.out.println(i);

            }
        }
        for (int i = 0; i <= 10; i++) {
            if (i % param == 0) {
                continue;
            }
            System.out.println(i);

        }
    }

    public static void sumNaturalNumbersToLimit(int limit) {
        int sum = 0;
        for (int i = 0; ; i++) {
            if (sum + i >= limit) {
                break;
            }
            sum = i + sum;

        }
        System.out.println(sum);
    }

}

