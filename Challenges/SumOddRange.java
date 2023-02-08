public class SumOddRange {
 
 public static boolean isOdd(int number){
     if(number > 0){
         if(number % 2 !=0)
            return true;
     }
     return false;
 }
 
 public static int sumOdd(int start, int end){
    int dp =0;
    if(end >= start && (start > 0 && end > 0)){
        for(int beggining = start; beggining <=end; beggining++){
            if(isOdd(beggining))
                dp+=beggining;
        }
        return dp;
    }
    return -1;
}

}
 
