package Chapter3;

public class ISBNUtilities {
    public static String getNumbers(String s) {
        return s.replace("ISBN", "");
    }

    public static String[] getArray(String s) {
        String newString = s.replace("ISBN", "");
        return newString.split("-");
    }

    public static String getFourthSet(String s) {
        String newString = s.replace("ISBN", "");
        String[] array = newString.split("-");
        return array[3];
    }

    public static String getSet(String s, int setNumber) {
        String newString = s.replace("ISBN", "");
        String[] array = newString.split("-");
        return array[setNumber - 1];
    }
}
