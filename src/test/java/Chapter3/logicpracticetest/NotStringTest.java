package Chapter3.logicpracticetest;

import Chapter3.LogicPractice;
import org.junit.Assert;
import org.junit.Test;

/**
 * @author leon on 5/15/18.
 */
public class NotStringTest {
    @Test
    public void cat() {
        // Given
        String input = "cat";
        String expected = "not " + input;

        // When
        String actual = LogicPractice.notString(input);

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void me() {
        // Given
        String input = "me";
        String expected = "not " + input;

        // When
        String actual = LogicPractice.notString(input);

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void not_a_chance() {
        // Given
        String expected = "not a chance";

        // When
        String actual = LogicPractice.notString(expected);

        // Then
        Assert.assertEquals(expected, actual);
    }


    @Test
    public void not_a_good_idea() {
        // Given
        String expected = "not a good idea";

        // When
        String actual = LogicPractice.notString(expected);

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void notably() {
        // Given
        String input = "notably";
        String expected = "not " + input;

        // When
        String actual = LogicPractice.notString(input);

        // Then
        Assert.assertEquals(expected, actual);
    }
}
