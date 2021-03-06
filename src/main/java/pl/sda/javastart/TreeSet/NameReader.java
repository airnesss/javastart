package pl.sda.javastart.TreeSet;

import java.io.File;
import java.io.IOException;
import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeSet;

public class NameReader {
    public static void main(String[] args)throws IOException {
        TreeSet<String>names = new TreeSet<>(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return -o1.compareTo(o2);
            }
        });

        try(Scanner scanner = new Scanner(new File("names.txt"))){
            while (scanner.hasNextLine()){
                names.add(scanner.nextLine());
            }
        }
        System.out.println("Ilość imion w zbiorze " + names.size());
    }

}
