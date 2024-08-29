import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class Reg2{
// Match Repeated Words in a Sentence
// Problem: Write a regex to find any word that appears more than once in a sentence.
// Example Input: "This is is a test test sentence"
// Expected Matches: "is", "test"

    public static void main(String[] args) {
        String regex = "\\b(\\w+)(?:\\W+\\1\\b)+";
        Pattern p = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a sentence: ");
        String s = input.nextLine();

        Matcher m = p.matcher(s);
        
        if (m.find()) {
            System.out.println("Repeated words: ");
            while (m.find()) {
                System.out.println(m.group());
            }
        } else {
            System.out.println("No repeated words found.");

        }
    }
}
