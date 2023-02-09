public class NumberPalindrome {
 public static boolean isPalindrome(int number){
     String reversedString = Integer.toString(number);
     String temp = "";
     for(int i=reversedString.length()-1; i>=0; i--){
         temp+=reversedString.charAt(i);
     }
     if(Integer.parseInt(temp) == number)
        return true;
    
    return false;
 }
}
