package pl.sda.javastart;

public class Arrays {
    public static void main(String[] args) {
        String[]names = {"Basia" , "Kasia" , "Wojciech" , "Agnieszka" , "Kacper"};
        Integer[]numbers = {4,7,10,2,1,14,23,12,5};

        System.out.println("Names :");
        printArray(names);

        System.out.println("Numbers :");
        printArray(numbers);
        System.out.println();

        //sortowanie
        System.out.println("Arrays sort (numbers): ");
    }
    public static <T> void printArray(T[]arr){
        for (T t : arr) {
            System.out.print(t + " ");
            
        }
        System.out.println();
    }
}
