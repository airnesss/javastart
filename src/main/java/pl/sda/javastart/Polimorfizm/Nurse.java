package pl.sda.javastart.Polimorfizm;

public class Nurse extends Person{

    private double overTime;

    public Nurse(String firstName, String lastName, double salary, double overTime) {
        super(firstName, lastName, salary);
        this.overTime = overTime;
    }

    @Override
    public String toString() {
        return super.toString() + " nadgodziny: " + overTime;
    }
}
