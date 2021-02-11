package week15d02;

public class Question {

    private String question;
    private String answer;
    private int points;
    private String theme;

    public Question(String question, String answer, int points, String theme) {
        this.question = question;
        this.answer = answer;
        this.points = points;
        this.theme = theme;
    }

    public String getQuestion() {
        return question;
    }

    public String getAnswer() {
        return answer;
    }

    public int getPoints() {
        return points;
    }

    public String getTheme() {
        return theme;
    }

    @Override
    public String toString() {
        return question +"" + answer + "" + points + "" + theme;
    }
}
