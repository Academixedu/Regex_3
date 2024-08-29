import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Reg3{
// Validate a Positive Integer
// Problem: Create a regex to match strings that represent a positive integer.
// Example Input: "123", "007", "0", "-123"
// Expected Matches: "123", "007"
public static void main(String[] args) {
        String[] testCases = {"123", "007", "0", "-123", "42", "00123"};

        for (String number : testCases) {
            System.out.println(number + " : " + isValidPositiveInteger(number));
        }
    }

    public static boolean isValidPositiveInteger(String number) {
      
        String regex = "^(?!0+$)\\d+$";

       
        Pattern pattern = Pattern.compile(regex);

        Matcher matcher = pattern.matcher(number);

       
        return matcher.matches();
    }
}
