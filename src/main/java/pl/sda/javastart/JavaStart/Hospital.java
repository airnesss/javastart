package pl.sda.javastart.JavaStart;

public class Hospital {
    private final int maxPatientNum = 10;
    private Patient[] patients = new Patient[maxPatientNum];
    private int registeredPatients = 0;

    public void addPatients(Patient patient) {
        if (registeredPatients < maxPatientNum) {
            patients[registeredPatients] = patient;
            registeredPatients++;

        } else {
            System.out.println("Zarejestrowano maksymalną ilość pacjentów");
        }
    }

    public void printPatients() {

        for (int i = 0; i < registeredPatients; i++) {
            System.out.println(patients[i].getFirstName() + patients[i].getLastName() + patients[i].getPesel());

        }
    }
}
