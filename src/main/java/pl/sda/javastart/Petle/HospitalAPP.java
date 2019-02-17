package pl.sda.javastart.Petle;

import java.util.Scanner;

public class HospitalAPP {
    public static void main(String[] args) {
        final int exit = 0;
        final int addPatient = 1;
        final int printPatient = 2;
        Scanner sc = new Scanner(System.in);
        int option = -1;

        Hospital hospital = new Hospital();

        while (option != exit) {
            System.out.println("Dostępne opcje");
            System.out.println("0 - wyjście z programu");
            System.out.println("1 - dodaj pacjenta");
            System.out.println("2 wyświetl lite pacjentów");

            System.out.println("wybierz opcje");
            option = sc.nextInt();
            sc.nextLine();

            switch (option) {
                case addPatient:
                    Patient patient = new Patient();
                    System.out.println("Imię");
                    patient.setFirstName(sc.nextLine());
                    System.out.println("Nazwisko");
                    patient.setLastName(sc.nextLine());
                    System.out.println("Wiek");
                    patient.setAge(sc.nextInt());
                    hospital.addPatient(patient);
                    break;
                case printPatient:
                    hospital.printPatient();
                    break;
                case exit:
                    System.out.println("zamykam program");
                    default:
                        System.out.println("nie znaleziono takiej opcji");

            }
            sc.close();
        }
    }
}
