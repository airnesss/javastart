package pl.sda.javastart.Polimorfizm;

public class HospitalApp {
    public static void main(String[] args) {
        Hospital hospital = new Hospital();

        hospital.add(new  Doctor("Natalia","Siwiec",2000, 500));
        hospital.add(new Nurse("Janina","Kowalska",1000, 5));
        hospital.add(new Nurse("Halina" ,"Kowalska" , 1200, 10));
        System.out.println("Pracownicy szpitala to: ");
        System.out.println(hospital);
    }

}