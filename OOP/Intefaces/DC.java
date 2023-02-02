//DC is the child class and the parent class is MarvelVerse: Aka super class and subclass
public class DC extends MarvelVerse implements Introducing{

    public DC(String nameOfCharacter, String power, char flyable, int health, int damage, int speed){
        super(nameOfCharacter,power,flyable,flyable,damage,speed);

    }

   @Override
    public void introduce(){
        System.out.println("Welcome Introduce yOU!!!!");
   }
}
