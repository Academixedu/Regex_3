import java.util.function.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class Reg1{
//  Validate a Basic Hexadecimal Color Code
// Problem: Create a regex to match valid hexadecimal color codes in the format "# followed by exactly 3 or 6 hexadecimal digits".
// Example Input: "#FFF", "#123456", "#ABC", "#GHI"
// Expected Matches: "#FFF", "#123456", "#ABC"




    public static boolean validateHexColor(String colorCode) {
        String regex = "^#([A-Fa-f0-9]{3}|[A-Fa-f0-9]{6})$";
        Pattern pattern = Pattern.compile(regex);

        Matcher matcher = pattern.matcher(colorCode);
        return matcher.matches();
    }

    public static void main(String[] args) {
        String[] testCases = {"#FFF", "#123456", "#ABC", "#GHI"};
        for (String code : testCases) {
            System.out.println("Hex Code: " + code + " - Valid: " + validateHexColor(code));
        }
    }
}


