import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Reg1 {
    // Regex to match hexadecimal color codes
    private static final String s1 = "^#([0-9A-Fa-f]{3}|[0-9A-Fa-f]{6})$";
    private static final Pattern s2 = Pattern.compile(s1);

    public static void main(String[] args) {
        // Test cases
        String[] testCases = {"#FFF", "#123456", "#ABC", "#GHI", "#12345", "#1234567"};
        
        for (String testCase : testCases) {
            Matcher matcher = s2.matcher(testCase);
            System.out.println(testCase + ": " + (matcher.matches() ? "Valid" : "Invalid"));
        }
    }
}

