
package aggregation.EX2;

import java.util.ArrayList;

public class AnimalList {

    ArrayList<Animal> animals = new ArrayList<>();

//    public AnimalList() {
//        animals = new ArrayList<>();
//    }

    public void add(Animal animal) {
        animals.add(animal);
    }

    public void displayAll() {
        for (Animal animal : animals) {
            if (animal instanceof Dog) {
                System.out.println("Dog: " + animal);
            } else if (animal instanceof Cat) {
                System.out.println("Cat: " + animal);
            } else {
                System.out.println("Unknown animal: " + animal);
            }
        }
        for (Animal animal : animals) {
            animal.display();
            animal.makeSound();
        }
    }
}