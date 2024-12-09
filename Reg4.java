import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Reg4{
// Match a Decimal Number with Optional Leading and Trailing Zeros
// Problem: Create a regex to match a decimal number that allows for optional leading and trailing zeros.
// Example Input: "007.89", "0.123", "3.14", "100", "000.000"
// Expected Matches: "007.89", "0.123", "3.14", "100", "000.000"


public static void main(String[] args) {
    Scanner s=new Scanner(System.in);
    System.out.print("Enter a Num:");
    String input=s.nextLine();


    Pattern pattern=Pattern.compile("^[0-9]{1,3}[.]?[0-9]{1,3}");
    Matcher matcher=pattern.matcher(input);

    if(matcher.find()){
        System.out.println("Input is valid");
    }else{
        System.out.println("Input is Invalid");
    }


}

}
