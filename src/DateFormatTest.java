import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class DateFormatTest {
    static String sdate = "Tue Feb 01 09:48:42 IST 2022";
//Wed Oct 19 15:59:21 IST 2022
    public static void main (String args[]) throws ParseException {
        DateFormat df = new SimpleDateFormat("EEE MMM dd hh:mm:ss zzz yyyy");

        System.out.println(df.parse(sdate));
    }

}
