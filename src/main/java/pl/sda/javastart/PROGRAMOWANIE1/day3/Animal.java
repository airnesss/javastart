package pl.sda.javastart.PROGRAMOWANIE1.day3;

import java.util.List;
import java.util.Objects;

public class Animal {

    private String name;

    private List<Food> favoritefood;

    public Animal(String name, String owner, List<Food> favoritefood) {
        this.name = name;
        this.favoritefood = favoritefood;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }




    public List<Food> getFavoritefood() {
        return favoritefood;
    }

    public void setFavoritefood(List<Food> favoritefood) {
        this.favoritefood = favoritefood;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animal animal = (Animal) o;
        return name.equals(animal.name) &&
                favoritefood.equals(animal.favoritefood);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
