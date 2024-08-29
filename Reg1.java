import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class Reg1{
//  Validate a Basic Hexadecimal Color Code
// Problem: Create a regex to match valid hexadecimal color codes in the format "# followed by exactly 3 or 6 hexadecimal digits".
// Example Input: "#FFF", "#123456", "#ABC", "#GHI"
// Expected Matches: "#FFF", "#123456", "#ABC"



    public static void ValidHexColor(String colorCode) {

        String text= "^#([A-Fa-f0-9]{3}|[A-Fa-f0-9]{6})$";
        
        Pattern p = Pattern.compile(text);
        
        Matcher m = p.matcher(colorCode);

        if(m.matches()){
            System.out.println("valid hexa code : "+colorCode);
        }
        else{
            System.out.println("invalid hexa code : "+colorCode);

        }
    }

    // Main method for testing the regex
    public static void main(String[] args) {
        ValidHexColor("#FFF");
        ValidHexColor("#123456");
        ValidHexColor("#ABC");
        ValidHexColor("#GHI");

        }
    }
