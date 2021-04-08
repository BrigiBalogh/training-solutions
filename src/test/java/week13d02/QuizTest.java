package week13d02;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class QuizTest {

    Quiz quiz = new Quiz();

    @Test
    void rightAnswer() {

        assertEquals(true,quiz.rightAnswer("AB123", 0));
    }

    @Test
    void findContestantWithMostX() {
        assertEquals("BD452",quiz.findContestantWithMostX());
    }

    @Test
    void getWinner() {
        assertEquals("GH1234",quiz.getWinner());
    }
}