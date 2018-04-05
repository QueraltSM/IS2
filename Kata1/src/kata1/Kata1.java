package kata1;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class Kata1 {
    public static void main(String[] args) {
        Calendar date = GregorianCalendar.getInstance();
        date.set(1997, 4, 2);
                
        Person person = new Person("Queralt",date);
        System.out.print(person.getName() + " has " + person.getAge() 
                + " years.");
    } 
}
