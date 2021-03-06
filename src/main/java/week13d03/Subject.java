package week13d03;

public class Subject {

    private String name;
    private String subject;
    private String className;
    private int numberOfLessons;

    public Subject(String name, String subject, String className, int numberOfLessons) {
        this.name = name;
        this.subject = subject;
        this.className = className;
        this.numberOfLessons = numberOfLessons;
    }

    public String getName() {
        return name;
    }

    public String getSubject() {
        return subject;
    }

    public String getClassName() {
        return className;
    }

    public int getNumberOfLessons() {
        return numberOfLessons;
    }
}
