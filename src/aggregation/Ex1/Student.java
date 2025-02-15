package Aggregation.Ex1;
import java.text.ParseException;
import java.util.Scanner;
import java.util.Date;
import java.text.SimpleDateFormat;

public class Student {

    String StudentID;
    String FullName;
    Date dateofBirth;
    String Major;
    float gpa;

    public Student(){}
    public Student(String StudentID, String FullName, Date dateofBirth, String Major, float gpa) {
        this.StudentID = StudentID;
        this.FullName = FullName;
        this.dateofBirth = dateofBirth;
        this.Major = Major;
        this.gpa = gpa;
    }

    public void EnterInfor() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Student ID: ");
        StudentID = scanner.nextLine();
        System.out.print("Enter Full Name: ");
        FullName = scanner.nextLine();
        System.out.print("Enter Date of Birth (dd/MM/yyyy): ");
        String dateOfBirthString = scanner.nextLine();
        try {
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
            dateofBirth = sdf.parse(dateOfBirthString);
        } catch (ParseException e) {
            System.out.println("Invalid.");
        }
        System.out.print("Enter Major: ");
        Major = scanner.nextLine();
        System.out.print("Enter GPA: ");
        gpa = scanner.nextFloat();
        scanner.nextLine();
    }

    public void editStudentById(String idToEdit) {
        if (this.StudentID.equals(idToEdit)) {
            EnterInfor();
        } else {
            System.out.println("N/A");
        }
    }

    public void display() {
        System.out.println("ID:" + StudentID + "\nName:" + FullName + "\nMajor:" + Major + "\nGPA:" + gpa);
    }
}
