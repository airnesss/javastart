package pl.sda.javastart.Exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TryMultiCatch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[]numbers = new int[2];
        boolean error = true;
        do {
            try {
                System.out.println("Podaj pierwszą liczbę ");
                numbers[0]= sc.nextInt();
                sc.nextLine();
                System.out.println("Podaj drugą liczbę ");
                numbers[1] = sc.nextInt();
                sc.nextLine();
                System.out.println("która liczbę wybierasz (1 czy 2");
                System.out.println(numbers[sc.nextInt()]-1);
                error = false;
            }catch (InputMismatchException ex){
                System.out.println("Nie podałeś liczby całkowitej, spróbuj jeszcze raz");
                sc.nextLine();
            }catch (ArrayIndexOutOfBoundsException ex){
                System.out.println("Miałeś podać liczbę 1 albo 2");
                sc.nextLine();
            }
        }while (error);
        sc.close();
    }
}
