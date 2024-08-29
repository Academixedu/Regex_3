import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Reg3{
// Validate a Positive Integer
private static final String pi="^[1-9]\\d*$";
// Problem: Create a regex to match strings that represent a positive integer.
public static void main(String[] args){
String tc[] = {"123","007","0","-123"};

// Example Input: "123", "007", "0", "-123"
for(String t : tc){
Matcher matcher = Pattern.compile(pi).matcher(t);
System.out.println(t+":"+(matcher.matches()?"valid" : "Invalid"));

// Expected Matches: "123", "007"
}
}
}
