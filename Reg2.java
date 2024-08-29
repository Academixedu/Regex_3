import java.util.regex.Pattern;
import java.util.regex.Matcher;
public class Reg2{
// Match Repeated Words in a Sentence
// Problem: Write a regex to find any word that appears more than once in a sentence.
// Example Input: "This is is a test test sentence"
// Expected Matches: "is", "test"
private static void appears(String value){
String pa= "\\\\b(\\\\w+)\\\\b(?=.*\\\\b\\\\1\\\\b)";
 Pattern p=Pattern.compile(pa);
 Matcher m=p.matcher(value);
 while(m.find()){
    System.out.println("not repeat values "+m.group(1));
 }

}

public static void main(String[] args) {
    String s="This is is a test test sentence";
    appears(s);
}
}