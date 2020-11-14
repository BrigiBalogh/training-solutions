package attributes.attributes.person;

import attributes.person.Address;
import attributes.person.Person;


public class PersonMain {

    public static void main(String[] args) {
        PersonMain personMain = new PersonMain();

        Person person = new Person("john Doe","EJ1115");

        Address address = new Address("USA"," New York"," Flowers road 115.","112530");
        person.moveTo(address);

        System.out.println(person.personToString());
        System.out.println(person.getAddress().addressToString());

        person.correctData("John Doe jr.","AJ1115");
        System.out.println(person.personToString());

        person.getAddress().correctData("USA","New York","Flowers road 100.","111220");
        System.out.println(person.getAddress().addressToString());

        Address newAddress = new Address("Magyarország","Vác","Sugár utca 5.","H-2600");
        person.moveTo(newAddress);

        System.out.println(person.getAddress().addressToString());
    }
}
