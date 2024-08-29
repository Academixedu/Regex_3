
    // Match a Decimal Number with Optional Leading and Trailing Zeros
    // Problem: Create a regex to match a decimal number that allows for optional leading and trailing zeros.
    // Example Input: "007.89", "0.123", "3.14", "100", "000.000"
    // Expected Matches: "007.89", "0.123", "3.14", "100", "000.000"
    import java.util.regex.Matcher;
    import java.util.regex.Pattern;
    
    public class Reg4 {
        public static boolean validateDecimalNumber(String number) {
            String regex = "^0*\\d+(\\.\\d+)?0*$";
            Pattern pattern = Pattern.compile(regex);
    
    
            Matcher matcher = pattern.matcher(number);
            return matcher.matches();
        }
    
        public static void main(String[] args) {
            String[] testCases = {"007.89", "0.123", "3.14", "100", "000.000", "abc", "-1.23"};
            for (String number : testCases) {
                System.out.println("Number: " + number + " - Valid: " + validateDecimalNumber(number));
            }
        }
    }