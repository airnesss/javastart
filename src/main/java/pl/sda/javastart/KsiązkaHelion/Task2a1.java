package pl.sda.javastart.KsiązkaHelion;

import java.io.BufferedReader;
import java.util.Scanner;

public class Task2a1 {
    //program sprawdza dla trzech boków trójkąta a,bi c wprowadzanych z klawiatury czy tworzą trójkat prostokątny
    public static void main(String[] args) {
        int a;
        int b;
        int c;
        Scanner sc = new Scanner(System.in);
        System.out.println("Podaj bok a");
        a = sc.nextInt();
        System.out.println("Podaj bok b");
        b = sc.nextInt();
        System.out.println("podaj bok c");
        c = sc.nextInt();
        if ((a*a + b*b)==c*c){
            System.out.println("boki");
            System.out.println("a= " + a);
            System.out.println("b " + b);
            System.out.println("c " + c);
            System.out.println("tworzą trójkat prostokątny");
        }else {
            System.out.println("boki");
            System.out.println("a " + a);
            System.out.println("b " + b);
            System.out.println("c " + c);
            System.out.println("nie tworzą trójkota prostokątnego");
        }

    }
}
