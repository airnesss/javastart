package pl.sda.javastart.ReferencjeDoMetodIKonstruktorow;

import java.util.Arrays;
import java.util.function.Consumer;

public class MethodRef {
    public static void main(String[] args) {
        String[]names = {"Kowalski", "Abacki", "Wojnarek", "Bednarek", "Krzywousty"};
        Arrays.sort(names,MethodRef::sortRosnaco);
        consumeArray(names,System.out::println);
        System.out.println(">>>");
        Arrays.sort(names,MethodRef::sortMalejaco);
        consumeArray(names,System.out::println);


    }
    public static <T> void consumeArray(T[]arr, Consumer<T>consumer){
        for (T t : arr) {
            consumer.accept(t);

        }
    }
    public static int sortRosnaco(String t1, String t2){
        return t1.compareTo(t2);
    }
    public static int sortMalejaco(String t1,String t2){
        return t2.compareTo(t1);
    }
}
