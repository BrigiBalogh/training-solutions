package week09d03;

public class Person {



    private String name;
    private int age;
    private Present present;


    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void setPresent(Present present) {
        this.present = present;
    }
}
