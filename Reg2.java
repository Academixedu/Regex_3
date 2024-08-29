import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class Reg2{
// Match Repeated Words in a Sentence
// Problem: Write a regex to find any word that appears more than once in a sentence.
// Example Input: "This is is a test test sentence"
// Expected Matches: "is", "test"

public static void RepeatedWords(String Sentence){
    String pattern="\\b(\\w+)\\b\\s+\\1\\b";
    Pattern p = Pattern.compile(pattern, Pattern.CASE_INSENSITIVE);
    Matcher m = p.matcher(Sentence);
    while (m.find()) {
        System.out.println("Repeated word: " + m.group(1));
    }
    System.out.println("not a repeated word: " +Sentence);

}
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter your sentence:");
    String Sentence = sc.nextLine();
    RepeatedWords(Sentence);
}
}