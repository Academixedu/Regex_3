public class Reg1{
//  Validate a Basic Hexadecimal Color Code
// Problem: Create a regex to match valid hexadecimal color codes in the format "# followed by exactly 3 or 6 hexadecimal digits".
// Example Input: "#FFF", "#123456", "#ABC", "#GHI"
// Expected Matches: "#FFF", "#123456", "#ABC"
  import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class Reg11 {
    public static void main(String[] args) {
        String regex = "^#([0-9A-Fa-f]{3}|[0-9A-Fa-f]{6})$";
        Pattern a= Pattern.compile(regex);
        String[] input = { "#FFF", "#123456", "#ABC", "#GHI" };

        for (String test : input) {
            Matcher b = a.matcher(test);
            if (b.matches()) {
                System.out.println(test + " is a valid hexadecimal color code.");
            } else {
                System.out.println(test + " is not a valid hexadecimal color code.");
            }
        }
    }
}

}
