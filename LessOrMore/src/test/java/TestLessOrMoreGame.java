import com.romko.lessormore.CompareResult;
import com.romko.lessormore.LessOrMoreGame;
import org.junit.Assert;
import org.junit.Test;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by Romko on 17.04.2017.
 */
public class TestLessOrMoreGame {

    @Test(timeout = 3000)
    public void randFromZeroTo100() {
        LessOrMoreGame game = new LessOrMoreGame();
        Set<Integer> allIntegersFromZeroTo100 = new HashSet<Integer>();
        int rangeBegin = 0;
        int rangeEnd = 100;
        Integer randValue;


        for (int i = rangeBegin; i <= rangeEnd; i++) {
            allIntegersFromZeroTo100.add(i);
        }
        while (allIntegersFromZeroTo100.size() != 0) {
            randValue = game.rand(rangeBegin, rangeEnd);
            allIntegersFromZeroTo100.remove(randValue);
        }

        Assert.assertTrue(true);
    }

    @Test(timeout = 3000)
    public void randUsingStandardLimits() {
        LessOrMoreGame game = new LessOrMoreGame();
        Set<Integer> allIntegersFrom_randMinTo_randMax = new HashSet<Integer>();
        Integer randValue;

        int rangeBegin = game.get_rangeMin();
        int rangeEnd = game.get_rangeMax();
        for (int i = rangeBegin; i <= rangeEnd; i++) {
            allIntegersFrom_randMinTo_randMax.add(i);
        }
        while (allIntegersFrom_randMinTo_randMax.size() != 0) {
            randValue = game.rand();
            allIntegersFrom_randMinTo_randMax.remove(randValue);
        }

        Assert.assertTrue(true);
    }

    @Test(timeout = 3000)
    public void randWithUpperLimitIs500() {
        LessOrMoreGame game = new LessOrMoreGame();
        Set<Integer> allIntegersFrom_randMinTo500 = new HashSet<Integer>();
        Integer randValue;
        int rangeEnd = 500;

        int rangeBegin = game.get_rangeMin();
        for (int i = rangeBegin; i <= rangeEnd; i++) {
            allIntegersFrom_randMinTo500.add(i);
        }
        while (allIntegersFrom_randMinTo500.size() != 0) {
            randValue = game.rand(rangeEnd);
            allIntegersFrom_randMinTo500.remove(randValue);
        }

        Assert.assertTrue(true);
    }

    @Test
    public void guess5InRangeFrom5To5() {
        int rangeBegin = 5;
        int rangeEnd = 5;
        int guessNumber = 5;
        LessOrMoreGame game = new LessOrMoreGame(rangeBegin, rangeEnd);
        CompareResult expected = CompareResult.EQUAL;

        CompareResult actual;
        actual = game.guess(guessNumber);

        Assert.assertEquals(actual, expected);
        Assert.assertEquals((long)game.get_assumptionNumbers().get(0), (long)guessNumber);
    }

    @Test (expected = IllegalArgumentException.class)
    public void guess101InRangeFromZeroTo100() {
        int rangeBegin = 0;
        int rangeEnd = 100;
        int guessNumber = 101;
        LessOrMoreGame game = new LessOrMoreGame(rangeBegin, rangeEnd);

        CompareResult actual;;
        actual = game.guess(guessNumber);

        Assert.fail();
    }

    @Test (expected = IllegalArgumentException.class)
    public void guessZeroInRangeFrom1To100() {
        int rangeBegin = 1;
        int rangeEnd = 100;
        int guessNumber = 0;
        LessOrMoreGame game = new LessOrMoreGame(rangeBegin, rangeEnd);

        CompareResult actual;
        actual = game.guess(guessNumber);

        Assert.fail();
    }


}
