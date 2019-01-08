package pl.sda.javastart.Wlasne;

public class AleksyQuest2 {
    public static void main(String[] args) {
        //Wypisz liczby od 0 do 100, ale tylko te, ktore dziela sie przez trzy
        stoLiczbPodzielnychPrzezTrzy();

    }
    private static void stoLiczbPodzielnychPrzezTrzy(){
        int i=1;
        for (i = 0; i <=100 ; i++) {
            if (i%3==0)
                System.out.println("liczba " + i);

        }
    }
}
