import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class Reg3{
// Validate a Positive Integer
// Problem: Create a regex to match strings that represent a positive integer.
// Example Input: "123", "007", "0", "-123"
// Expected Matches: "123", "007"
public static void main(String[] args) {

    String regex = "\\d+";
    Pattern p = Pattern.compile(regex);

    String[] numbers = {"123", "007", "0", "-123"};
    for (String number : numbers) {
        Matcher m = p.matcher(number);
        if (m.matches()) {
            System.out.println(number + " is a positive integer.");
        } else {
            System.out.println(number + " is not a positive integer.");
        }
    }
}
}
