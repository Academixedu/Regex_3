public class Reg3{
// Validate a Positive Integer
// Problem: Create a regex to match strings that represent a positive integer.
// Example Input: "123", "007", "0", "-123"
// Expected Matches: "123", "007"
    public static void main(String[] args) {
        String regex = "^0*[1-9][0-9]*$"; 
        String[] testStrings = {"123", "007", "0", "-123"};

        for (String str : testStrings) {
            if (str.matches(regex)) {
                System.out.println(str + " is a positive integer.");
            } else {
                System.out.println(str + " is not a positive integer.");
            }
        }
    }
}



