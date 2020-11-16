package enumtype.week;

public enum Day {

    MONDAY(DayTipe.WORKDAY ),
    TUESDAY(DayTipe.WORKDAY ),
    WEDNESDAY(DayTipe.WORKDAY ),
    THURSDAY(DayTipe.WORKDAY ),
    FRIDAY(DayTipe.WORKDAY ),
    SATURDAY(DayTipe.HOLIDAY),
    SUNDAY(DayTipe.HOLIDAY);

    private final DayTipe dayTipe;

    Day(DayTipe dayTipe) {
        this.dayTipe = dayTipe;
    }

    public DayTipe getDayTipe() {
        return dayTipe;
    }
}
