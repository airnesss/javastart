package pl.sda.javastart.Wlasne;

public class PrintF {
    public static void main(String[] args) {
       int x = 100;
        System.out.println("Printing simple integer x = " +x);
        double Pi = Math.PI;
        System.out.printf("Formatted with precison: Pi = " +"%.2f%n", Pi );
        float n = 5.2f;
        System.out.printf("Formatted to specific width: n = " +"%.4f%n", n);
        n = 2324435.25f;
        System.out.printf("Formatted to right margin n = " + n);






    }
}
