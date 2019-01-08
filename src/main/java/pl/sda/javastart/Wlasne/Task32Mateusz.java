package pl.sda.javastart.Wlasne;

public class Task32Mateusz {
    public static void main(String[] args) {

    }
    private static boolean isNumberIsLessThanZero (int... args){
        for (int i : args){
            if (i<0){
                return true;
            }else i++;
        }
        return false;
    }
}
