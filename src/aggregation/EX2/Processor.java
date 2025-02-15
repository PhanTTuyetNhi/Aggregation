/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aggregation.EX2;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Processor {

    public static void main(String[] args) {
        int choice;
        Scanner scanner = new Scanner(System.in);

        AnimalList animalList = new AnimalList();

        do {
            System.out.println("0. Display\n1. Add Dog\n2. Add Cat\n3. Exit");
            System.out.print("Choose an option: ");
            choice = scanner.nextInt();
            scanner.nextLine(); 

            switch (choice) {
                case 1:
                    System.out.print("Enter ID: ");
                    String ID = scanner.nextLine();

                    System.out.print("Enter Source: ");
                    String S = scanner.nextLine();

                    System.out.print("Enter Date of Birth (dd/MM/yyyy): ");
                    String dateOfBirthString = scanner.nextLine();
                    Date dateOfBirth = null;
                    try {
                        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
                        dateOfBirth = sdf.parse(dateOfBirthString);
                    } catch (ParseException e) {
                        System.out.println("Invalid date format.");
                    }

                    System.out.print("Enter Color: ");
                    String Color = scanner.nextLine();
                    System.out.print("Enter Breed: ");
                    String breed = scanner.nextLine();
                    Dog dog = new Dog(ID, S, dateOfBirth, Color, breed);
                    animalList.add(dog);
                    break;

                case 2:
                    System.out.print("Enter ID: ");
                    String IDCat = scanner.nextLine();

                    System.out.print("Enter Source: ");
                    String SCat = scanner.nextLine();

                    System.out.print("Enter Date of Birth (dd/MM/yyyy): ");
                    String dateOfBirthCatString = scanner.nextLine();

                    Date dateOfBirthCat = null;
                    try {
                        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
                        dateOfBirthCat = sdf.parse(dateOfBirthCatString);
                    } catch (ParseException e) {
                        System.out.println("Invalid date format.");
                    }

                    System.out.print("Enter Color: ");
                    String ColorCat = scanner.nextLine();
                    Cat cat = new Cat(IDCat, SCat, dateOfBirthCat, ColorCat);
                    animalList.add(cat);

                    break;

                case 0:
                    animalList.displayAll();
                    break;

                default:
                    System.out.println("Invalid option. Please try again.");
            }
        } while (choice != 3);

        scanner.close();
    }
}
