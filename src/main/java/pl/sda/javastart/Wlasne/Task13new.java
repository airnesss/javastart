package pl.sda.javastart.Wlasne;

public class Task13new {
    public static void main(String[] args) {
        // rozwiazanie bez BREAK
        potegaDruga(2,100);
    }
    public static void potegaDruga (int a,int b){
        int potega = 0;
        for (int i = 0; ; i++) {
            if (potega < b){
                potega = (int) Math.pow(a,i);
                System.out.println(potega);
            }

        }
    }
}
