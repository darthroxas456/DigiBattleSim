import java.util.Scanner;
public class Polymorphism_HERE {
  
    public static void do9() {
      System.out.println("Module 10");
      Cat CoCo = new Cat();
      Dog Bella = new Dog();
      Animal[] myPets = { CoCo, Bella }; // this is polymorphism
      for (Animal anAnimal : myPets) {
        System.out.println(anAnimal.showSpecies());
        anAnimal.makeSound();
      }
    }
  }

  class Animal {

    protected String species;

    public String showSpecies() {
      return "Animal";
    }

    public void makeSound() {
      System.out.println("Grrrrrrr");
    }
  }

  class Dog extends Animal {

    public Dog() {
      species = "Shih tzu";  // this demonstrates inheritance
    }

    public String showSpecies() {
      return "Dog";
    }

    public void makeSound() {
      System.out.println("Bark!! Bark!!");
    }

  }

  class Cat extends Animal {

    public Cat() {
      species = "Feline";
    }

    public String showSpecies() {
      return species;
    }

    public void makeSound() {
      System.out.println("ROAR!!");
    }
  }
}
