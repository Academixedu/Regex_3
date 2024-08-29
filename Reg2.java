public class Reg2{
    public static void main(String[] args) {
    // Match Repeated Words in a Sentence
    String s1="This is is a test test sentence";
    String[] s=s1.split("\\s+");
   for(int i=0;i<s.length;i++){
    for(int j=i+1;j<s.length;j++){
        if(s[i].equals(s[j])){
            System.out.println("Repeated word: " + s[i]);
        }
    }
   }
// Problem: Write a regex to find any word that appears more than once in a sentence.
// Example Input: "This is is a test test sentence"
// Expected Matches: "is", "test"
}
}