
package Ex4;
import java.text.ParseException;
import java.util.Scanner;
import java.util.Date;
import java.text.SimpleDateFormat;
public class Person {
   String ID;
   String HomeTown;
   Date dateOfBirth;
   Scanner scanner = new Scanner(System.in);
   public Person(){}
   public Person(String ID,String HomeTown,Date dateOfBirth){
       this.ID=ID;
       this.HomeTown=HomeTown;
       this.dateOfBirth=dateOfBirth;
   }
   public void addInfor() {
        
        System.out.print("Enter ID: ");
        ID = scanner.nextLine();
        System.out.print("Enter hometown: ");
         HomeTown= scanner.nextLine();
        System.out.print("Enter Date of Birth (dd/MM/yyyy): ");
        String dateOfBirthString = scanner.nextLine();
        try {
           SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
            dateOfBirth = sdf.parse(dateOfBirthString);
        } catch (ParseException e) {
            System.out.println("Invalid.");
        }
        scanner.nextLine();
    }
   public void display(){
       System.out.println("ID:"+ID);
       System.out.println("HomeTown:"+HomeTown);
       System.out.println("Date Of Birth:"+dateOfBirth);
   }
       public boolean editPerson() {
           System.out.print("Enter hometown: ");
         HomeTown= scanner.nextLine();
        System.out.print("Enter Date of Birth (dd/MM/yyyy): ");
        String dateOfBirthString = scanner.nextLine();
        try {
           SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
            dateOfBirth = sdf.parse(dateOfBirthString);
            return true;
        } catch (ParseException e) {
            System.out.println("Invalid.");
            return false;
        }        
    }
   }