
package Ex3;

import java.util.Date;

public class Student extends Person {
    String major;
public Student(){
}
    public Student(String ID, String HomeTown, Date dateOfBirth, String major) {
        super(ID, HomeTown, dateOfBirth);
                this.major=major;
    }

    @Override
    public void addInfor(){
       super.addInfor();
        System.out.println("Enter Major:");
        major=scanner.nextLine();
    }
    @Override
    public void display(){
        super.display();
        System.out.println("Major:"+major);
        
    }
    public boolean editPerson() {
       super.editPerson();
        System.out.println("Major:");
        major=scanner.nextLine();
        return true;
    }
    
}
