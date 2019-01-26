package pl.sda.javastart.day8;

import org.apache.commons.lang3.StringUtils;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FileOperations {
    private static final String PATCH_TO_FILE = "C:\\projects\\wiersz.txt";

    public static void main(String[] args) {

        try {

            FileReader fileReader = new FileReader(PATCH_TO_FILE);
            BufferedReader bufferedReader = new BufferedReader(fileReader);         //CTRL ALT V

            String line;
            List<String> lines= new ArrayList<>();
            while ((line = bufferedReader.readLine()) != null){                   //odczutuje linijka po linijce az do nulla
               lines.add(line);

            }

            printCapitalizet(lines);

        }catch (IOException e){
            System.out.println(e.getMessage());
            //NIGDY NIE ZOSTAWIAJ PUSTEGO CATCHa !!!
        }
    }

    private static void printCapitalizet(List<String> lines) {
        for (String s : lines) {
           String c = String.valueOf(s.charAt(0));                   //DUŻE LITERY
            String upperCased = c.toUpperCase();
            String restOfLine = s.substring(1);
            System.out.println(upperCased+restOfLine);


           // StringUtils.capitalize(s);                 //alternatywa do duzych liter

        }
    }


}
