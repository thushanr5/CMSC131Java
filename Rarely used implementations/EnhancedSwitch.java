public class EnhancedSwitch {
    public static void main(String[]args){
/*
Enhanced Switch Statement format
 */
        int switchValue = 1;
        switch(switchValue){
            case 1 ->System.out.println("Value was 1");
            case 2 ->System.out.println("Value was 2");
            case 3, 4, 5->{
                System.out.println("Was a 3, a 4, or 5");
                System.out.println("Actually it was a " + switchValue);
            }
            default ->System.out.println("Was neither a 1,2,3,4, or 5");
        }

    }



}
