package Chapter3.logicpracticetest;

import Chapter3.LogicPractice;
import org.junit.Assert;
import org.junit.Test;

/**
 * @author leon on 5/15/18.
 */
public class SumOrSumAndDouble {
    @Test
    public void sum2And3() {
        // Given
        Integer expected = 5;
        Integer val1 = 2;
        Integer val2 = 3;


        // When
        Integer actual = LogicPractice.sumOrSumAndDouble(val1, val2);

        // Then
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void sumAndDouble2And2() {
        // Given
        Integer expected = 8;
        Integer val1 = 2;
        Integer val2 = 2;


        // When
        Integer actual = LogicPractice.sumOrSumAndDouble(val1, val2);

        // Then
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void sum1And3() {
        // Given
        Integer expected = 4;
        Integer val1 = 1;
        Integer val2 = 3;


        // When
        Integer actual = LogicPractice.sumOrSumAndDouble(val1, val2);

        // Then
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void sum6And23() {
        // Given
        Integer expected = 29;
        Integer val1 = 6;
        Integer val2 = 23;


        // When
        Integer actual = LogicPractice.sumOrSumAndDouble(val1, val2);

        // Then
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void sumAndDouble12And12() {
        // Given
        Integer expected = 48;
        Integer val1 = 12;
        Integer val2 = 12;


        // When
        Integer actual = LogicPractice.sumOrSumAndDouble(val1, val2);

        // Then
        Assert.assertEquals(actual, expected);
    }
}
