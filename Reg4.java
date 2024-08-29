import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Reg4 {
    // Regex to match decimal numbers with optional leading and trailing zeros
    private static final String DECIMAL_NUMBER_REGEX = "^[0]*\\d*\\.?\\d*[0]*$";

    public static void main(String[] args) {
        // Test inputs
        String[] testCases = {"007.89", "0.123", "3.14", "100", "000.000"};

        for (String testCase : testCases) {
            Matcher matcher = Pattern.compile(DECIMAL_NUMBER_REGEX).matcher(testCase);
            System.out.println(testCase + ": " + (matcher.matches() ? "Valid" : "Invalid"));
        }
    }
}

