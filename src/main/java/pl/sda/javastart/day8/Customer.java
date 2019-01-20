package pl.sda.javastart.day8;

import java.math.BigDecimal;

public class Customer {

    private Integer id;
    private final String firstname;
    private final String surname;
    private final Integer Year;
    private final BigDecimal salary;

    private static Integer counter = 1;

    {
        id = counter++;
        System.out.println("Blok Inicjalziujacy");
    }


    public Customer(String firstname, String surname, Integer year, Integer salary) {

        this.firstname = firstname;
        this.surname = surname;
        this.Year = year;
        this.salary = BigDecimal.valueOf(Integer.valueOf(salary));           //string na bigdecimal
    }

    public Customer(String imie, String nazwisko, Integer year, String salary) {
        this.firstname = imie;
        this.surname = nazwisko;
        this.Year = year;
        this.salary = BigDecimal.valueOf(Integer.valueOf(salary));
        System.out.println("konstruktor");

    }

    public Integer getId() {
        return id;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getSurname() {
        return surname;
    }

    public Integer getYear() {
        return Year;
    }

    public BigDecimal getSalary() {
        return salary;
    }

    public static Integer getCounter() {
        return counter;
    }
}
