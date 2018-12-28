package pl.sda.javastart.Wlasne;

public class answerCall {
    public static void main(String[] args) {
        System.out.println(telefon(true, false, false));

    }
    public static boolean telefon (boolean isMama, boolean isMorning, boolean isAsleep){
        if (isAsleep){
            return false;
        }else {
            if (isMorning ){
                return false;
            }else {
                if (isMama){
                    return false;
                }
                return true;
            }
        }
    }
}
