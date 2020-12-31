package week08d02;

public class Country {

    private String name;
    private int population;
    private int flagColors;
    private int numberOfBorderCountries;

    public Country(String name, int population, int flagColors, int numberOfBorderCountries) {
        this.name = name;
        this.population = population;
        this.flagColors = flagColors;
        this.numberOfBorderCountries = numberOfBorderCountries;
    }

    public String getName() {
        return name;
    }

    public int getPopulation() {
        return population;
    }

    public int getFlagColors() {
        return flagColors;
    }

    public int getNumberOfBorderCountries() {
        return numberOfBorderCountries;
    }
}
