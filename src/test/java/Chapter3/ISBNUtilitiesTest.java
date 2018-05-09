package Chapter3;

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

    @Test
    public void testISBNUtilitiesGetNumbersMorning2() {
        // Given
        String s = "ISBN437-9-18-48591-1";
        String expected = "437-9-18-48591-1";

        // When
        String actual = ISBNUtilities.getNumbers(s);

        // Then
        Assert.assertEquals(actual, expected);
    }

    /* ISBN Utilities: Return only numbers
       An ISBN number is a 10 - 13 digit number consisting of 5 sets of numbers separated by a hyphen.
       Given an ISBN number prepended with the characters ISBN, return a an array of strings representing each of the
       5 sets of numbers.
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

    @Test
    public void testISBNUtilitiesToArrayAfternoon2() {
        // Given
        String s = "ISBN437-9-18-48591-1";
        String[] expected = {"437", "9", "18", "48591", "1"};

        // When
        String[] actual = ISBNUtilities.getArray(s);

        // Then
        Assert.assertArrayEquals(actual, expected);
    }

    /* ISBN Utilities: Return only the fourth set of numbers
       An ISBN number is a 10 - 13 digit number consisting of 5 sets of numbers separated by a hyphen.
       Given an ISBN number prepended with the characters ISBN, return a string representing the fourth set of numbers.
       Ex. ISBN978-3-16-148410-0 -> "148410"
    */

    @Test
    public void testISBNUtilitiesFourthSetMorning1() {
        // Given
        String s = "ISBN437-9-18-48591-1";
        String expected = "48591";

        // When
        String actual = ISBNUtilities.getFourthSet(s);

        // Then
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void testISBNUtilitiesFourthSetMorning2() {
        // Given
        String s = "ISBN978-3-16-148410-0";
        String expected = "148410";

        // When
        String actual = ISBNUtilities.getFourthSet(s);

        // Then
        Assert.assertEquals(actual, expected);
    }

    /* ISBN Utilities: Return a specific set of numbers
       An ISBN number is a 10 - 13 digit number consisting of 5 sets of numbers separated by a hyphen.
       Given an ISBN number prepended with the characters ISBN and integer representing the desired set of numbers,
       return a string representing the specified set of numbers.
       ISBNUtilities.getSet("ISBN978-3-16-148410-0", 3") -> "16"
    */

    @Test
    public void testISBNUtilitiesGetSetAfternoon1() {
        // Given
        String s = "ISBN437-9-18-48591-1";
        String expected = "18";

        // When
        String actual = ISBNUtilities.getSet(s, 3);

        // Then
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void testISBNUtilitiesGetSetAfternoon2() {
        // Given
        String s = "ISBN437-9-18-48591-1";
        String expected = "1";

        // When
        String actual = ISBNUtilities.getSet(s, 5);

        // Then
        Assert.assertEquals(actual, expected);
    }

}
