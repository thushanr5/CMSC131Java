public class TripRun {

    public static void main(String[]args){
        Guide AdultSriLanka = new Guide("Sudath","Rupees",52,5000);
        Guide ChildSriLanka = new Guide("Thushan","Rupees",17,3000);
        Trip2 Adult2SriLanka = new Trip2("Chandrika","Rupees",50, 5300);

        AdultSriLanka.introduce();
        Adult2SriLanka.introduce();
        ChildSriLanka.introduce();
        AdultSriLanka.eat();
        Adult2SriLanka.eat();
        System.out.println(AdultSriLanka.nameOfPerson + "'s current pocket money in US dollars is " +  AdultSriLanka.currencyConvert());
        System.out.println(Adult2SriLanka.nameOfPerson + "'s current pocket money in US dollars is " +  Adult2SriLanka.currencyConvert());

    }

}
