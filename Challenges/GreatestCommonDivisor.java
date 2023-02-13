public class GreatestCommonDivisor {
    public static int getGreatestCommonDivisor(int first, int second){
        int maxNum = 0;
        if(first >=10 && second >=10){
            for(int firstNum = first; firstNum >=0; firstNum--){
               for(int secondNum = second; secondNum >=0; secondNum--){
                   if(first % firstNum == 0 && second % secondNum ==0)
                        if(firstNum > maxNum)
                            maxNum = firstNum;
               }
            }
            return maxNum;
        }
        return -1;
    }
}
