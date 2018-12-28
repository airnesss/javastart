package pl.sda.javastart.Wlasne;

import javax.print.attribute.standard.RequestingUserName;
import java.util.Scanner;

public class Comunicator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("jak się nazywasz ?");
        String name = scanner.nextLine();
        System.out.println("jak się dziś czujesz ?");
        String care = scanner.nextLine();
        System.out.println("ile masz lat ?");
        String age = scanner.nextLine();
        System.out.println("ile masz wzrostu ?");
        String height = scanner.nextLine();
        System.out.println("a ile ważysz ?");
        String weight = scanner.nextLine();
        System.out.println("POTWORNY GRUBAS Z CIEBIE !!");

    }
}
