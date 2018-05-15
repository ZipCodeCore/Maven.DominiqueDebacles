package rocks.zipcodewilmington.toyproblems;

import org.junit.Assert;
import org.junit.Test;

public class ISBNUtilitiesTest {
    /* ISBN Utilities: Return only numbers
       An ISBN number is a 10 - 13 digit number consisting of 5 numerical elements separated by a hyphen. Given an ISBN
       number appended with the characters ISBN, return a string only the five number sections.
       Ex. ISBN978-3-16-148410-0 -> 978-3-16-148410-0
    */
    @Test
    public void testISBNUtilitiesGetNumbersMorning1() {
        // Given
        String s = "ISBN978-3-16-148410-0";
        String expected = "978-3-16-148410-0";

        // When
        String actual = ISBNUtilities.getNumbers(s);

        // Then
        Assert.assertEquals(actual, expected);
    }

    /* ISBN Utilities: Return only numbers
       An ISBN number is a 10 - 13 digit number consisting of 5 numerical elements separated by a hyphen. Given an ISBN number appended with the characters
       ISBN, return a an array of strings representing each of the 5 numerical elements.
       Ex. ISBN978-3-16-148410-0 -> ["978", "3", "16", "148410", "0"]
    */

    @Test
    public void testISBNUtilitiesToArrayAfternoon1() {
        // Given
        String s = "ISBN978-3-16-148410-0";
        String[] expected = {"978", "3", "16", "148410", "0"};

        // When
        String[] actual = ISBNUtilities.getArray(s);

        // Then
        Assert.assertArrayEquals(actual, expected);
    }
}
