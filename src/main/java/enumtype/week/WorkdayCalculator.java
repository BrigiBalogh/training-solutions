package enumtype.week;

import java.util.ArrayList;
import java.util.List;

public class WorkdayCalculator {

    private Day nextDay(Day day) {
        if (day.ordinal() == Day.values().length -1) {
            return Day.values()[0];
        } else {
            return Day.values()[day.ordinal() +1];
        }
    }

    public List<DayTipe > dayTipes(Day firstday, int numberOfDays) {
        List<DayTipe > types = new ArrayList<>();
        Day d = firstday ;
        for (int i = 0; i < numberOfDays; i++) {
            types.add(d.getDayTipe());
            d = nextDay(d);
        }
        return types;
    }
}
