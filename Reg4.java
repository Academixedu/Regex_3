import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class Reg4{
// Match a Decimal Number with Optional Leading and Trailing Zeros
// Problem: Create a regex to match a decimal number that allows for optional leading and trailing zeros.
// Example Input: "007.89", "0.123", "3.14", "100", "000.000"
// Expected Matches: "007.89", "0.123", "3.14", "100", "000.000"



    public static void ValidDecimal(String input) {
        String decimalPattern = "^0*\\d+(\\.\\d+)?$|^0*\\.\\d+$";
        
        Pattern pattern = Pattern.compile(decimalPattern);
        
        Matcher m= pattern.matcher(input);


        if(m.matches()){
            System.out.println("matched :"+input);
        }
        else{
            System.out.println("not matched "+input);
        }
        
    }

    public static void main(String[] args) {
            ValidDecimal( "007.89");
            ValidDecimal(  "0.123");
            ValidDecimal( "3.14");
            ValidDecimal( "100");
            ValidDecimal(  "000.000");

        



        }
    }

