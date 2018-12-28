package pl.sda.javastart.day4;

import java.math.BigDecimal;

public class CarOption {
    private String optionName;
    private BigDecimal optionprice;
    private boolean choosen;


    public String getOptionName(){
        return optionName;
    }
    public void setOptionName (String optionName){
        this.optionName = optionName;                            // THIS osdnosi sie do nazyw klasy

    }

    public BigDecimal getOptionprice() {
        return optionprice;
    }

    public void setOptionprice(BigDecimal optionprice) {
        this.optionprice = optionprice;
    }

    public boolean isChoosen() {
        return choosen;
    }

    public void setChoosen(boolean choosen) {
        this.choosen = choosen;
    }
}
