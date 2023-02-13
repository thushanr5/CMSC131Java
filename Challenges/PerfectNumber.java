public class PerfectNumber {
    public static boolean isPerfectNumber(int number){
        int sum = 0;
        if(number >= 0){
            for(int num = number; num>=0; num--){
                if(number % num ==0 && num !=number)
                    sum+=num;
        }
        return sum == number ? true : false;
    }
    return false;
}
}
