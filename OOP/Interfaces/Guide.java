public class Guide extends Trip implements Meal{
    int relaxLevel;
    String food;
    public Guide(String nameOfPerson, String currency, int age, int moneyLeftDollars){
        super(nameOfPerson,currency,age,moneyLeftDollars);
    }
    public void travelTips(){
        System.out.println("The tips for enjoying your stay in Sri Lanka include " + this.nameOfPerson);
    }

    public double currencyConvert(){
        return (0.012 * this.moneyLeftDollars);
    }

    @Override
    public void eat(){
        System.out.println("The dinner " + this.nameOfPerson + " had was Hoppers");
    }


}
