import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
class TimeCheck {
    public static void main(String[] args) {
        DateTimeFormatter df = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss z");
        ZonedDateTime t1 = ZonedDateTime.now(ZoneId.of("GMT"));
        ZonedDateTime t2 = ZonedDateTime.now(ZoneId.of("Asia/Kolkata"));
        ZonedDateTime t3 = ZonedDateTime.now(ZoneId.of("America/Los_Angeles"));
        System.out.println("Time in GMT is : " + t1.format(df));
        System.out.println("Time in India is : " + t2.format(df));
        System.out.println("Time in America is : " + t3.format(df));
    }
}
