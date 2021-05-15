package lambdaintro;

import java.time.LocalDate;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAccessor;
import java.util.Arrays;
import java.util.List;

public class FamilyBirthdays {

    private List<LocalDate> birthdays;

    public FamilyBirthdays(LocalDate... birthdays) {

        this.birthdays = Arrays.asList(birthdays);
    }



    public boolean isFamilyBirthday(TemporalAccessor temporalAccessor) {
        int month = temporalAccessor.get(ChronoField.MONTH_OF_YEAR);
        int day = temporalAccessor.get(ChronoField.DAY_OF_MONTH);

        for (LocalDate birthday : birthdays) {
            if (birthday.get(ChronoField.MONTH_OF_YEAR) == month &&
                    birthday.get(ChronoField.DAY_OF_MONTH) == day) {
                return true;
            }
        }
        return false;
    }

    public int nextFamilyBirthDay(TemporalAccessor temporalAccessor) {
        int year = temporalAccessor.get(ChronoField.YEAR);
        LocalDate baseDate = LocalDate.of(year, temporalAccessor.get(ChronoField.MONTH_OF_YEAR),
                temporalAccessor.get(ChronoField.DAY_OF_MONTH));

        int min = Integer.MAX_VALUE;

        for (LocalDate birthday : birthdays) {
            LocalDate nextBirthday = birthday.withYear(year);
            if (nextBirthday.isBefore(baseDate)) {
                nextBirthday = birthday.withYear(year + 1);
            }
            int diff = (int) ChronoUnit.DAYS.between(baseDate,nextBirthday);
            if(min > diff) {
                min = diff;
            }
        }
        return min;

    }
}
