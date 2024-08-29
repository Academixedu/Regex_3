import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Reg3{
// Validate a Positive Integer
// Problem: Create a regex to match strings that represent a positive integer.
// Example Input: "123", "007", "0", "-123"
// Expected Matches: "123", "007"
public static void PositiveInteger(String Integer){
    String pattern="^[+]?[0-9]+$";
    Pattern p = Pattern.compile(pattern);
    Matcher m = p.matcher(Integer);
    if (m.matches()) {
        System.out.println("PositiveInteger : " + Integer);
    } else {
        System.out.println("Not A PositiveInteger  : " + Integer);
    }
}
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter your integer:");
    String Integer = sc.nextLine();
    PositiveInteger(Integer);
}
}
