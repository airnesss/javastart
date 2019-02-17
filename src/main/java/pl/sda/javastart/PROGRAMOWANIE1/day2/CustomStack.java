package pl.sda.javastart.PROGRAMOWANIE1.day2;

public class CustomStack <T> {
    private int conteinerSize = 20;
    private Object[]conteiner = new Object[conteinerSize];
    private int  posiotion = -1;

    public void push (T t){
        if (t == null){
            throw new RuntimeException();
        }
        conteiner[posiotion]= t;

    }
}
