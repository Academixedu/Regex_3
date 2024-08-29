import java.util.regex.Pattern;
import java.util.regex.Matcher;
public class Reg3{
// Validate a Positive Integer
// Problem: Create a regex to match strings that represent a positive integer.
// Example Input: "123", "007", "0", "-123"
// Expected Matches: "123", "007"
public static void main(String[] args) {
    String regex = "^[1-9]\\d|^0";
    String s="0";
    Pattern p=Pattern.compile(regex);
    Matcher m=p.matcher(s);
    if(m.find()){
        System.out.println("matched");
    }
    else{
        System.out.println("not matched");
    }
}
}
