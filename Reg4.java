import java.util.regex.Pattern;
import java.util.regex.Matcher;
public class Reg4{
// Match a Decimal Number with Optional Leading and Trailing Zeros
// Problem: Create a regex to match a decimal number that allows for optional leading and trailing zeros.
// Example Input: "007.89", "0.123", "3.14", "100", "000.000"
// Expected Matches: "007.89", "0.123", "3.14", "100", "000.000"
public static void main(String[] args) {
    String regex="[0-9]*\\.?[0-9]+";
    String s=".0";
    Pattern p=Pattern.compile(regex) ;
    Matcher m=p.matcher(s);
    if(m.find()){
        System.out.println("matched");
    }
    else{
        System.out.println("not matched");
    }

}
}
