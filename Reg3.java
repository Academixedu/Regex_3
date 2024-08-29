import java.util.function.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class Reg3{
// Validate a Positive Integer
// Problem: Create a regex to match strings that represent a positive integer.
// Example Input: "123", "007", "0", "-123"
// Expected Matches: "123", "007"




    
    public static boolean validatePositiveInteger(String number) {
        String regex = "^[1-9]\\d*|0\\d+$";
        Pattern pattern = Pattern.compile(regex);

        Matcher matcher = pattern.matcher(number);
        return matcher.matches();
    }

    public static void main(String[] args) {
        String[] testCases = {"123", "007", "0", "-123"};
        for (String number : testCases) {
            System.out.println("Number: " + number + " - Valid: " + validatePositiveInteger(number));
        }
    }
}


