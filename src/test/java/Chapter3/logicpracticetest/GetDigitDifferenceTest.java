package Chapter3.logicpracticetest;

import Chapter3.LogicPractice;
import org.junit.Assert;
import org.junit.Test;

/**
 * @author leon on 5/15/18.
 */
public class GetDigitDifferenceTest {
    @Test
    public void delta10() {
        // Given
        Integer expected = 1;
        Integer valueToEvaluate = 10;

        // When
        Integer actual = LogicPractice.getDigitDifference(valueToEvaluate);

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void delta23() {
        // Given
        Integer expected = 1;
        Integer valueToEvaluate = 23;

        // When
        Integer actual = LogicPractice.getDigitDifference(valueToEvaluate);

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void delta52() {
        // Given
        Integer expected = 3;
        Integer valueToEvaluate = 52;

        // When
        Integer actual = LogicPractice.getDigitDifference(valueToEvaluate);

        // Then
        Assert.assertEquals(expected, actual);
    }


    @Test
    public void delta73() {
        // Given
        Integer expected = 4;
        Integer valueToEvaluate = 73;

        // When
        Integer actual = LogicPractice.getDigitDifference(valueToEvaluate);

        // Then
        Assert.assertEquals(expected, actual);
    }


    @Test
    public void delta99() {
        // Given
        Integer expected = 0;
        Integer valueToEvaluate = 99;

        // When
        Integer actual = LogicPractice.getDigitDifference(valueToEvaluate);

        // Then
        Assert.assertEquals(expected, actual);
    }

}