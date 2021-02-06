package collectionsarrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Lottery {

    private List<Integer> lotteryEngine(int balls){
        List<Integer> lotteryBalls = new ArrayList<>();
        for (int i = 1; i <= balls; i++) {
            lotteryBalls.add(i);
        }
        Collections.shuffle(lotteryBalls);
        return lotteryBalls;
    }

    public List<Integer> selectWinningNumbers(int lotteryType, int ballCount) throws IllegalArgumentException {

        if (ballCount <= lotteryType) {
            throw new IllegalArgumentException("Balls must be more then the winning numbers !");
        }
        List<Integer> lotteryBalls = lotteryEngine(ballCount);
        List<Integer> winningNumbers = lotteryBalls.subList(0,lotteryType);
        Collections.sort(winningNumbers);
        return winningNumbers;
    }
}
