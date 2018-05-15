package rocks.zipcodewilmington.toyproblems;

public class ISBNUtilities {
    public static String getNumbers(String s) {
        return s.replace("ISBN", "");
    }

    public static String[] getArray(String s) {
        String newString = getNumbers(s);
        return newString.split("-");
    }
}
