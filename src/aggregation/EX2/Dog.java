
package aggregation.EX2;
import java.util.Date;
 class Dog extends Animal {
     String Breed;
     
    public Dog(String ID,String Source,Date DOB,String Color,String breed){
        super(ID,Source,DOB,Color);
        this.Breed=breed;
    }
     @Override
    public void makeSound(){
        System.out.println("Wood Wood");
    }
}
