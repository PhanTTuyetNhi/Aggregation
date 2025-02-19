
package Ex4;
import java.util.Scanner;
public class processor {
public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PersonList personList = new PersonList();
        int choice;
        do {
            System.out.println("0. Display\n1. Add Student\n2. Add Teacher\n3. delete=id\n4.edit\n5. Exit");
            System.out.print("Choose an option: ");
            choice = scanner.nextInt();
            scanner.nextLine(); 

            switch (choice) {
                case 1:
                    Student student = new Student();
                    student.addInfor();
                    personList.add(student);
                    break;

                case 2:
                    Teacher teacher = new Teacher();
                    teacher.addInfor();
                    personList.add(teacher);
                    break;

                case 0:
                    personList.display();
                        
                    break;
                case 3:
                    System.out.println("Enter ID want delete:");
                    String Delete = scanner.nextLine();
                    personList.delete(Delete);
                    if (personList.delete(Delete)) {
                        System.out.println("Student deleted successfully.");
                    } else {
                        System.out.println("Student not found.");
                    }
                    break;
                case 4:
                    System.out.print("Enter ID to edit: ");
                    String Edit = scanner.nextLine();
                    personList.edit(Edit);
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        } while (choice != 5);

        }
    }