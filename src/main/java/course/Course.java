package course;

public class Course {

    private String name;
    private SimpleTime begin;

    public Course(String name, SimpleTime begin) {
        if (name == null) {
            throw new IllegalArgumentException("name is null.");
        }
        if (begin == null) {
            throw new IllegalArgumentException(" Begin is null.");
        }
        this.name = name;
        this.begin = begin;
    }

    public String getName() {
        return name;
    }

    public SimpleTime getBegin() {
        return begin;
    }

    @Override
    public String toString() {
        return this.begin.toString() + ":" + this.name;
    }
}
