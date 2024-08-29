import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Reg1
{
//  Validate a Basic Hexadecimal Color Code
// Problem: Create a regex to match valid hexadecimal color codes in the format "# followed by exactly 3 or 6 hexadecimal digits".
// Example Input: "#FFF", "#123456", "#ABC", "#GHI"
// Expected Matches: "#FFF", "#123456", "#ABC"

    public void regEX1()
{
  String Regex="^#([A-Fa-f0-9]{3}|[A-Fa-f0-9]{6})$";
  Pattern pattern=Pattern.compile(Regex);
  String Strings = "#za";
  Matcher matcher=pattern.matcher(Strings);

    if (matcher.matches()) 
    {
       System.out.println(Strings+" Valid hexadecimal color code");    
    }
    else
    {
        System.out.println(Strings+" Is Not valid Code");
    }
  }
  public static void main(String[] args) 
  {
      Reg1 aobj=new Reg1();
      aobj.regEX1();
    }
}
 
