package week08d02;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LotteryTest {

    @Test
    void testFiveOutOfNinety() {
        List<Integer> result = Arrays.asList(18, 83, 45, 15,  67);
        Lottery lottery = new Lottery();
        assertEquals(result,lottery.getNumbersOneLoop(90, 5, 5));
    }
}
