import java.time.LocalDate;

public class DateUtils {
    public static boolean isNowBetween(LocalDate startingDate, LocalDate endingDate) {
        return isDateBetween(startingDate, endingDate, LocalDate.now(), true);
    }

    protected static boolean isDateBetween(LocalDate startingDate, LocalDate endingDate, LocalDate
            now, boolean inclusive) {
        LocalDate startingDay; // sera le paramètre startingDate ou le lendemain du paramètre
        LocalDate endingDay; // sera le paramètre endingDate ou le la veille du paramètre
        if (inclusive) {
            startingDay = startingDate.minusDays(1); // la veille
            endingDay = startingDate.plusDays(1); // le lendemain
        }
        else {
            startingDay = startingDate;
            endingDay = startingDate;
        }
        return now.isAfter(startingDay)
                &&
                now.isBefore(endingDay);
         /* Pour info :
         * date1.isBefore(date1) retourne FAUX // Before strict
         * date1.isAfter(date1) retourne FAUX // After strict
         * Donc, pour que l'évaluation soit inclusive,
         * il faut calculer After(laVeille du paramètre staringDate) et Before(le lendemain du
        paramètre endingDate) */
    }

    private static boolean isDateOutsider(LocalDate date, LocalDate startingDate, LocalDate
            endingDate) {
        return !isDateBetween(date, startingDate, endingDate, true);
    }
}