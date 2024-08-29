import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Reg3{
    public static void main(String[] args) {
        String s="0123";
        String pattern="^[1-9]\\d*|0$";
        Pattern p = Pattern.compile(pattern);
    Matcher m = p.matcher(s);
    if(m.find())
    {
        System.out.println("valid");
    }
    else{
        System.out.println("invalid");
    }

    }}
// Validate a Positive Integer
// Problem: Create a regex to match strings that represent a positive integer.
// Example Input: "123", "007", "0", "-123"
// Expected Matches: "123", "007"


