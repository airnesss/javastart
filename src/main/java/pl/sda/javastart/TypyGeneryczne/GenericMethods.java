package pl.sda.javastart.TypyGeneryczne;

public class GenericMethods {
    public static void main(String[] args) {
        print5times(2);
        print5times("Marcin");



    }
    public static <T> void print5times (T arg){
        for (int i = 0; i <5 ; i++) {
            System.out.println(arg);

        }
    }
}
