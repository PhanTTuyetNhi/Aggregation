package Aggregation.Ex1;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Date;

public class Processor {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StudentList studentList = new StudentList();
        int choice;
        do {
            System.out.println("0. Exit \n1.Enter Student Information\n2.Display\n3.Find student by ID\n4.Delete by ID\n5.Edit by ID");
            System.out.print("Choose an option:");
            choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 1:
                    System.out.print("Enter number of student:");
                    int n = scanner.nextInt();
                    scanner.nextLine();
                    for (int i = 0; i < n; i++) {
                       Student student = new Student();
                        student.EnterInfor();
                        studentList.add(student);
                    }
                    break;
                case 2:
                    studentList.displayStudent();
                    break;
                case 3:
                    System.out.print("Enter Student ID to find: ");
                    String idToFind = scanner.nextLine();
                    Student foundStudent = studentList.FindStudentID(idToFind);
                    if (foundStudent != null) {
                        foundStudent.display();
                    } else {
                        System.out.println("Student not found.");
                    }
                    break;
                case 4:
                    System.out.print("Enter Student ID to delete: ");
                    String idToDelete = scanner.nextLine();
                    if (studentList.delete(idToDelete)) {
                        System.out.println("Student deleted successfully.");
                    } else {
                        System.out.println("Student not found.");
                    }
                    break;
                case 5:
                    System.out.print("Enter Student ID to edit: ");
                    String idToEdit = scanner.nextLine();
                    studentList.editStudentById(idToEdit);
                    break;
                default:
                    System.out.println("Invalid option, please try again.");
            }
        } while (choice != 0);
    }
}