package pl.sda.javastart.Various;

public class Computer {
    String procesor;
    int memory;
    Computer(String proc, int mem){
        procesor = proc;                   // KONSTRUKTOR
        memory = mem;
    }


    void printInfo() {
        System.out.println(procesor + " " + memory );
        System.out.println();
    }
}
