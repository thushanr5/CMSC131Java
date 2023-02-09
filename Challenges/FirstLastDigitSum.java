public class FirstLastDigitSum {
    // write your code here
    public static int sumFirstAndLastDigit(int number){
        int firstDigit, Digit, lastDigit,sumOfDigits = 0;
        if(number >=0){
            // for(int i=number; i>0; i--){
                lastDigit = number % 10;
                if(number < 10){
                    Digit = number;
                }else{
                     Digit = number / 10;
                while(Digit > 9)
                    Digit/=10;
                }
            // }
            return Digit + lastDigit;
        }
       return -1;
    }
}
