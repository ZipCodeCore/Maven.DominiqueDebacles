package rocks.zipcodewilmington.toyproblems;

/**
 * Display Name Builder: Full Name Morning
 * The public library is creating an email and needs each email subscriber's full name.
 * Given two parameters of type String, `firstName` and `lastName`,
 * return the subscriber's full name.
 * <p>
 * Could increase difficulty by asking that first letter of the first name and last name be capitalized**
 */
public class DisplayNameBuilder {
    public static String getFullName(String firstName, String lastName) {
        return firstName + " " + lastName;
    }

    public static String getDisplayName(String firstName, String lastName) {
        if (firstName == "" || lastName == "") {
            return "Supporter";
        } else {
            return firstName + " " + lastName;
        }
    }
}
