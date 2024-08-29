import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Reg4{
// Match a Decimal Number with Optional Leading and Trailing Zeros
// Problem: Create a regex to match a decimal number that allows for optional leading and trailing zeros.
// Example Input: "007.89", "0.123", "3.14", "100", "000.000"
// Expected Matches: "007.89", "0.123", "3.14", "100", "000.000"
public static void main(String args[]){
 String code="3.140";
 String pattern = ".*0.*";
//  "^0*\\d+(\\.\\d+)?0*$";

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



