package schoolrecords;

import java.util.ArrayList;
import java.util.List;

public class Student {

    private List<Mark> marks = new ArrayList<>();

    private String name;

    public Student(String name)
    {
        if(isEmpty(name)) {
            throw new IllegalArgumentException(" A név nem lehet üres !");
        }
        this.name = name;
    }


    public void grading(Mark mark)
    {
        if( mark==null) {
            throw new NullPointerException(" A jegy nem lehet nulla !");
        }
     marks.add(mark);
    }


    public  double  calculateAverage()
    {
        if (marks.isEmpty()) {
            return 0;
        }
        double sum=0;
     for(Mark mark : marks)
     {
         sum +=mark.getMarkType().getValue();
     }
     double average = sum /marks.size();
     return Math.round(average*100)/100.0;
    }


    public double calculateSubjectAverage(Subject subject) {
        if (marks.isEmpty()) {
            return 0;
        }
        double sum = 0;
        int count = 0;
        for (Mark mark : marks) {
            if (mark.getSubject().getSubjectName().equals(subject.getSubjectName())) {
                sum += mark.getMarkType().getValue();
                count++;
            }
        }
        if (count == 0) {
            return 0;
        }
        double average =sum/count;
        return Math.round(average * 100)/ 100.0;
    }


    public String getName()
    {
        return name;
    }


    private boolean isEmpty(String name)
    {
        return name== null || "".equals(name.trim());

    }


    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                '}';
    }


}
