package kata1v2;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Kata1v2 {

    public static void main(String[] args) {
           Calendar date = GregorianCalendar.getInstance();
           date.set(1991,2,6);
           
           Person person =new Person ("Angeles", date);
           System.out.println(person.getName() + " tiene "+person.getAge()+ " años");
    }
}
