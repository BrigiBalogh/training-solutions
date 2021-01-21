package week04d01;

public class NameChanger {

    private String fullName;

    public NameChanger(String fullName) {
        if (fullName == null|| fullName.trim().equals("")) {
            throw new IllegalArgumentException("Invalid name :" + fullName + "!");
        }
        this.fullName = fullName;
    }

    public void changeFirstName(String firstName){
        String[] temp =fullName.split("");
        fullName = new StringBuilder(temp[0]).append("" + firstName).toString();

    }

    public String getFullName() {
        return fullName;
    }
}
