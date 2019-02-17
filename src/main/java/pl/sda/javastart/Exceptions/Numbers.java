package pl.sda.javastart.Exceptions;

public class Numbers {
    private int[]numbers;

    public Numbers(){
        numbers = new int[10];


    }
    public void add (int index, int number) throws ArrayIndexOutOfBoundsException{
        if (index < 0 || index >= numbers.length){
            throw new ArrayIndexOutOfBoundsException(index);
        }
        numbers[index] = number;

    }
    public void get ( int index) throws ArrayIndexOutOfBoundsException{
        if (index < 0 || index >= numbers.length){
            throw new ArrayIndexOutOfBoundsException(index);
        }
    }
}
