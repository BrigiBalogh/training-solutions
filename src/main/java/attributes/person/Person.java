package attributes.person;

public class Person {

    private String name;

    private String identificationCard;

    private Address address;

    public Person(String name,String identificationCard) {
        this.identificationCard = identificationCard;
        this.name =name;
    }

    public void correctData(String name, String identificationCard ) {
        this.name =name;
        this.identificationCard=identificationCard;
    }

    public void moveTo(Address address) {
        this.address =address;
    }

    public String getIdentificationCard() {
        return identificationCard;
    }

    public String getName() {
        return name;
    }

    public Address getAddress() {
        return address;
    }

    public String personToString() {
        return getName() + ","+ getIdentificationCard();
    }
}


