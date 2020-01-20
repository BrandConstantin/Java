package calendarFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
/**
 *
 * @author BrandConstantin
 */
public class CalendarFormat {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Calendar cal = Calendar.getInstance();
        cal.add(Calendar.DATE, 1);
        System.out.println(cal.getTime());
        
        SimpleDateFormat newFormat = new SimpleDateFormat("yyyy-MM-dd");
        String formatted = newFormat.format(cal.getTime());
        System.out.println(formatted);
    }
    
}
