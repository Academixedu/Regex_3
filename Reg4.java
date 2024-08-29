public class Reg4 {
    public static void main(String[] args) {
        String[] testCases = {"007.89", "0.123", "3.14", "100", "000.000", "abc", "12.34.56", "3."};

        for (String testCase : testCases) {
            if (isValidDecimalOrInteger(testCase)) {
                System.out.println(testCase + " Valid ");
            } else {
                System.out.println(testCase + " NOT valid");
            }
        }
    }

    public static boolean isValidDecimalOrInteger(String input) {

        String regex = "^0*\\d+(\\.\\d+)?$";
        return input.matches(regex);
    }
}
