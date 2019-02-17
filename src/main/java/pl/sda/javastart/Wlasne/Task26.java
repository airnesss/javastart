package pl.sda.javastart.Wlasne;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task26 {
    public static void main(String[] args) {
        System.out.println("Program ma metodę, która przyjmuje dwie tablice i zwraca trzecią z ich połączeniem");
        Random rand = new Random();
        Scanner sc = new Scanner(System.in);
        System.out.println("Podaj ilość obiektów w pierwszej tablicy");
        int n = sc.nextInt();
        int[]tab1 = new int[n];
        System.out.println("Tablica zostaje wypełniona losowymi liczbami");
        for (int i = 0; i <tab1.length ; i++) {
            tab1[i]= rand.nextInt(100);


        }
        //BUBBLE SORT
        for (int i = 0; i <tab1.length -1 ; i++) {
            for (int j = 0; j <tab1.length -1 -i ; j++) {
                if (tab1[j]> tab1[j+1]){
                    int temp = tab1[j];
                   tab1[j]=tab1[j+1];
         tab1[j+1] = temp;
               }
                
           }
            System.out.println(Arrays.toString(tab1));
            System.out.println("Podaj ilość obiektów w drugiej tablicy");
            int m = sc.nextInt();
            int[]tab2 = new int[m];
            System.out.println("Tablica zostaje wypełniona losowymi liczbami");
            for (int j = 0; j <tab2.length ; j++) {
                tab2[i] = rand.nextInt(100);

            }
            for (int j = 0; j <tab2.length-1 ; j++) {
                for (int k = 0; k <tab2.length-1-i ; k++) {
                    if (tab2[k]>tab2[k+1]){
                        int temp = tab2[k];
                        tab2[k]=tab2[k+1];
                        tab2[k+1]= temp;
                    }
                    
                }
                System.out.println(Arrays.toString(tab2));
                System.out.println("Tworzenie i trzeciej tablicy");
                int[]tab3= new int[n+m];
                for (int k = 0; k <n+m ; k++) {
                    tab3[i]=n+m;

                }
                System.out.println(Arrays.toString(tab3));




                }

            }
            
        }
    }

