package kata1;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class Person {
    private final String name;
    private final Calendar birthday;
    private final long MILLISECONDS_PER_YEAR = (long)(365.25*24*60*60*1000);
    
    public Person(String name, Calendar birthday) {
        this.name = name;
        this.birthday = birthday;
    }

    public String getName() {
        return name;
    }

    public Calendar getBirthdate() {
        return birthday;
    }
    
    public int getAge() {
        Calendar today = GregorianCalendar.getInstance();
        return(int)(milliSecondsToYear(today.getTimeInMillis()
                -birthday.getTimeInMillis()));
    }
    
    private long milliSecondsToYear(long milles) {
        return milles/MILLISECONDS_PER_YEAR;
    }
}