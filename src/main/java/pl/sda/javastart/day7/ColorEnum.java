package pl.sda.javastart.day7;

public enum ColorEnum {

    BLACK(1, "czarny"), WHITE(2, "biały");


    private Integer colorNumber;
    private String plName;

    ColorEnum(int colorNumber, String plName) {                    //domyslnie w enum konstruktor jest PRIVET!
        this.colorNumber = colorNumber;
        this.plName = plName;
    }

    public Integer getColorNumber() {
        return colorNumber;
    }

    public String getPlName() {
        return plName;
    }
}
