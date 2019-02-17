package pl.sda.javastart.PROGRAMOWANIE1.day3;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Person {


    private String pesel;
    private List<Food>availibleFood;
    private List<Animal>animals;

    public Person(String pesel, List<Food> availibleFood, List<Animal> animals) {
        this.pesel = pesel;
        this.availibleFood = availibleFood;
        this.animals = animals;
    }

    public String getPesel() {
        return pesel;
    }

    public void setPesel(String pesel) {
        this.pesel = pesel;
    }

    public List<Food> getAvailibleFood() {
        return availibleFood;
    }

    public void setAvailibleFood(List<Food> availibleFood) {
        this.availibleFood = availibleFood;
    }

    public List<Animal> getAnimals() {
        return animals;
    }

    public void setAnimals(List<Animal> animals) {
        this.animals = animals;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return pesel.equals(person.pesel) &&
                availibleFood.equals(person.availibleFood) &&
                animals.equals(person.animals);
    }

    @Override
    public int hashCode() {
        return Objects.hash(pesel);
    }
}
