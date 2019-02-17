package pl.sda.javastart.Wlasne;

public class WF {
    public static void main(String[] args) {
        cwiczenia(2);

    }
    private static void cwiczenia(int iloscCwiczen) {
        
        for (int i = 0; i < iloscCwiczen; i++) {
            System.out.print("gwizdnij");                // ta pętla decyduje o ilosci iteracji dalszych pętli

            for (int j = 0; j < iloscCwiczen; j++)
                System.out.print("klasnij");

                for (int k = 0; k < iloscCwiczen; k++)
                    System.out.print("pierdnij");

                for (int l = 0; l < iloscCwiczen; l++)
                    System.out.print("skocz");
                System.out.println();

            }

        }

    }

