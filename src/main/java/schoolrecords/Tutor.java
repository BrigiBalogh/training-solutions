package schoolrecords;

import java.util.ArrayList;
import java.util.List;

public class Tutor {


    private String name;
    private List<Subject> taughtSubjects = new ArrayList<>();

    public Tutor(String name, List<Subject> taughtSubjects) {
        this.name = name;
        this.taughtSubjects = taughtSubjects;
    }

    public String getName() {
        return name;
    }

    public boolean tutorTeachingSubject(Subject subject) {

        if (taughtSubjects.isEmpty()) {
            throw new IllegalArgumentException("Nem tanít ilyen tantárgyat !");
        }
        int i = 0;
        for (Subject s : taughtSubjects) {
            if (s.getSubjectName().equals(subject.getSubjectName())) {
                return true;
            }
        }
        return false;
    }
}

