package Ex3;
import java.text.ParseException;
import java.util.Scanner;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
public class PersonList {

    ArrayList<Person> people = new ArrayList<>();

    public void add(Person p) {
        people.add(p);
    }
    public boolean delete(String Delete){
        return people.removeIf(person -> person.ID.equals(Delete));
    }
    public void edit(String Edit) {
        Scanner scanner=new Scanner(System.in);
        for(Person i:people){
            if (i.ID.equals(Edit)) {
                i.editPerson();
            }
        }
    }
    public void display() {
        for (Person person : people) {
            person.display();
        }
        
}}
