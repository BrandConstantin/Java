import java.text.DateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.GregorianCalendar;

public class Main {
    public static void main(String[] args) {
        Date now = new Date();
        System.out.println(now);

        GregorianCalendar gc = new GregorianCalendar(2009, 1, 30);
        Date d1 = gc.getTime();
        System.out.println(d1);

        gc.add(GregorianCalendar.DATE, 4);
        Date d2 = gc.getTime();
        System.out.println(d2);

        DateFormat df = DateFormat.getDateInstance(DateFormat.FULL);
        System.out.println(df.format(d2));

        LocalDateTime ldt = LocalDateTime.now();
        System.out.println(ldt);

        LocalDate ld = LocalDate.of(2010, 11, 15);
        System.out.println(ld);
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("M/d/yyyy");
        System.out.println(dtf.format(ldt));
    }
}
