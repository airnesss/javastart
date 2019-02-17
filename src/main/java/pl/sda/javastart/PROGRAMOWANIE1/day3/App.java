package pl.sda.javastart.PROGRAMOWANIE1.day3;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class App {
    private final static Random RANDOM = new Random();

    private List<Person> p = new ArrayList<>();
    private List<Food> f = new ArrayList<>();

    public void start() {
        populareFood(50);

        for (int i = 0; i < 5; i++) {
            List<Food>availibleFoods = buyFoods();
            Person person = new Person("293844" + i, null, null);
            p.add(person);

        }




    }

    public List<Food>buyFoods(){
        List<Food>foods = new ArrayList<>();
       int size = RANDOM.nextInt(5);
        for (int i = 0; i <size ; i++) {
           int no = RANDOM.nextInt(f.size());
           Food food = f.get(no);
           foods.add(food);

        }
        return foods;
    }



    public void populareFood(int size) {
        for (int i = 0; i < size; i++) {
            Food food = new Food("Food" + i);
            f.add(food);

        }

    }




}
