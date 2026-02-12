import java.time.LocalDate;
import java.util.Scanner;
class DateTask {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter date in format yyyy-MM-dd : ");
        LocalDate d = LocalDate.parse(sc.nextLine());
        LocalDate newDate = d.plusDays(7)
                             .plusMonths(1)
                             .plusYears(2)
                             .minusWeeks(3);
        System.out.println("Date after all changes : " + newDate);
    }
}
