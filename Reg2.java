public class Reg2{
// Match Repeated Words in a Sentence
// Problem: Write a regex to find any word that appears more than once in a sentence.
// Example Input: "This is is a test test sentence"
// Expected Matches: "is", "test"
  import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Reg22 {
    public static void main(String[] args) {
        String regex = "\\b(\\w+)\\b(?=.*\\b\\1\\b)";
        Pattern a = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);
        String input = "This is is a test test sentence";
        Matcher b = a.matcher(input);
        StringBuilder results = new StringBuilder();
        while (b.find()) {
            String word = b.group(1);
            if (results.indexOf(word) == -1) {
                results.append(word).append(" ");
            }
        }
        System.out.println("Repeated words: " + results.toString().trim());
    }
}

}
