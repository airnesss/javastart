package pl.sda.javastart.Petle;

public class Hospital {

    private final int maxPatientNumbers = 10;
    private Patient[] patients = new Patient[maxPatientNumbers];
    private int regPatients = 0;

    public void addPatient(Patient patient){
        if (regPatients < maxPatientNumbers){
            patients[regPatients] = patient;
            regPatients++;
        }else {
            System.out.println("zarejestrowano maksymalną liczbę pacjentów");
        }


    }
    public void printPatient(){
        for (int i = 0; i < regPatients; i++) {
            System.out.println(patients[i].getFirstName() + patients[i].lastName + patients[i].getAge());

        }


    }

}
