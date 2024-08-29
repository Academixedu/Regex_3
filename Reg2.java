import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class Reg2{
// Match Repeated Words in a Sentence
// Problem: Write a regex to find any word that appears more than once in a sentence.
// Example Input: "This is is a test test sentence"
// Expected Matches: "is", "test"



    public static void findRepeatedWords(String word) {
        String Pa= "\\b(\\w+)\\b\\s+\\b\\1\\b";
        
        Pattern p = Pattern.compile(Pa);

        Matcher m = p.matcher(word);
        
        while (m.find()) {
            System.out.println("Repeated word: " + m.group(1));
        }
    }

    public static void main(String[] args) {
        String sentence = "This is is a test test sentence";

        findRepeatedWords(sentence);
    }
}
