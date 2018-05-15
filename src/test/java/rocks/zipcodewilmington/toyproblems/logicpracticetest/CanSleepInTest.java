package rocks.zipcodewilmington.toyproblems.logicpracticetest;

import rocks.zipcodewilmington.toyproblems.LogicPractice;
import org.junit.Assert;
import org.junit.Test;

/**
 * @author leon on 5/14/18.
 */
public class CanSleepInTest {
    @Test
    public void canSleepInTrueTrue() {
        // given
        boolean isWeekendValue = true;
        boolean isOnVacation = true;

        // when
        boolean outcome = LogicPractice.canSleepIn(isWeekendValue, isOnVacation);

        // then
        Assert.assertTrue(outcome);
    }

    @Test
    public void canSleepInTrueFalse() {
        // given
        boolean isWeekendValue = true;
        boolean isOnVacation = false;

        // when
        boolean outcome = LogicPractice.canSleepIn(isWeekendValue, isOnVacation);

        // then
        Assert.assertTrue(outcome);
    }


    @Test
    public void canSleepInFalseTrue() {
        // given
        boolean isWeekendValue = false;
        boolean isOnVacation = true;

        // when
        boolean outcome = LogicPractice.canSleepIn(isWeekendValue, isOnVacation);

        // then
        Assert.assertTrue(outcome);
    }

    @Test
    public void canSleepInFalseFalse() {
        // given
        boolean isWeekendValue = false;
        boolean isOnVacation = false;

        // when
        boolean outcome = LogicPractice.canSleepIn(isWeekendValue, isOnVacation);

        // then
        Assert.assertFalse(outcome);
    }


}
