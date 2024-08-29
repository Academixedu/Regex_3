public class Reg4{
    public static void main(String[] args) {
// Match a Decimal Number with Optional Leading and Trailing Zeros
String[] s={ "007.89", "0.123", "3.14", "100", "000.000"};
String s1="^0*[0-9]+(\\.0*[0-9]+)?$";
  for(String s3:s){
    if(s3.matches(s1)){
        System.out.println("If matches: "+s3);
    }
    else{
        System.out.println("If does not matches: "+s3);
    }
  }

// Problem: Create a regex to match a decimal number that allows for optional leading and trailing zeros.
// Example Input: "007.89", "0.123", "3.14", "100", "000.000"
// Expected Matches: "007.89", "0.123", "3.14", "100", "000.000"
}
}
