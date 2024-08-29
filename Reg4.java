import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Reg4{
// Match a Decimal Number with Optional Leading and Trailing Zeros
// Problem: Create a regex to match a decimal number that allows for optional leading and trailing zeros.
// Example Input: "007.89", "0.123", "3.14", "100", "000.000"
// Expected Matches: "007.89", "0.123", "3.14", "100", "000.000"
 public static void main(String[] args) {
        String[] testCases = {"007.89", "0.123", "3.14", "100", "000.000", "123.", ".456", "000"};

        for (String number : testCases) {
            System.out.println(number + " : " + isValidDecimal(number));
        }
    }

    public static boolean isValidDecimal(String number) {
       
        String regex = "^0*\\d+(\\.\\d+)?0*$";

      
        Pattern pattern = Pattern.compile(regex);

       
        Matcher matcher = pattern.matcher(number);

       
        return matcher.matches();
    }
}
