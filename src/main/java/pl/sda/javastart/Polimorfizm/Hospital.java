package pl.sda.javastart.Polimorfizm;

public class Hospital {
   // Hospital - przechowuje informacje o pracownikach szpitala w tablicy typu Person[]. Powinna istnieć metoda add()
   // pozwalająca dodać nowego pracownika do tablicy pracowników
    private static int MAX_EMPLOYES = 3;
    private Person[]employees = new Person[MAX_EMPLOYES];
    private int employessNumber;             // tymczasowa zmienna o aktualnej liczbie pracowników

    public Person[] getEmployees() {
        return employees;
    }

    public void setEmployees(Person[] employees) {
        this.employees = employees;
    }

    public int getEmployessNumber() {
        return employessNumber;
    }

    public void setEmployessNumber(int employessNumber) {
        this.employessNumber = employessNumber;
    }
    public void add(Person person){
        if (getEmployessNumber()<MAX_EMPLOYES){
            getEmployees()[getEmployessNumber()]= person;
            setEmployessNumber(getEmployessNumber()+1);
        }

    }

    @Override
    public String toString() {
        String result = "";
        for (int i = 0; i <employessNumber ; i++) {
            result = result + employees[i] + "\n";

        }
        return result;
    }
}
