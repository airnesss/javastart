package pl.sda.javastart.Wlasne;

public class Task25Aleksy {
    public static void main(String[] args) {
        christmasTree(10);

        
    }
    public static void christmasTree(int height){
        for (int i = 1; i <height ; i++) {
            for (int j = 1; j <height -i; j++)
                System.out.print("*");
                for (int k = 1; k <=i ; k++)
                    System.out.print(k);
            for (int k = 1; k <i ; k++)
                System.out.print(k);
            for (int j = 1; j <height -i; j++)
                System.out.print("*");

                    System.out.println();

                }

            }
            
        }

