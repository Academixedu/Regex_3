import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Reg4{
// Match a Decimal Number with Optional Leading and Trailing Zeros
// Problem: Create a regex to match a decimal number that allows for optional leading and trailing zeros.
// Example Input: "007.89", "0.123", "3.14", "100", "000.000"
// Expected Matches: "007.89", "0.123", "3.14", "100", "000.000"
public void RegEx()
{
   Scanner s=new Scanner(System.in);
   System.out.println("Enter The Value => ");
   String string="^[0-9]{1,3}[.]?[0-9]{1,3}";
   Pattern p=Pattern.compile(string);
   Matcher matcher=p.matcher(string);

   if (matcher.matches()) 
   {
     System.out.println(string +" Input is Valid"); 
   }
   else
   {
    System.out.println(string+" Input is Invalid");
   }
}
public static void main(String[] args) 
{
    Reg4 aobj=new Reg4();
    aobj.RegEx();

}

}
