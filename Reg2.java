import java.util.HashSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Reg2{
// Match Repeated Words in a Sentence
// Problem: Write a regex to find any word that appears more than once in a sentence.
// Example Input: "This is is a test test sentence"
// Expected Matches: "is", "test"
 public static void main(String[] args) {
        String input = "This is is a test test sentence";
        findRepeatedWords(input);
    }

    public static void findRepeatedWords(String sentence) {
      
        String regex = "\\b(\\w+)\\b\\s+\\b\\1\\b";

        Pattern pattern = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);

       
        Matcher matcher = pattern.matcher(sentence);

        HashSet<String> repeatedWords = new HashSet<>();

        while (matcher.find()) {
            
            repeatedWords.add(matcher.group(1));
        }

       
        for (String word : repeatedWords) {
            System.out.println("Repeated word: " + word);
        }
    }
}
