package rocks.zipcodewilmington.toyproblems.logicpracticetest;

import rocks.zipcodewilmington.toyproblems.LogicPractice;
import org.junit.Assert;
import org.junit.Test;

/**
 * @author leon on 5/15/18.
 */
public class SumAndRoundDownToNearestTenTest {
    @Test
    public void sumAndRoundDownToNearestTen1And2And3() {
        // Given
        Integer val1 = 1;
        Integer val2 = 2;
        Integer val3 = 3;
        Integer expected = 10;
        
        // When
        Integer actual = LogicPractice.sumAndRoundDownToNearestTen(val1, val2, val3);
        
        // Then
        Assert.assertEquals(expected, actual);
    }


    @Test
    public void sumAndRoundDownToNearestTen12And12And14() {
        // Given
        Integer val1 = 12;
        Integer val2 = 12;
        Integer val3 = 14;
        Integer expected = 30;

        // When
        Integer actual = LogicPractice.sumAndRoundDownToNearestTen(val1, val2, val3);

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void sumAndRoundDownToNearestTen16And18And19() {
        // Given
        Integer val1 = 16;
        Integer val2 = 18;
        Integer val3 = 19;
        Integer expected = 60;

        // When
        Integer actual = LogicPractice.sumAndRoundDownToNearestTen(val1, val2, val3);

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void sumAndRoundDownToNearestTen3And3And4() {
        // Given
        Integer val1 = 3;
        Integer val2 = 3;
        Integer val3 = 4;
        Integer expected = 10;

        // When
        Integer actual = LogicPractice.sumAndRoundDownToNearestTen(val1, val2, val3);

        // Then
        Assert.assertEquals(expected, actual);
    }
}
