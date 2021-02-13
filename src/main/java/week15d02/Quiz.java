package week15d02;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.*;

public class Quiz {

    private List<Question> questions = new ArrayList<>();

    public void readFromFile(Path path) {
        try(BufferedReader br = Files.newBufferedReader(path)) {
            String line;
            while ((line = br.readLine()) != null) {
                String secondLine = br.readLine();
                Question question = sliceLine(line, secondLine);
                questions.add(question);
            }
        } catch (IOException e) {
            throw new IllegalStateException("Cannot read file !", e);
        }
    }

    private Question sliceLine(String line, String secondLine) {
        String[] parts = secondLine.split("");
        String answer = parts[0];
        int points = Integer.parseInt(parts[1]);
        String  theme = parts[2];
        return new Question(line, answer, points, theme);
    }

    public List<String> returnQuestionByTheme(String theme) {
        List<String > questionsByTheme = new ArrayList<>();

        for (Question q : questions) {
            if (q.getTheme().equals(theme)) {
                questionsByTheme.add(q.getQuestion());
            }
        }
        return questionsByTheme;
    }

    public Question drawByQuestions(Random rnd) {

        int index = rnd.nextInt(questions.size());
        return questions.get(index);

    }

    public Map<String, List<Question>> systematizeQuestionsByTheme() {
        Map<String, List<Question>> result = new HashMap<>();
        for (Question q : questions) {
            if (!result.containsKey(q.getTheme())) {
                result.put(q.getTheme(), new ArrayList<>());
            }
            result.get(q.getTheme()).add(q);
        }
        return result;
    }

    public String searchMostPointsByTheme() {
        Map<String, List<Question>> themeMap = systematizeQuestionsByTheme(); //
        Map<String, Integer> themeSumPoint = sumPointByTheme(themeMap); // téma --> pont
        String maxTheme = maxPointTheme(themeSumPoint);
        return maxTheme;
    }

    private Map<String, Integer> sumPointByTheme(Map<String, List<Question>> themeMap) {
        Map<String, Integer> ret = new HashMap<>();
        for (String theme : themeMap.keySet()) {
            List<Question> questionList = themeMap.get(theme);
            int sumPoints = summarizePoints(questionList);
            ret.put(theme, sumPoints);
        }
        return ret;
/*        for (Map.Entry<String, List<Question>> entry : themeMap.entrySet()) {
           String theme = entry.getKey();
           List<Question> questionList = entry.getValue();
        }*/
    }

    private int summarizePoints(List<Question> questionList) {
        int sum = 0;
        for (Question q : questionList) {
            sum += q.getPoints();
        }
        return sum;
    }

    private String maxPointTheme(Map<String, Integer> themeSumPoint) {
        int maxPoint = -1;
        String maxTheme = "";
        for (String theme : themeSumPoint.keySet()) {
            int points = themeSumPoint.get(theme);
            if (points > maxPoint) {
                maxPoint = points;
                maxTheme = theme;
            }
        }
        return maxTheme;
    }

}
