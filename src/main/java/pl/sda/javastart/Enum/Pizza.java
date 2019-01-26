package pl.sda.javastart.Enum;

public enum Pizza {
    //Z definicją typu Enum o nazwie Pizza, który może przyjmować wartość MARGHERITA (sos pomidorowy + ser), CAPRICIOSA
    // (sos pomidorowy + ser + pieczarki) lub PROSCIUTTO (sos pomidorowy + ser + szynka).
    // Typ Pizza powinien przechowywać informacje o każdym składniku osobno, pozwalać odczytać informację o każdym
    // składniku, a także przesłania metodę toString()
    MARGHERITA(true, true, false, false);

  // CAPRICIOSA(true,true,true,false);
                                                     //FIXME
  //  PROSCIUTTO(true,true,false,true);

    private boolean tomatoSauce;
    private boolean cheese;
    private boolean mushrooms;
    private boolean ham;

    Pizza(boolean tomatoSauce, boolean cheese, boolean mushrooms, boolean ham) {
        this.tomatoSauce = tomatoSauce;
        this.cheese = cheese;
        this.mushrooms = mushrooms;
        this.ham = ham;
    }

    public boolean isTomatoSauce() {
        return tomatoSauce;
    }

    public boolean isCheese() {
        return cheese;
    }

    public boolean isMushrooms() {
        return mushrooms;
    }

    public boolean isHam() {
        return ham;
    }

    //Przesłoniłem także metodę toString() klasy Enum wyświetlając w przyjaznej formie informację o typie pizzy i składnikach.
    @Override
    public String toString() {
        //przypisanie nazwy pizzy
        String result = this.name() + "(";
        //informacja o składnikach
        if (tomatoSauce) {
            result = result + "sos pomidorowy";
        }
        if (cheese) {
            result = result + "ser";
        }
        if (mushrooms) {
            result = result + "pieczarki";
        }
        if (ham) {
            result = result + "szynka";
        }
        result = result + ")";

        return result;
    }
}



