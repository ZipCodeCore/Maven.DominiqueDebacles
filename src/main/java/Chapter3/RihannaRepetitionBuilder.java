package Chapter3;

public class RihannaRepetitionBuilder {
    public static String getVerse(String s) {
        StringBuilder sb = new StringBuilder(s);
        String modifier = s.substring(s.length() - 4);
        for(int i = 0; i < 3; i++) {
            sb.append(modifier);
        }
        return sb.toString();
    }

    public static String getVerse(String s, int numberOfLetters, int numberOfRepetitions) {
        StringBuilder sb = new StringBuilder(s);
        String modifier = s.substring(s.length() - numberOfLetters);
        for(int i = 0; i < numberOfRepetitions; i++) {
            sb.append(modifier);
        }
        return sb.toString();
    }
}
