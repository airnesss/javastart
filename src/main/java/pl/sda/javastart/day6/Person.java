package pl.sda.javastart.day6;

import java.math.BigDecimal;
import java.util.Objects;

public abstract class Person implements Comparable<Person> {

    private String firstName;                                //to są pola !!
    private String lastName;
    private Integer identity;                   //int ma domyslnie wartosc zero a INTEGER ma null ( wiec jest fajniejszy i mozemy na nim wywoływac metody)
    private Integer age;

    public Person(String firstName, String lastName, Integer identity, Integer age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.identity = identity;
        this.age = age;
    }
    protected  void introduction(){
        System.out.println("Jestem człowiekiem");
    }

    public abstract BigDecimal showMeIncome();

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Integer getIdentity() {
        return identity;
    }

    public void setIdentity(Integer identity) {
        this.identity = identity;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +                     //DZIEn 7
                ", lastName='" + lastName + '\'' +
                ", identity=" + identity +
                ", age=" + age +
                '}';
    }

    @Override
    public int compareTo(Person o) {
        return this.identity.compareTo(o.getIdentity());

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(identity, person.identity);
    }

    @Override
    public int hashCode() {
        return Objects.hash(identity);
    }
}

