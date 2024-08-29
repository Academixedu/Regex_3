public class Reg1{
//  Validate a Basic Hexadecimal Color Code
// Problem: Create a regex to match valid hexadecimal color codes in the format "# followed by exactly 3 or 6 hexadecimal digits".
// Example Input: "#FFF", "#123456", "#ABC", "#GHI"
// Expected Matches: "#FFF", "#123456", "#ABC"
    public static void main(String[] args) {
        String regex = "^#([A-Fa-f0-9]{3}|[A-Fa-f0-9]{6})$"; 
        String[] testStrings = {"#FFF", "#123456", "#ABC", "#GHI"};

        for (String str : testStrings) {
            if (str.matches(regex)) {
                System.out.println(str + " is a valid hexadecimal color code.");
            } else {
                System.out.println(str + " is not a valid hexadecimal color code.");
            }
        }
    }
}



