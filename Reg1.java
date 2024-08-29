import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class Reg1{
//  Validate a Basic Hexadecimal Color Code
// Problem: Create a regex to match valid hexadecimal color codes in the format "# followed by exactly 3 or 6 hexadecimal digits".
// Example Input: "#FFF", "#123456", "#ABC", "#GHI"
// Expected Matches: "#FFF", "#123456", "#ABC"
public static void main(String[] args) {
String pa="^#[A-Fa-f]{3}|[A-Ba-f]{6}$";
String s= "#FFF";
Pattern p=Pattern.compile(pa);
Matcher m=p.matcher(s); 
if(m.find()){
    System.out.println("matched");
}
else{
    System.out.println("not matched");
}
}

}