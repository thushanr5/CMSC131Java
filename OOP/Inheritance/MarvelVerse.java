public class MarvelVerse
{
    String nameOfCharacter;
    String power;
    char flyable;
    int health;
    int damage;

    int speed;
    //Constructor with parameters passed in referring to the global variables
    public MarvelVerse(String nameOfCharacter, String power, char flyable, int health, int damage, int speed){
        this.nameOfCharacter = nameOfCharacter;
        this.power = power;
        this.flyable = flyable;
        this.health = health;
        this.damage = damage;
        this.speed = speed;
    }
    public String getName(){
        return this.nameOfCharacter;
    }

    public String getPower(){
        return this.power;
    }

    public char getFlyable(){
        return this.flyable;
    }

    public int getHealth(){
        return this.health;
    }

    public int getDamage(){
        return this.damage;
    }

    public void introduce(){
        System.out.println("Welcome to the MarvelVerse " + this.nameOfCharacter);
    }

}

