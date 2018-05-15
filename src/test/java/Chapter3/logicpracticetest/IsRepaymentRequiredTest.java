package Chapter3.logicpracticetest;

import Chapter3.LogicPractice;
import org.junit.Assert;
import org.junit.Test;

/**
 * @author leon on 5/15/18.
 */
public class IsRepaymentRequiredTest {

    @Test
    public void isRepaymentRequiredTrueTrue() {
        // Given
        boolean isPaymentDue = true;
        boolean isMoneyOwed = true;

        // When
        boolean actual = LogicPractice.isRepaymentRequired(isPaymentDue, isMoneyOwed);

        // Then
        Assert.assertTrue(actual);
    }

    @Test
    public void isRepaymentRequiredTrueFalse() {
        // Given
        boolean isPaymentDue = true;
        boolean isMoneyOwed = false;

        // When
        boolean actual = LogicPractice.isRepaymentRequired(isPaymentDue, isMoneyOwed);

        // Then
        Assert.assertFalse(actual);
    }


    @Test
    public void isRepaymentRequiredFalseFalse() {
        // Given
        boolean isPaymentDue = false;
        boolean isMoneyOwed = false;

        // When
        boolean actual = LogicPractice.isRepaymentRequired(isPaymentDue, isMoneyOwed);

        // Then
        Assert.assertFalse(actual);
    }


    @Test
    public void isRepaymentRequiredFalseTrue() {
        // Given
        boolean isPaymentDue = false;
        boolean isMoneyOwed = true;

        // When
        boolean actual = LogicPractice.isRepaymentRequired(isPaymentDue, isMoneyOwed);

        // Then
        Assert.assertFalse(actual);
    }

}
