//public class Reg3{
// Validate a Positive Integer
// Problem: Create a regex to match strings that represent a positive integer.
// Example Input: "123", "007", "0", "-123"
// Expected Matches: "123", "007"
  import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Reg33{
    public static void main(String[] args) {
        String regex = "^(0|[1-9][0-9]*)$";
        Pattern a = Pattern.compile(regex);
        String[] testCases = { "123", "007", "0", "-123", "12a3", "0001" };

        for (String test : testCases) {
            Matcher b = a.matcher(test);
            if (b.matches()) {
                System.out.println(test + " is a valid positive integer.");
            } else {
                System.out.println(test + " is not a valid positive integer.");
            }
        }
    }
}


