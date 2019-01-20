package pl.sda.javastart.Various;

public class ComputerStore {
    public static void main(String[] args) {
       // Computer comp1 = new Computer();
        //comp1.procesor = "Intel i5";
        //comp1.memory = 8192;

        //Computer comp2 = new Computer();
        //comp2.procesor = "AMD Ryzen 1700";
        //comp2.memory = 16554;

        //comp1.printInfo();
        //comp2.printInfo();
        //ComputerFactory factory = new ComputerFactory();
        //Computer comp1 = factory.create("Intel i7",512);
        //comp1.printInfo();                                                           // FIXME CZEMU NULL ?!
        Computer comp1 = new Computer("AMD DURON", 512);
        comp1.printInfo();
        System.out.println("klient chce dodać jeszcze 4GB ram");
        ComputerUpgarde upgarde = new ComputerUpgarde();
        upgarde.adMemory(comp1, 4065);
        comp1.printInfo();
    }
}
