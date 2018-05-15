package Chapter3.logicpracticetest;

import Chapter3.LogicPractice;
import org.junit.Assert;
import org.junit.Test;

/**
 * @author leon on 5/15/18.
 */
public class GetBlackJackValueTest {
    @Test
    public void getBlackJackValue10And11() {
        // Given
        Integer firstCardValue = 10;
        Integer secondCardValue = 11;
        Integer expectedHandValue = 11;

        // When
        Integer actualHandValue = LogicPractice.getBlackJackValue(firstCardValue, secondCardValue);

        // Then
        Assert.assertEquals(expectedHandValue, actualHandValue);
    }

    @Test
    public void getBlackJackValue20And11() {
        // Given
        Integer firstCardValue = 20;
        Integer secondCardValue = 11;
        Integer expectedHandValue = 20;

        // When
        Integer actualHandValue = LogicPractice.getBlackJackValue(firstCardValue, secondCardValue);

        // Then
        Assert.assertEquals(expectedHandValue, actualHandValue);
    }

    @Test
    public void getBlackJackValue21And20() {
        // Given
        Integer firstCardValue = 21;
        Integer secondCardValue = 20;
        Integer expectedHandValue = 21;

        // When
        Integer actualHandValue = LogicPractice.getBlackJackValue(firstCardValue, secondCardValue);

        // Then
        Assert.assertEquals(expectedHandValue, actualHandValue);
    }

    @Test
    public void getBlackJackValue22And10() {
        // Given
        Integer firstCardValue = 22;
        Integer secondCardValue = 10;
        Integer expectedHandValue = 10;

        // When
        Integer actualHandValue = LogicPractice.getBlackJackValue(firstCardValue, secondCardValue);

        // Then
        Assert.assertEquals(expectedHandValue, actualHandValue);
    }

    @Test
    public void getBlackJackValue19And22() {
        // Given
        Integer firstCardValue = 19;
        Integer secondCardValue = 22;
        Integer expectedHandValue = 19;

        // When
        Integer actualHandValue = LogicPractice.getBlackJackValue(firstCardValue, secondCardValue);

        // Then
        Assert.assertEquals(expectedHandValue, actualHandValue);
    }
}