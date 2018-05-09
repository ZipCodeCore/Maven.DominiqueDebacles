package Chapter3;

public class ISBNUtilities {
    public static String getNumbers(String s) {
        return s.replace("ISBN", "");
    }

    public static String[] getArray(String s) {
        String newString = s.replace("ISBN", "");
        return newString.split("-");
    }
}
