package Chapter3.logicpracticetest;

import Chapter3.LogicPractice;
import org.junit.Assert;
import org.junit.Test;

/**
 * @author leon on 5/14/18.
 */
public class IsSumTenLogicPracticeTest {
    @Test
    public void isSumTen9And1() {
        // given
        int val1 = 9;
        int val2 = 1;

        // when
        boolean outcome = LogicPractice.isSumTen(val1, val2);

        // then
        Assert.assertTrue(outcome);
    }

    @Test
    public void isSumTen10And1() {
        // given
        int val1 = 10;
        int val2 = 1;

        // when
        boolean outcome = LogicPractice.isSumTen(val1, val2);

        // then
        Assert.assertFalse(outcome);
    }

    @Test
    public void isSumTen9And10() {
        // given
        int val1 = 9;
        int val2 = 10;

        // when
        boolean outcome = LogicPractice.isSumTen(val1, val2);

        // then
        Assert.assertFalse(outcome);
    }


    @Test
    public void isSumTen4And6() {
        // given
        int val1 = 4;
        int val2 = 6;

        // when
        boolean outcome = LogicPractice.isSumTen(val1, val2);

        // then
        Assert.assertTrue(outcome);
    }

    @Test
    public void isSumTen8And1() {
        // given
        int val1 = 8;
        int val2 = 1;

        // when
        boolean outcome = LogicPractice.isSumTen(val1, val2);

        // then
        Assert.assertFalse(outcome);
    }

    @Test
    public void isSumTen8And18() {
        // given
        int val1 = 8;
        int val2 = 18;

        // when
        boolean outcome = LogicPractice.isSumTen(val1, val2);

        // then
        Assert.assertFalse(outcome);
    }

    @Test
    public void isSumTen4And11() {
        // given
        int val1 = 4;
        int val2 = 11;

        // when
        boolean outcome = LogicPractice.isSumTen(val1, val2);

        // then
        Assert.assertFalse(outcome);
    }
}
