public class Reg1{
    public static void main(String[] args){
//  Validate a Basic Hexadecimal Color Code
   String[] s={"#FFF", "#123456", "#ABC", "#GHI"};
// Problem: Create a regex to match valid hexadecimal color codes in the format "# followed by exactly 3 or 6 hexadecimal digits".
   String s1="^#[A-Fa-f0-9]{3}|#[0-9]{6}$";
// Example Input: "#FFF", "#123456", "#ABC", "#GHI"
// Expected Matches: "#FFF", "#123456", "#ABC"
    for(String s2:s)  {
          
    if(s2.matches(s1)){
        System.out.println("valid hexadecimal color code"+s2);
   }
   else{
    System.out.println("Not valid hexadecimal color code"+s2);
   }
}
}
}

