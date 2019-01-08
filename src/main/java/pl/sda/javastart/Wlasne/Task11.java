package pl.sda.javastart.Wlasne;

public class Task11 {
    public static void main(String[] args) {
//        Napisz metodę, która wyświetli na ekranie liczby od 1 do 20 i zaznaczy przy każdej z nich, czy jest to liczba parzysta, czy nieparzysta. Zrób to:
//        ykorzystując pętlę for
//        wykorzystując pętlę while
//        wykorzystując pętle do…while
        //zwrocLiczbyFor(1,20);
        zwrocLiczbyWhile(1,20);
    }
    public static void zwrocLiczbyFor (int firstnum, int secondnum){
        boolean even = false;
        for (int i = firstnum; i <= secondnum ; i++) {
            firstnum = i;
            even=firstnum%2==0;
            System.out.println(" " + firstnum + " " + even);


        }
    }
    public static void zwrocLiczbyWhile (int firstnum, int secondnum){
        boolean even;
        int i = firstnum;
        while (i <= secondnum){
            firstnum= i;
            even=firstnum%2==0;
            System.out.println(" " + firstnum + " " + even);
            i++;
        }

    }
}
