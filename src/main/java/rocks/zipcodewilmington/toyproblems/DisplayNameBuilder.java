package rocks.zipcodewilmington.toyproblems;

public class DisplayNameBuilder {
    public static String getFullName(String firstName, String lastName) {
        return firstName + " " + lastName;
    }

    public static String getDisplayName(String firstName, String lastName) {
        if (firstName == "" || lastName == "")
        {
            return "Supporter";
        } else
        {
            return firstName + " " + lastName;
        }
    }
}
