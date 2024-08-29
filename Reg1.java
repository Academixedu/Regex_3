import java.util.regex.Pattern;
import java.util.regex.Matcher;
public class Reg1{
//  Validate a Basic Hexadecimal Color Code
// Problem: Create a regex to match valid hexadecimal color codes in the format "# followed by exactly 3 or 6 hexadecimal digits".
// Example Input: "#FFF", "#123456", "#ABC", "#GHI"
// Expected Matches: "#FFF", "#123456", "#ABC"
private static void hexacolorcode(String value){
 String pattern= "^#([A-Fa-f0-9]{3}|[A-Fa-f0-9]{6})$";
 Pattern p=Pattern.compile(pattern);
 Matcher m=p.matcher(value);
 if(m.matches()){
    System.out.println("color code matches: "+value);
 }
 else{
    System.out.println("color code not matches: "+value);
 }
}

public static void main(String[] args) {
    hexacolorcode("#FFF");
    hexacolorcode("#123456");
    hexacolorcode("#ABC");
    hexacolorcode("#GHI");
    
   
    }
}

