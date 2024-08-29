import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Reg3{
// Validate a Positive Integer
// Problem: Create a regex to match strings that represent a positive integer.
// Example Input: "123", "007", "0", "-123"
// Expected Matches: "123", "007"
public static void main(String args[]){
 String code="0";
    String pattern="^[1-9]\\d*|0$";
    Pattern p=Pattern.compile(pattern);
    Matcher m=p.matcher(code);
    if(m.find()){
        System.out.println(code+" is valid");
    }
    else{
        System.out.println(code+" is invalid");
    }
}
}



