package functional;

public class Student {
    private String name;
    private int birthYear;
    private double average;

    public Student(String name, int birthYear, double average) {
        this.name = name;
        this.birthYear = birthYear;
        this.average = average;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }

    public double getAverage() {
        return average;
    }

    public void setAverage(double average) {
        this.average = average;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", birthYear=" + birthYear +
                ", average=" + average +
                '}';
    }
}
