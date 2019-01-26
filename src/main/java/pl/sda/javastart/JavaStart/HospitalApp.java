package pl.sda.javastart.JavaStart;

import java.util.Scanner;

public class HospitalApp {
    public static void main(String[] args) {
        final int exit = 0;
        final int addPatient = 1;
        final int printPatients;
        Scanner sc = new Scanner(System.in);
        int option = -1;

        Hospital hospital = new Hospital();
        while (option != exit){
            System.out.println("Dostępne opcje: ");
            System.out.println("0 - wyjście z programu");
            System.out.println("1 - dodaj pacjenta");
            System.out.println("2 - wyświetlanie listy pacjentów");

            System.out.println("wybierz opcje:");
            option=sc.nextInt();
            sc.nextLine();

            switch (option){
                case addPatient:
                    Patient patient =new Patient("Marcin","Kierzkowski", 982928);
                    System.out.println("Imię");
                    patient.setFirstName(sc.nextLine());
                    System.out.println("Nazwisko");
                    patient.setLastName(sc.nextLine());
                    System.out.println("Pesel");
                    patient.setPesel(sc.nextInt());
                    hospital.addPatients(patient);
                    break;
                case exit:
                    System.out.println("Zamykam program");
                    break;
                    default:
                        System.out.println("Nie znaleziono takiej opcji");

            }
            sc.close();
        }
    }
}
