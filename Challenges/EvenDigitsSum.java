public class EvenDigitSum {
  public static int getEvenDigitSum(int number){
      int temp=0;
    if(number >=0){
        for(int num = number; num >0; num/=10){
            int dp= num % 10;
            if(dp % 2 ==0)
                temp+=dp;
        }
        return temp;
    }
    return -1;
  }
}
