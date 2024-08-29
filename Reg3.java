public class Reg3 {
    public static void main(String[] args) {
        String[] testCases = {"123", "007", "0", "-123"};

        for (String testCase : testCases) {
            if (isValidPositiveInteger(testCase)) {
                System.out.println(testCase + " Valid");
            } else {
                System.out.println(testCase + "NOT valid");
            }
        }
    }

    public static boolean isValidPositiveInteger(String input) {

        String regex = "^[1-9]\\d*$";
        return input.matches(regex);
    }
}
