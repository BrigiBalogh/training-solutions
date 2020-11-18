package introexception.patient;

public class Patient {

    public static final int MIN_YEAR = 1900;

    private String name;
    private String socialSecurityNumber;
    private int yearOfBirth;

    public String getName() {
        return name;
    }

    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public Patient(String name, String ssn, int yearOfBirth) {
        this.name = name;
        this.socialSecurityNumber = socialSecurityNumber =ssn;
        this.yearOfBirth = yearOfBirth;

        if (name==null || name.isEmpty()) {
            throw new IllegalArgumentException( "Name must not be empty");
        }
        if (yearOfBirth<=MIN_YEAR) {
            throw new IllegalArgumentException("Invalid year of Birth:"+ yearOfBirth);
        }
        if (! new SsnValidator().isValidSsn(ssn))
            throw new IllegalArgumentException("Invalid Social Security Number:"+ssn);
    }
}
