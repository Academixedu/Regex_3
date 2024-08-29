import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Reg2 {
    public static void main(String[] args) {
        String input = "This is is a test test sentence";
        findRepeatedWords(input);
    }

    public static void findRepeatedWords(String input) {
        
        String regex = "\\b(\\w+)\\b\\s+\\b\\1\\b";
        Pattern pattern = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(input);

        while (matcher.find()) {
            System.out.println("Repeated word: " + matcher.group(1));
        }
    }
}

