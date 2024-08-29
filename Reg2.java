import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class Reg2{
// Match Repeated Words in a Sentence
// Problem: Write a regex to find any word that appears more than once in a sentence.
// Example Input: "This is is a test test sentence"
// Expected Matches: "is", "test"
public static void main(String[] args) {
    String s = "This is is a test test sentence";
    String regex = "\\b(\\w+)\\b(?=.*\\b\\1\\b)";

     Pattern pattern = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);

// Create a matcher for the input string
Matcher matcher = pattern.matcher(s);

// Find and print all repeated words
while (matcher.find()) {
    System.out.println("Repeated word: " + matcher.group(1));
}
}


}
