package pl.sda.javastart.day5;

import java.util.Objects;

public class TestPerson {
    
    private String surname;
    private String firstName;
    private int identity;
    static int counter;

    static {
        counter = 1;                      // BLOK STATYCZNY |counter przeniesiony z linijki wyżej ( dwie opcje dozwolone )
    }

    {
        System.out.println("Blok Inicjalizujacy");
        this.identity = counter++;              //BLOK INICJALIZUCJACY bo ktos np zapomniał dodac PESEL

    }


    public TestPerson() {
        //KONSTRUKTOR

    }

    public TestPerson(String surname, String firstName, int identity) {
        this(surname,firstName);
        this.identity = identity;
    }

    public TestPerson(String surname, String firstName) {
        this.surname = surname;
        this.firstName = firstName;
    }


    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public int getIdentity() {
        return identity;
    }

    public void setIdentity(int identity) {
        this.identity = identity;

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TestPerson person = (TestPerson) o;
        return identity == person.identity;
    }

    @Override
    public int hashCode() {
        return Objects.hash(identity);
    }
}
