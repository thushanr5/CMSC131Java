public class Trip2 extends Guide implements Meal{

    public Trip2(String nameOfPerson, String currency, int age, int moneyLeftDollars){
        super(nameOfPerson,currency,age,moneyLeftDollars);
    }

 
    public void eat(){
        System.out.println("The dinner " + this.nameOfPerson + " had was rolls");
    }



}
