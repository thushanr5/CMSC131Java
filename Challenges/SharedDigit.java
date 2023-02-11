public class SharedDigit {
    public static boolean hasSharedDigit(int num, int num2){
        int currOne, currThree, currTwo,currFour = 0;
        if((Math.abs(num) >=10 && Math.abs(num) <=99) && (Math.abs(num2) >=10 && Math.abs(num2) <=99)){
                currOne = num % 10;
                currTwo = (num/10) % 10;
                currThree = num2 % 10;
                currFour = (num2/10) % 10;
        
                if((currOne == currThree) || (currOne == currFour || (currTwo == currThree) || (currTwo == currFour)))
                    return true;
        }
        return false;
    }
}
