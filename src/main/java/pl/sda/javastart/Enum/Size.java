package pl.sda.javastart.Enum;

public enum Size {
    //DEFINIUJEMY NAZWE W JEZYKU POLSKIM

    SMALL("Mały"), MEDIUM("Sredni"), LARGE("Duży"), XLARGE("Bardzo duży");

    private final String description;

    public String getDescription() {
        return description;
    }

    Size(String description) {
        this.description = description;

    }
}
