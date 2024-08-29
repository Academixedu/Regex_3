import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Reg1{
    public static void main(String[] args) {
        String pattern="^#([A-Fa-f0-9]{3}|[A-Fa-f0-9]{6})$";
        String name="#1234Ab";
        Pattern p = Pattern.compile(pattern);
    Matcher m = p.matcher(name);
    if(m.find())
    {
        System.out.println("valid");
    }
    else{
        System.out.println("invalid");
    }

    }
//  Validate a Basic Hexadecimal Color Code
// Problem: Create a regex to match valid hexadecimal color codes in the format "# followed by exactly 3 or 6 hexadecimal digits".
// Example Input: "#FFF", "#123456", "#ABC", "#GHI"
// Expected Matches: "#FFF", "#123456", "#ABC"
}
