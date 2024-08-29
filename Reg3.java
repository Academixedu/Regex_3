import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Reg3{
// Validate a Positive Integer
// Problem: Create a regex to match strings that represent a positive integer.
// Example Input: "123", "007", "0", "-123"
// Expected Matches: "123", "007"
public void RegEx ()
{
    String input ="123";
    String string="^(0|[1-9][0-9])";
    Pattern pattern =Pattern.compile(string);
    Matcher match=pattern.matcher(input);


    if (match.find()) 
    {
       System.out.println(input+" Positive Number");    
    }
    else
    {
        System.out.println(input+ " Negative Number");
    }

}
public static void main(String[] args) 
{
  Reg3 aobj=new Reg3();
  aobj.RegEx();    
}
}

