import java.util.regex.Pattern;
import java.util.regex.Matcher;
public class Reg3{
// Validate a Positive Integer
// Problem: Create a regex to match strings that represent a positive integer.
// Example Input: "123", "007", "0", "-123"
// Expected Matches: "123", "007"
// Expected Matchesimport java.util.regex.Matcher;

    public static void regexinteger(String input) {
        String Pat = "^[1-9]\\d*$|^0\\d+$";

        Pattern pattern = Pattern.compile(Pat);

        Matcher matcher = pattern.matcher(input);

        if(matcher.matches()){
            System.out.println("matches "+input);
        }
        else{
            System.out.println("not matched "+input);
        }
        }
        
    public static void main(String[] args) {
        regexinteger("123");
        regexinteger("007");
        regexinteger("0");
        regexinteger("-123");



}
}