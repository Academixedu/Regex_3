import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Reg3{
// Validate a Positive Integer
// Problem: Create a regex to match strings that represent a positive integer.
// Example Input: "123", "007", "0", "-123"
// Expected Matches: "123", "007"
public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String:");
        String pattern = sc.nextLine();
        String regex = "^[0-9]*[1-9][0-9]*$";
        
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(pattern);
        
        if (pattern.matches(regex)) {
            System.out.println(pattern + " Matches.");
        } else {
            System.out.println(pattern + " Does not Matches.");
        }
    } 
}
