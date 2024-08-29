import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class Reg1{
//  Validate a Basic Hexadecimal Color Code
// Problem: Create a regex to match valid hexadecimal color codes in the format "# followed by exactly 3 or 6 hexadecimal digits".
// Example Input: "#FFF", "#123456", "#ABC", "#GHI"
// Expected Matches: "#FFF", "#123456", "#ABC"

    public static void main(String[] args) {
        String regex = "^#([A-Fa-f0-9]{3}|[A-Fa-f0-9]{6})$";
        String[] colorCodes = {"#FFF", "#123456", "#ABC", "#GHI"};

        Pattern pattern = Pattern.compile(regex);

        for (String s: colorCodes) {
            Matcher m = pattern.matcher(s);
            if (m.matches()) {
                System.out.println(s + " is a valid hexadecimal color code");
            } else {
                System.out.println(s+ " is not a valid hexadecimal color code");
            }
        }
    }
}

