public class LastDigitChecker {
    public static boolean hasSameLastDigit(int num1, int num2, int num3){
        int numOne, numTwo, numThree;
        int points = 0;
        if((num1 >= 10 && num1<=1000) && (num2 >=10 && num2<=1000) && (num3>=10 && num3<=1000)){
            numOne = num1 % 10;
            numTwo = num2 % 10;
            numThree = num3 % 10;
            if(numOne == numTwo)
                points+=2;
            if(numOne == numThree)
                points+=2;
            if(numTwo == numThree)
                points+=2;
          
            if(points >=2)
                return true;
        }
        return false;
    }
    public static boolean isValid(int num){
        if(num >=10 && num<=1000){
            return true;
        }
        return false;
    }
  
    
}
