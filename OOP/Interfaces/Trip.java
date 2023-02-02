public class Trip{
    String nameOfPerson;
    String currency;
    int age;

    int moneyLeftDollars;

    public Trip(String nameOfPerson, String currency, int age, int moneyLeftDollars){
        this.nameOfPerson = nameOfPerson;
        this.currency = currency;
        this.age = age;
        this.moneyLeftDollars = moneyLeftDollars;
    }

    public void setCurrency(String currency){
        this.currency = currency;
    }

    public void setNameOfPerson(String nameOfPerson){
        this.nameOfPerson = nameOfPerson;
    }

    public int getMoney(int moneyLeftDollars){
        return this.moneyLeftDollars;
    }

    public void introduce(){
        System.out.println("Welcome to the trip to Sri Lanka: " + this.nameOfPerson);
    }

}
