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
            sliceLine( br);

        } catch (IOException e) {
            throw new IllegalStateException("Cannot read file !", e);
        }
    }

    private void sliceLine(BufferedReader br) throws IOException{
        String line;
        while ((line = br.readLine()) != null) {
            String secondLine = br.readLine();
            String[] parts = secondLine.split("");
            String answer = parts[0];
            int points = Integer.parseInt(parts[1]);
            String  theme = parts[2];
            questions.add(new Question(line, answer, points, theme));
        }
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

    }
}
