
package aggregation.EX2;
import java.util.Date;
public class Animal {
String ID;
String Source;
Date DOB;
String Color;
    public Animal(String ID,String Source,Date DOB,String Color){
    this.ID=ID;
    this.Source=Source;
    this.DOB=DOB;
    this.Color=Color;
}
    public void makeSound(){
        }
    public void display(){
        System.out.println("ID:"+ID);
        System.out.println("Source:"+Source);
        System.out.println("Date Of Birth:"+DOB);
        System.out.println("Color:"+Color);
    }
}
