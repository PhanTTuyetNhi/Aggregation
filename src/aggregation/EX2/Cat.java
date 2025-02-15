
package aggregation.EX2;
import java.util.Date;
 class Cat extends Animal {
     String Color;
     
    public Cat(String ID,String Source,Date DOB,String Color){
        super(ID,Source,DOB,Color);
    }
    public void makeSound(){
        System.out.println("Meow Meow!");
    }
}
