package week09d03;

import java.util.ArrayList;
import java.util.List;

public class santaClaus {

    private List<Person> people;

    public santaClaus(List<Person> persons) {
        this.people = people;
    }

   public void getThroughChimneys() {
        for (Person p : people) {
            p.setPresent();
        }
   }

    public List<Person> getPeople() {
        return new ArrayList<>(people);
    }
}
