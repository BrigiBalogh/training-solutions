package week05d05;

public class User {

    private String firstName;
    private String lastName;
    private String email;

    public User(String firstName, String lastName, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        int occurred = email.indexOf("@");
        if (!email.contains("@") || !email.substring(occurred).contains(".")) {
            throw new IllegalArgumentException(" Email is invalid !");
        }

    }

    public String getFullName() {
        return firstName + " " + lastName;
    }
}
