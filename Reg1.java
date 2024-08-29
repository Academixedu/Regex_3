import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Reg1{
//  Validate a Basic Hexadecimal Color Code
// Problem: Create a regex to match valid hexadecimal color codes in the format "# followed by exactly 3 or 6 hexadecimal digits".
// Example Input: "#FFF", "#123456", "#ABC", "#GHI"
// Expected Matches: "#FFF", "#123456", "#ABC"
public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String:");
        String pattern = sc.nextLine();
        String regex = "^#([A-Fa-f0-9]{3}|[A-Fa-f0-9]{6})$";
        
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(pattern);
        
        if (pattern.matches(regex)) {
            System.out.println(pattern + " Matches.");
        } else {
            System.out.println(pattern + " Does not Matches.");
        }
    }  
}
