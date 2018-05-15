package rocks.zipcodewilmington.toyproblems.logicpracticetest;

import rocks.zipcodewilmington.toyproblems.LogicPractice;
import org.junit.Assert;
import org.junit.Test;

/**
 * @author leon on 5/15/18.
 */
public class RemoveCharacterTest {
    @Test
    public void removeCharacterIndex0() {
        // Given
        String input = "Hello";
        Integer index = 0;
        String expected = "ello";

        // When
        String actual = LogicPractice.removeCharacter(input, index);

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void removeCharacterIndex4() {
        // Given
        String input = "Notebook";
        Integer index = 4;
        String expected = "Noteook";

        // When
        String actual = LogicPractice.removeCharacter(input, index);

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void removeCharacterIndex20() {
        // Given
        String input = "Impress";
        Integer index = 20;
        String expected = "Impress";

        // When
        String actual = LogicPractice.removeCharacter(input, index);

        // Then
        Assert.assertEquals(expected, actual);
    }
}
