import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class Reg4{
// Match a Decimal Number with Optional Leading and Trailing Zeros
// Problem: Create a regex to match a decimal number that allows for optional leading and trailing zeros.
// Example Input: "007.89", "0.123", "3.14", "100", "000.000"
// Expected Matches: "007.89", "0.123", "3.14", "100", "000.000"
public static void LeadingTrailing_Zeroes(String number){
    String pattern="^[0-9]*\\.?[0-9]*$";
    Pattern p = Pattern.compile(pattern);
    Matcher m = p.matcher(number);
    if (m.matches()) {
        System.out.println("valid decimal number : " + number);
    } else {
        System.out.println("invalid decimal number  : " + number);
    }
}
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter your number:");
    String number = sc.nextLine();
    LeadingTrailing_Zeroes(number);
}

}
