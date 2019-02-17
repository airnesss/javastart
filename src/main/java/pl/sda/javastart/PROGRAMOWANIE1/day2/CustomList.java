package pl.sda.javastart.PROGRAMOWANIE1.day2;

public class CustomList<X> {
    private final int pool = 10;
    private Object[] handler = new Object[10];

    private int positon = 0;

    public int add(X elment) {
        handler[positon] = elment;
        positon++;
        int p = positon;
        if (handler.length - 1 < positon) {
            Object[] customHandler = new Object[handler.length + pool];   //Powiększenie tablicy
            for (int i = 0; i < handler.length; i++) {
                customHandler[i] = handler[i];

            }
            handler = customHandler;
        }
        return p;


    }

    public X get(int p) {
        if (p > handler.length - 1) {
            throw new RuntimeException();

        }
        X x = (X) handler[p];
        if (x == null) {
            throw new RuntimeException();
        }
        return x;
    }

    public int size() {
        return positon;


    }

    public boolean isEmpty() {
        return size() == 0;
        //retun position ==0;

    }

    public void clear() {
        handler = new Object[pool];            //nadpisanie nowa talicą
        positon = 0;                              //wyzerowanie pozycji bo zaczynamy iteracje po nowej tablicy
    }

public void  remove(int element){
        if (element>positon){
            throw new RuntimeException();
        }
        handler[element] = null;
        Object[] tab = new Object[handler.length];
        int j = 0;
    for (int i = 0; i < handler.length; i++) {
        if (handler[i] != null){
            tab[j] = handler[i];
            j++;
        }

    }
    positon--;                          //FIXME
    handler= tab;

}
}
