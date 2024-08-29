import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class Reg3{
// Validate a Positive Integer
// Problem: Create a regex to match strings that represent a positive integer.
// Example Input: "123", "007", "0", "-123"
// Expected Matches: "123", "007"

    public static void main(String[] args) {
        String regex = "^[0-9]*[1-9][0-9]*$";
        String[] pattern = {"123", "007", "0", "-123"};

        Pattern p = Pattern.compile(regex);

        for (String s: pattern) {
            Matcher m = p.matcher(s);
            if (m.matches()) {
                System.out.println(s + "matches");
            } else {
                System.out.println(s+ " invalid matches");
            }
        }
    }
}
