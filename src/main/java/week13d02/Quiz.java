package week13d02;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Quiz {

    private String solution ;
    private Map<String, List<String>> answers = new HashMap<>();

    public void fileReader () {
        try(BufferedReader reader = Files.newBufferedReader(Path.of("src/main/resources/week13d02/results.txt"))) {
            solution = reader.readLine();
            String line;
            while((line = reader.readLine()) != null) {
                String[] parts = line.split(" ");
                String personCode = parts[0];
                String answer = parts[1];
                if (!answers.containsKey(personCode)) {
                    List<String> personAnswers = new ArrayList<>();
                    personAnswers.add(answer);
                    answers.put(personCode, personAnswers);
                }
                else {
                    List<String>personAnswers = answers.get(personCode);
                    personAnswers.add(answer);
                }
            }
            System.out.println(solution);
            System.out.println(answers);
        }catch (IOException ioe) {
            throw new IllegalStateException("Cannot read file !",ioe);
        }

    }

    public boolean rightAnswer(String personCode, int index) {
        String answer = answers.get(personCode).get(index);
        /*for (char c : solution.toCharArray()) {
            if(answer.equals(c) ){
               return true;
            }
        }*/
        if (answer.equals(String.valueOf(solution.charAt(index)))) {
            return true;
        } else {
            return false;
        }
    }



    public String findContestantWithMostX() {
        int maxX =0;
        String personCode = "";

        for (Map.Entry<String, List<String>>entry : answers.entrySet()) {
            int counter = xCounter(entry);
            if (counter > maxX) {
                maxX = counter;
                personCode = entry.getKey();
            }
        }
        return personCode;
    }

    private int xCounter(Map.Entry<String,List<String>>entry){
        int counter = 0;
        for (String s : entry.getValue()) {
            if (s.equals("X")) {
                counter ++;
            }
        }
        return counter;
    }

    public String getWinner () {
        int max =0;
        String personCode = "";

        for (Map.Entry<String, List<String>>entry : answers.entrySet()) {
            int counter = getCounter(entry);
            if (counter > max) {
                max = counter;
                personCode = entry.getKey();
            }
        }
        return personCode;
    }

    private int getCounter(Map.Entry<String,List<String>>entry) {
        int counter = 0;
        for (int i = 0; i < entry.getValue().size(); i++) {
            if(rightAnswer(entry.getKey(), i)){
                counter += i +1;
            }else {
                if (!entry.getValue().get(i).equals("X")) {
                    counter -= 2;
                }
            }
        }
        return counter;
    }

    public static void main(String[] args) {
        Quiz quiz = new Quiz();
        quiz.fileReader();

        System.out.println(quiz.rightAnswer("AB123",0));
        System.out.println("X:" + quiz.findContestantWithMostX());
        System.out.println(quiz.getWinner());
    }


}
