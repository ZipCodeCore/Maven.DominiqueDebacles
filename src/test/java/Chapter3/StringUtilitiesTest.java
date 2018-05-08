package Chapter3;

import org.junit.Assert;
import org.junit.Test;

public class StringUtilitiesTest {
    /* String Utilities: Greeting
       Given a String representing a first name, return "Hello" plus the first name, separated by a space.
    */
    @Test
    public void testStringUtilitiesGreetingMorning1() {
        // Given
        String s = "Dominique";
        String expected = "Hello Dominique";

        // When
        String actual = StringUtilities.getGreeting(s);

        // Then
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void testStringUtilitiesGreetingMorning2() {
        // Given
        String s = "tariq";
        String expected = "Hello tariq";

        // When
        String actual = StringUtilities.getGreeting(s);

        // Then
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void testStringUtilitiesHelloGreetingMorning3() {
        // Given
        String s = "";
        String expected = "Hello ";

        // When
        String actual = StringUtilities.getGreeting(s);

        // Then
        Assert.assertEquals(actual, expected);
    }

    /* String Utilities: String to Array
        Given an string of words, separates the words into an array of strings.
        Ex: "One Two Three Four" -> ["One", "Two", "Three", "Four"]

        **String will never begin or end with a space**
     */

    @Test
    public void testStringUtilitiesToArrayMorning1() {
        // Given
        String s = "One Two Three Four";
        String[] expected = {"One", "Two", "Three", "Four"};

        // When
        String[] actual = StringUtilities.toArray(s);

        // Then
        Assert.assertArrayEquals(actual, expected);
    }

    @Test
    public void testStringUtilitiesToArrayMorning2() {
        // Given
        String s = "Pizza Potato Yogurt";
        String[] expected = {"Pizza", "Potato", "Yogurt"};

        // When
        String[] actual = StringUtilities.toArray(s);

        // Then
        Assert.assertArrayEquals(actual, expected);
    }

    /* String Utilities: Array to String
        Given an string of words, separates the words into an array of strings.
        Ex: "One Two Three Four" -> ["One", "Two", "Three", "Four"]

        **String will never begin or end with a space**
    */

    @Test
    public void testStringUtilitiesToStringMorning1() {
        // Given
        String[] array = {"One", "Two", "Three", "Four"};
        String expected = "One Two Three Four";

        // When
        String actual = StringUtilities.toString(array);

        // Then
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void testStringUtilitiesToStringMorning2() {
        // Given
        String[] array = {"Pizza", "Potato", "Yogurt"};
        String expected = "Pizza Potato Yogurt";

        // When
        String actual = StringUtilities.toString(array);

        // Then
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void testStringUtilitiesToStringMorning3() {
        // Given
        String[] array = {};
        String expected = "";

        // When
        String actual = StringUtilities.toString(array);

        // Then
        Assert.assertEquals(actual, expected);
    }

    /* String Utilities: Check Bad Morning
       Given a String, return true if the string contains "bad" and return false if the string does not contain "bad"

       The method should return true if the string "bad" is found, regardless of case.
    */
    @Test
    public void testStringUtilitiesBadMorning1() {
        // Given
        String s = "badixkf";
        boolean expected = true;

        // When
        boolean actual = StringUtilities.checkForBad(s);

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testStringUtilitiesBadMorning2() {
        // Given
        String s = "ixkf";
        boolean expected = false;

        // When
        boolean actual = StringUtilities.checkForBad(s);

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testStringUtilitiesBadMorning3() {
        // Given
        String s = "BAdixkf";
        boolean expected = true;

        // When
        boolean actual = StringUtilities.checkForBad(s);

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testStringUtilitiesBadMorning4() {
        // Given
        String s = "ixkBaDfxf";
        boolean expected = true;

        // When
        boolean actual = StringUtilities.checkForBad(s);

        // Then
        Assert.assertEquals(expected, actual);
    }
}
