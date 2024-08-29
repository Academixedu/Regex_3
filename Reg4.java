import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Reg4{
// Match a Decimal Number with Optional Leading and Trailing Zeros
// Problem: Create a regex to match a decimal number that allows for optional leading and trailing zeros.
// Example Input: "007.89", "0.123", "3.14", "100", "000.000"
// Expected Matches: "007.89", "0.123", "3.14", "100", "000.000"
public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String:");
        String pattern = sc.nextLine();
        String regex = "^[0-9]{1,3}[.]?[0-9]{1,3}";
        
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(pattern);
        
        if (pattern.matches(regex)) {
            System.out.println(pattern + " Matches.");
        } else {
            System.out.println(pattern + " Does not Matches.");
        }
    }  
}
