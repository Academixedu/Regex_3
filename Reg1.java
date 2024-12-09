import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Reg1{
//  Validate a Basic Hexadecimal Color Code
// Problem: Create a regex to match valid hexadecimal color codes in the format "# followed by exactly 3 or 6 hexadecimal digits".
// Example Input: "#FFF", "#123456", "#ABC", "#GHI"ss
// Expected Matches: "#FFF", "#123456", "#ABC"

public static void main(String[] args) {
   String input="#ZA";

   Pattern pattern=Pattern.compile("^#([A-Fa-f0-9]{3}|[A-Fa-f0-9]{6})");
   Matcher matcher=pattern.matcher(input);

   
if (matcher.find()) {
    System.out.println(input+": Input is valid Hexadecimal Color Code");
} else {
    System.out.println(input+" :Input is Invalid Hexadecimal Color Code");
}



//     String inputString = "This is a string with 123 numbers 456 and 789.";

//         Pattern pattern = Pattern.compile("\\d+");
//         Matcher matcher = pattern.matcher(inputString);
//         while (matcher.find()) {
//             String digit = matcher.group();
//             System.out.println(digit);
//         }
// }



}
}
