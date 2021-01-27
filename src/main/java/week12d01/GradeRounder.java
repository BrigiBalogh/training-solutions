package week12d01;

public class GradeRounder {


    int[]  roundGrades(int[] grades)  {
        for (int i = 0; i < grades.length; i++ ) {
            if(grades[i] > 40) {
                int number = grades[i] / 5;
                int next = (number + 1) * 5;
                if(next - grades[i] < 3) {
                    grades[i] = next;
                }
            }
        }
        return grades;
    }
}
