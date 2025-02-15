
package aggregation.EX2;

import java.util.ArrayList;

public class AnimalList {

    ArrayList<Animal> animals = new ArrayList<>();

    public AnimalList() {
        animals = new ArrayList<>();
    }

    public void add(Animal animal) {
        animals.add(animal);
    }

    public void displayAll() {
        for (Animal animal : animals) {
            System.out.println("ID: " + animal.ID + ", Source: " + animal.Source + 
                               ", Date of Birth: " + animal.DOB + 
                               ", Color: " + animal.Color);
            animal.makeSound();
        }
    }
}