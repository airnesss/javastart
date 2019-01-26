package pl.sda.javastart.Polimorfizm;

public class ZOO {
    public static void main(String[] args) {
          Animal dog = new Dog("Burek");
         Animal cat = new Cat("Mruczek");
        // Animal doge = new Animal("Kotopies");
        ((Dog) dog).bark();             //rzutowanie
        ((Cat) cat).meow();

        //dog.giveSound();
        //cat.giveSound();
        //doge.giveSound();
      //  Animal[]animals = new Animal[3];
       // animals[0] = new Dog(" Burek");
       // animals[1] = new Cat("Mruszek");
       // animals[2] = new Animal("Kotopies");

//        changeAnimalName(animals[0], "Pieseł");

  //      for (Animal animal : animals) {
    //        animal.giveSound();
            
      //  }


    //}
   // private static void changeAnimalName(Animal animal, String newName){
     //   animal.setName(newName);
    }
}
