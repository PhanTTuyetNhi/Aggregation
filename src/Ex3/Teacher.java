
package Ex3;
import java.util.Date;
import java.util.Scanner;
public class Teacher extends Person {
    String department;
    Scanner scanner=new Scanner(System.in);
    public Teacher(){}
    public Teacher(String ID, String HomeTown, Date dateOfBirth, String department) {
        super(ID, HomeTown, dateOfBirth);
        this.department=department;
    }
    @Override
    public void addInfor(){
        super.addInfor();
    }
    @Override
    public void display(){
        super.display();
        System.out.println("Department:"+department);
        
    }
    @Override
    public boolean editPerson() {
        super.editPerson();
        System.out.println("Department:");
        department=scanner.nextLine();
        return true;
    }
}
