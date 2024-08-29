import java.util.regex.Pattern;
import java.util.regex.Matcher;
import java.util.HashSet;
import java.util.Set;

public class Reg2 {
    private static final String REPEATED_WORD_REGEX = "\\b(\\w+)\\b(?=.*\\b\\1\\b)";

    public static void main(String[] args) {
        String sentence = "This is is a test test sentence";
        Set<String> repeatedWords = new HashSet<>();
        Matcher matcher = Pattern.compile(REPEATED_WORD_REGEX).matcher(sentence);

        while (matcher.find()) {
            repeatedWords.add(matcher.group(1).toLowerCase());
        }

        System.out.println("Repeated words: " + repeatedWords);
    }
}

