import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Reg4{
// Match a Decimal Number with Optional Leading and Trailing Zeros
// Problem: Create a regex to match a decimal number that allows for optional leading and trailing zeros.
// Example Input: "007.89", "0.123", "3.14", "100", "000.000"
// Expected Matches: "007.89", "0.123", "3.14", "100", "000.000"
public static void main(String[] args) {
        String[] input = { "007.89", "0.123", "3.14", "100", "000.000", "123.", ".456", "0.0", "000", "1" };
        String regex = "^(0|[1-9]\\d*)?(\\.\\d+)?$";
        Pattern pattern = Pattern.compile(regex);
        for (String i : input) {
            Matcher matcher = pattern.matcher(i);

            if (matcher.matches()) {
                System.out.println(i + " is a valid decimal number.");
            } else {
                System.out.println(i + " is not a valid decimal number.");
            }
        }
    }
}
