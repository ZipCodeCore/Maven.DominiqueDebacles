package rocks.zipcodewilmington.toyproblems;

import org.junit.Assert;
import org.junit.Test;

public class DisplayNameBuilderTest {
      /* String Utilities: Full Name Morning
       The public library is creating an email and needs each email subscriber's full name.
       Given two parameters, String firstName and String lastName, return the subscriber's full name.

       **Could increase difficulty by asking that first letter of the first name and last name be capitalized**
    */

    @Test
    public void testDisplayNameMorning1() {
        // Given
        String firstName = "Dominique";
        String lastName = "Clarke";
        String expected = "Dominique Clarke";

        // When
        String actual = DisplayNameBuilder.getFullName(firstName, lastName);

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testDisplayNameMorning2() {
        // Given
        String firstName = "tariq";
        String lastName = "hook";
        String expected = "tariq hook";

        // When
        String actual = DisplayNameBuilder.getFullName(firstName, lastName);

        // Then
        Assert.assertEquals(expected, actual);
    }

    /* String Utilities: Full Name Afternoon
       The public library is creating an email and needs each email subscriber's full name.
       However, they are missing some of their subscriber's data. If any subscriber does not have a first name
       or last name, their display name should be "Supporter". Else, their display name should be their full name.
       Given two parameters, String firstName and String lastName, return the subscriber's appropriate display name.

       **Could increase difficulty by asking that first letter of the first name and last name be capitalized**
    */

    @Test
    public void testDisplayNameAfternoon1() {
        // Given
        String firstName = "";
        String lastName = "Clarke";
        String expected = "Supporter";

        // When
        String actual = DisplayNameBuilder.getDisplayName(firstName, lastName);

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testDisplayNameAfternoon2() {
        // Given
        String firstName = "tariq";
        String lastName = "hook";
        String expected = "tariq hook";

        // When
        String actual = DisplayNameBuilder.getDisplayName(firstName, lastName);

        // Then
        Assert.assertEquals(expected, actual);
    }
}
