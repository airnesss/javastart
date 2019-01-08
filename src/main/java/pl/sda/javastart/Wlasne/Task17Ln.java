package pl.sda.javastart.Wlasne;

public class Task17Ln {
    public static void main(String[] args) {
        displayIntegersFromOneToTwentyIndivisibleByThreeUsingWhile(20, 3);
    }

    private static void displayIntegersFromOneToTwentyIndivisibleByThreeUsingWhile(int lastNumber, int divider) {


        int i = 1;


        while (i <= lastNumber) {

            if (i % divider != 0) {
                System.out.println(i + "\t");
            }

            i++;

        }


    }
}


