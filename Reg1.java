import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class Reg1{
//  Validate a Basic Hexadecimal Color Code
// Problem: Create a regex to match valid hexadecimal color codes in the format "# followed by exactly 3 or 6 hexadecimal digits".
// Example Input: "#FFF", "#123456", "#ABC", "#GHI"
// Expected Matches: "#FFF", "#123456", "#ABC"

    public static void Hexadecimal(String colorCode){
        String pattern="^#([a-fA-F0-9]{3}|[a-fA-F0-9]{6})$";
        Pattern p = Pattern.compile(pattern);
        Matcher m = p.matcher(colorCode);
        if (m.matches()) {
            System.out.println("ColorCode: " + colorCode);
        } else {
            System.out.println("Not A colocode : " + colorCode);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your color code:");
        String colorCode = sc.nextLine();
        Hexadecimal(colorCode);
    }

}
