package week15d04;

import java.time.LocalDate;

public class Cases {

    private LocalDate date;
    private String week;
    private int cases;
    private int deaths;
    private String country;


    public Cases(LocalDate date, String week, int cases, int deaths, String country) {
        this.date = date;
        this.week = week;
        this.cases = cases;
        this.deaths = deaths;
        this.country = country;
    }


    public LocalDate getDate() {
        return date;
    }

    public String getWeek() {
        return week;
    }

    public int getCases() {
        return cases;
    }

    public int getDeaths() {
        return deaths;
    }

    public String getCountry() {
        return country;
    }
}
