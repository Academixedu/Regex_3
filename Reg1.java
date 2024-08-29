
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class Reg1{
//  Validate a Basic Hexadecimal Color Code
// Problem: Create a regex to match valid hexadecimal color codes in the format "# followed by exactly 3 or 6 hexadecimal digits".
// Example Input: "#FFF", "#123456", "#ABC", "#GHI"
// Expected Matches: "#FFF", "#123456", "#ABC"

    public static void main(String[] args) {
        String regex = "#[0-9a-fA-F]{3}(?:[0-9a-fA-F]{3})?";
        Pattern p = Pattern.compile(regex);
        
        String[] hexCodes = {"#FFF", "#123456", "#ABC", "#GHI"};
        for (String code : hexCodes) {
            Matcher m = p.matcher(code);
            if (m.matches()) {
                System.out.println(code +" is a valid Hexdecimal color code");
            } else {
                System.out.println(code +" is not a valid Hexdecimal color code");
            }
        
        }
    }
    
}
