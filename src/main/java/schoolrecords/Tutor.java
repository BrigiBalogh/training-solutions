package schoolrecords;

import java.util.ArrayList;
import java.util.List;

public class Tutor
{


    private String name;
    private List<Subject> taughtSubjects = new ArrayList<>();

    public Tutor(String name, List<Subject> taughtSubjects)
    {
        this.name = name;
        this.taughtSubjects = taughtSubjects;
    }

    public String getName()
    {
        return name;
    }

    public boolean tutorTeachingSubject(Subject subject)
    {
        int i=0;
       for (Subject  asd: taughtSubjects)
       {
           if (asd.equals(subject))
           {
               i++;
               return true;
           }
           else
               {
                   return false;
               }
       }
       if (i == 1)
       {
           return true;
       }
       else {return false;}

    }
}
