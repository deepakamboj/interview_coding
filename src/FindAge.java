import org.w3c.dom.ls.LSOutput;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class FindAge {
    public static void main(String[] args) {

        LocalDate birthday = LocalDate.of(1984, 9, 24);
        LocalDate today = LocalDate.now();
        long age1 = ChronoUnit.YEARS.between(birthday, today);
        System.out.println(age1);

        //ChronoUnit is an enum in the Date-Time API used to measure time units (DAYS, MONTHS, YEARS, etc.).
        Period age = Period.between(birthday, today);
        System.out.println("You are " + age.getYears() + " years, "
                + age.getMonths() + " months, and "
                + age.getDays() + " days old.");
    }

}
