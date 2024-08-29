public class Reg3{
    public static void main(String[] args) {
// Validate a Positive Integer
String[] s={"123", "007", "0", "-123"};
// Problem: Create a regex to match strings that represent a positive integer.
String s1="^0*[1-9][0-9]*$";
for(String s3:s){
    if(s3.matches(s1)){
        System.out.println("matches: "+s3);

}
else{
    System.out.println("Not matches: "+s3);
}

// Example Input: "123", "007", "0", "-123"
// Expected Matches: "123", "007"
}
}
}