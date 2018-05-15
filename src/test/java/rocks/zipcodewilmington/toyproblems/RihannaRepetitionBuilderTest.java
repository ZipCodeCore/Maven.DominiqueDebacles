package rocks.zipcodewilmington.toyproblems;

import org.junit.Assert;
import org.junit.Test;

public class RihannaRepetitionBuilderTest {
    /**
     * String Utilities: Rihanna Repetition Morning
     * Rihanna is writing a new pop song. She wants to make sure she repeats the last two letters the appropriate amount
     * of times to create the perfect pop cadence. Given a string, return the string with the last four letters repeated an
     * additional three times at the end of the word. This method should use StringBuilder. Ex: Umbrellaellaellaella
     */

    @Test
    public void testRihannaRepetitionBuilderMorning1() {
        // Given
        String s = "Umbrella";
        String expected = "Umbrellaellaellaella";

        // When
        String actual = RihannaRepetitionBuilder.getVerse(s);

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testRihannaRepetitionBuilderRepetitionMorning2() {
        // Given
        String s = "Diamond";
        String expected = "Diamondmondmondmond";

        // When
        String actual = RihannaRepetitionBuilder.getVerse(s);

        // Then
        Assert.assertEquals(expected, actual);
    }

    /**
     * String Utilities: Rihanna Repetition Afternoon
     * Rihanna is writing a new pop song and what's to vary the ways she uses repetition. Given three parameters,
     * a string, the number of letters she wants to repeat at the end of the word and the number of times she wants to
     * repeat those letters, return the string with the correct letters repeated the correct number of times.
     * This method should use StringBuilder. Ex: Umbrellaellaellaella
     */

    @Test
    public void testRihannaRepetitionBuilderAfternoon1() {
        // Given
        String s = "Umbrella";
        String expected = "Umbrellalalalala";

        // When
        String actual = RihannaRepetitionBuilder.getVerse(s, 2, 4);

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testRihannaRepetitionBuilderAfternoon2() {
        // Given
        String s = "Umbrella";
        String expected = "Umbrella";

        // When
        String actual = RihannaRepetitionBuilder.getVerse(s, 2, 0);

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testRihannaRepetitionBuilderAfternoon3() {
        // Given
        String s = "Umbrella";
        String expected = "Umbrella";

        // When
        String actual = RihannaRepetitionBuilder.getVerse(s, 0, 2);

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testRihannaRepetitionBuilderAfternoon4() {
        // Given
        String s = "Umbrella";
        String expected = "Umbrellalla";

        // When
        String actual = RihannaRepetitionBuilder.getVerse(s, 3, 1);

        // Then
        Assert.assertEquals(expected, actual);
    }
}
