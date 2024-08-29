public class Reg4{
// Match a Decimal Number with Optional Leading and Trailing Zeros
// Problem: Create a regex to match a decimal number that allows for optional leading and trailing zeros.
// Example Input: "007.89", "0.123", "3.14", "100", "000.000"
// Expected Matches: "007.89", "0.123", "3.14", "100", "000.000"
    public static void main(String[] args) {
        String regex = "^0*[0-9]+(\\.0*[0-9]+)?$"; 
        String[] testStrings = {"007.89", "0.123", "3.14", "100", "000.000"};

        for (String str : testStrings) {
            if (str.matches(regex)) {
                System.out.println(str + " is a valid decimal number.");
            } else {
                System.out.println(str + " is not a valid decimal number.");
            }
        }
    }
}


