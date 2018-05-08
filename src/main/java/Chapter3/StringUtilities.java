package Chapter3;

public class StringUtilities {
    public static boolean checkForBad(String s) {
        s = s.toLowerCase();

        if(s.contains("bad"))
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    public static String getGreeting(String s) {
        return "Hello " + s;
    }

    public static String[] toArray(String s) {
        return s.split(" ");
    }

    public static String toString(String[] array) {
        return String.join(" ", array);
    }
}
