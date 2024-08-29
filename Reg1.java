public class Reg1 {

    public static void main(String[] args) {
        String[] testCases = {"#FFF", "#123456", "#ABC", "#GHI"};

        for (String colorCode : testCases) {
            if (isValidHexColor(colorCode)) {
                System.out.println(colorCode + "Valid.");
            } else {
                System.out.println(colorCode + "NOT valid");
            }
        }
    }

    public static boolean isValidHexColor(String colorCode) {

        String regex = "^#([A-Fa-f0-9]{3}|[A-Fa-f0-9]{6})$";
        return colorCode.matches(regex);
    }
}
