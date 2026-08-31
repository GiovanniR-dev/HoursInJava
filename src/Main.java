import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;
import java.util.TimeZone;

public class Main {
    public static void main(String[] args) throws ParseException {

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

        Date date = Date.from(Instant.parse("2018-06-25T15:42:07Z"));

        System.out.println("Current time: " + sdf.format(date));

        Calendar cal= Calendar.getInstance();
        cal.setTime(date);
        cal.add(Calendar.HOUR_OF_DAY,4);
        date=cal.getTime();
        int minutes=cal.get(Calendar.MINUTE);
        int month=1+cal.get(Calendar.MONTH);

        System.out.println(minutes);
        System.out.println(month);

    }
}