package references.parameters;

public class ReferencesMain {

    public static void main(String[] args) {
        Person person = new Person("Kiss Virág",35);
        Person otherPerson = person;

        otherPerson.setName("Kiss Anna");

        System.out.println(person.getName()+" "+person.getAge());
        System.out.println(otherPerson.getName()+" "+otherPerson.getAge());

        int number1 = 24;
        int number2 = number1;

        number2++;

        System.out.println(number1);
        System.out.println(number2);

        otherPerson =new Person("Kiss József",50);
        System.out.println(person.getName()+" "+person.getAge());
        System.out.println(otherPerson.getName()+" "+otherPerson.getAge());
    }
}
