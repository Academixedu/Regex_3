import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Reg3{
// Validate a Positive Integer
// Problem: Create a regex to match strings that represent a positive integer.
// Example Input: "123", "007", "0", "-123"
// Expected Matches: "123", "007"
     public static void main(String[] args) {
    String[] input = { "123", "007", "0", "-123"};
     String regex = "^(0|[1-9][0-9]*)$";
        Pattern a = Pattern.compile(regex);
        Pattern pattern = Pattern.compile(regex);
        
        for (String i : input) {
            Matcher matcher = pattern.matcher(i);

            if (matcher.matches()) {
                System.out.println(i + " is a valid positive integer.");
            } else {
                System.out.println(i + " is not a valid positive integer.");
            }
        }
     }
}
