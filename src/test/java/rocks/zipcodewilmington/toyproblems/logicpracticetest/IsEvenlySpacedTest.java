package rocks.zipcodewilmington.toyproblems.logicpracticetest;

import rocks.zipcodewilmington.toyproblems.LogicPractice;
import org.junit.Assert;

/**
 * @author leon on 5/15/18.
 */
public class IsEvenlySpacedTest {
    public void isEvenlySpaced1And2And3() {
        // Given
        Integer val1 = 1;
        Integer val2 = 2;
        Integer val3 = 3;

        // When
        boolean outcome = LogicPractice.isEvenlySpaced(val1, val2, val3);

        // Then
        Assert.assertTrue(outcome);
    }

    public void isEvenlySpaced2And4And6() {
        // Given
        Integer val1 = 2;
        Integer val2 = 4;
        Integer val3 = 6;

        // When
        boolean outcome = LogicPractice.isEvenlySpaced(val1, val2, val3);

        // Then
        Assert.assertTrue(outcome);
    }

    public void isEvenlySpaced6And4And2() {
        // Given
        Integer val1 = 6;
        Integer val2 = 4;
        Integer val3 = 2;

        // When
        boolean outcome = LogicPractice.isEvenlySpaced(val1, val2, val3);

        // Then
        Assert.assertTrue(outcome);
    }

    public void isEvenlySpaced1And7And4() {
        // Given
        Integer val1 = 1;
        Integer val2 = 7;
        Integer val3 = 4;

        // When
        boolean outcome = LogicPractice.isEvenlySpaced(val1, val2, val3);

        // Then
        Assert.assertTrue(outcome);
    }


    public void isEvenlySpaced2And7And4() {
        // Given
        Integer val1 = 2;
        Integer val2 = 7;
        Integer val3 = 4;

        // When
        boolean outcome = LogicPractice.isEvenlySpaced(val1, val2, val3);

        // Then
        Assert.assertFalse(outcome);
    }


    public void isEvenlySpaced1And2And9() {
        // Given
        Integer val1 = 1;
        Integer val2 = 2;
        Integer val3 = 9;

        // When
        boolean outcome = LogicPractice.isEvenlySpaced(val1, val2, val3);

        // Then
        Assert.assertFalse(outcome);
    }

    public void isEvenlySpaced3And2And13() {
        // Given
        Integer val1 = 3;
        Integer val2 = 2;
        Integer val3 = 13;

        // When
        boolean outcome = LogicPractice.isEvenlySpaced(val1, val2, val3);

        // Then
        Assert.assertFalse(outcome);
    }


    public void isEvenlySpaced19And9And3() {
        // Given
        Integer val1 = 19;
        Integer val2 = 9;
        Integer val3 = 3;

        // When
        boolean outcome = LogicPractice.isEvenlySpaced(val1, val2, val3);

        // Then
        Assert.assertFalse(outcome);
    }
}
