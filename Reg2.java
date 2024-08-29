import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Reg2{
// Match Repeated Words in a Sentence
// Problem: Write a regex to find any word that appears more than once in a sentence.
// Example Input: "This is is a test test sentence"
// Expected Matches: "is", "test"
public static void main(String[] args) {
        String pattern = "This is IS  a test test sentence";
        String regex = "\\b(\\w+)\\b\\s+\\1\\b";

        Pattern p = Pattern.compile(regex,Pattern.CASE_INSENSITIVE);
        Matcher m = p.matcher(pattern);

        while (m.find()) {
            System.out.println( m.group(1)  );
        }
    }
}