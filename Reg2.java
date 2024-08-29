
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Reg2 {
    // Match Repeated Words in a Sentence
    // Problem: Write a regex to find any word that appears more than once in a sentence.
    // Example Input: "This is is a test test sentence"
    // Expected Matches: "is", "test"

    public static void main(String[] args) {
        String sentence = "This is is a test test sentence";  // Example input

        // Regex to find repeated words
        String regex = "\\b(\\w+)\\b(?:\\s+\\1\\b)+";
        Pattern pattern = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(sentence);

        while (matcher.find()) {
            System.out.println("Repeated word: " + matcher.group(1));
        }
    }
}


