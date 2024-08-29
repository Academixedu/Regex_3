
    // Match Repeated Words in a Sentence
    // Problem: Write a regex to find any word that appears more than once in a sentence.
    // Example Input: "This is is a test test sentence"
    // Expected Matches: "is", "test"
    import java.util.regex.Matcher;
    import java.util.regex.Pattern;
    
    public class Reg2 {
        public static void findRepeatedWords(String sentence) {
            String regex = "\\b(\\w+)\\b\\s+\\1\\b";
            Pattern pattern = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);
    
    
            Matcher matcher = pattern.matcher(sentence);
    
            System.out.println("Input Sentence: \"" + sentence + "\"");
            System.out.print("Repeated Words: ");
            boolean found = false;
            while (matcher.find()) {
                System.out.print(matcher.group(1) + " ");
                found = true;
            }
    
            if (!found) {
                System.out.print("None");
            }
    
            System.out.println();
        }
    
        public static void main(String[] args) {
            String[] testCases = {
                "This is is a test test sentence",
                "No repetition here",
                "Repeat repeat repeat"
            };
            for (String sentence : testCases) {
                findRepeatedWords(sentence);
            }
        }
    }