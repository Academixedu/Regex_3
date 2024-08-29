//public class Reg4{
// Match a Decimal Number with Optional Leading and Trailing Zeros
// Problem: Create a regex to match a decimal number that allows for optional leading and trailing zeros.
// Example Input: "007.89", "0.123", "3.14", "100", "000.000"
// Expected Matches: "007.89", "0.123", "3.14", "100", "000.000"
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Reg44 {
    public static void main(String[] args) {
        String regex = "^0*([1-9][0-9]*|0)(\\.[0-9]*)?$";
        Pattern a = Pattern.compile(regex);
        String[] testCases = { "007.89", "0.123", "3.14", "100", "000.000", "000", "123.", ".456", "000.1230" };

        for (String test : testCases) {
            Matcher b = a.matcher(test);
            if (b.matches()) {
                System.out.println(test + " is a valid decimal number.");
            } else {
                System.out.println(test + " is not a valid decimal number.");
            }
        }
    }
}

