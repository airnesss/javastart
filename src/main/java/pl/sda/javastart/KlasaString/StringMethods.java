package pl.sda.javastart.KlasaString;

public class StringMethods {
    public static void main(String[] args) {
        String worlds = "jeden dwa trzy cztery pięć sześć siedem";
        String sub1 = worlds.substring(6,8);
        String sub2 = worlds.replaceAll("dwa", "hehe");
        String sub3 = worlds.trim();
        char charAt = worlds.charAt(6);
        String split = "1a2a3a4a";


        System.out.println(sub1);
        System.out.println(sub2);
        System.out.println(sub3);
        System.out.println(charAt);
        System.out.println(worlds.toUpperCase());
        
    }
}
