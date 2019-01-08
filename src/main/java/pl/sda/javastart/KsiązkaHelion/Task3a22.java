package pl.sda.javastart.KsiązkaHelion;

public class Task3a22 {
    public static void main(String[] args) {
        System.out.println("program wyswietla litery od A do Z i od Z do A");
        char znak;
        for (znak = 'A';znak <= 'Z'; znak++) {
            if (znak<'Z')
            System.out.print(znak + ",");
        else
                System.out.println(znak+ ".");
            }
            for (znak = 'Z'; znak >= 'A';znak--) {
                if (znak > 'A')
                    System.out.print(znak + ",");
                else
                    System.out.println(znak+ ".");
                }
            }
        }


