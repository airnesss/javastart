package pl.sda.javastart.Wlasne;

public class UzupełnienieTablicyPetla {
    public static void main(String[] args) {
        int[] numery = new int[10];
        //uzupełniamytablice
        for (int i = 0; i < numery.length; i++) {
            numery[i] = i + 1;
        }
        for (int i = 0; i < numery.length; i++) {
            System.out.println("liczba " + numery[i]);
        }
    }
}
