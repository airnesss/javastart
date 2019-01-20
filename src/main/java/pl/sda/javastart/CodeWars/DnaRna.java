package pl.sda.javastart.CodeWars;

public class DnaRna {
    //Kwas dezoksyrybonukleinowy jest podstawową cząsteczką do przechowywania informacji w systemach biologicznych.
    // Składa się z czterech zasad kwasu nukleinowego: guaniny ("G"), cytozyny ("C"), adeniny ("A") i tyminy ("T").
    //Kwas rybonukleinowy, RNA, jest główną cząsteczką przekaźnikową w komórkach. RNA różni się nieco od DNA jego
    // chemiczną strukturą i nie zawiera tyminy. W RNA tymina zostaje zastąpiona innym kwasem nukleinowym Uracil ("U").
    //Stwórz funciton, który tłumaczy dany łańcuch DNA na RNA.
    public static void main(String[] args) {
        System.out.println(dnaToRna("DNA"));

    }
    public static String dnaToRna(String dna){
        return dna.replace("T","U");
    }
}
