import java.time.LocalDate;

public class esercizioDate {
    public static void main(String[] args) {
        LocalDate localDate = LocalDate.now();

        int daysOfMonth = localDate.lengthOfMonth();
        int daysUntilEndOfMonth = daysOfMonth - localDate.getDayOfMonth();
        int daysOfYear = localDate.lengthOfYear();
        int daysUntilEndOfYear = daysOfYear - localDate.getDayOfYear();

        System.out.println("There are " + daysUntilEndOfMonth + " days left until the end of the month");
        System.out.println("There are " + daysUntilEndOfYear + " days until the end of the year");
    }
}