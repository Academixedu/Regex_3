import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Reg3{
// Validate a Positive Integer
// Problem: Create a regex to match strings that represent a positive integer.
// Example Input: "123", "007", "0", "-123"
// Expected Matches: "123", "007"

public static void main(String[] args) {
   String input="-123";

   Pattern pattern=Pattern.compile("^(0|[1-9][0-9]*)");
   Matcher matcher=pattern.matcher(input);

   
if (matcher.find()) {
    System.out.println(input+": Input is valid ");
} else {
    System.out.println(input+" :Input is Invalid Number is Negative");
}


}
}
