package pl.sda.javastart.JavaStart;

public class TabiceWielowymiarowe2 {
    public static void main(String[] args) {
        int[] longTab = new int[1000];
        longTab[99] = 100;                               //przypisanie setnego elementu do tablicy
        int[] middleTab = new int[100];
        int[] smallTab = new int[10];

        int[][] hugeTab = new int[3][];    //Przypisujemy trzy tablice , drugi nawias jest pusty bo mają rózna długość
        hugeTab[0] = longTab;
        hugeTab[1] = middleTab;
        hugeTab[2] = smallTab;
        System.out.println("długośc tablic to :");
        System.out.println(hugeTab[0].length + hugeTab[1].length + hugeTab[2].length);
        System.out.println("setny element pierwszej tablicy to :" + hugeTab[0][99]);
    }
}
