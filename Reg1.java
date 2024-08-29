import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class Reg1{
//  Validate a Basic Hexadecimal Color Code
// Problem: Create a regex to match valid hexadecimal color codes in the format "# followed by exactly 3 or 6 hexadecimal digits".
// Example Input: "#FFF", "#123456", "#ABC", "#GHI"
// Expected Matches: "#FFF", "#123456", "#ABC"
public static void main(String[] args) {

    String[] inputs = {"#FFF", "#123456", "#ABC", "#GHI"};

    String regex = "^#([A-Fa-f0-9]{3}|[A-Fa-f0-9]{6})$";
    Pattern pattern = Pattern.compile(regex);
    for (String input : inputs) {
        Matcher matcher = pattern.matcher(input);
        if (matcher.matches()) {
            System.out.println(input + " is a valid hexadecimal.");
        } else {
            System.out.println(input + " is NOT a valid hexadecimal.");
        }
    }
}
}
