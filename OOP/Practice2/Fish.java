//First is child of Animal and extends base functionality of Animal
public class Fish extends Animal{
		
	public Fish(String eyeColor, int numberOfEyes, String teethColor, int numberOfLegs, String sound) {
		super(eyeColor, numberOfEyes, teethColor, numberOfLegs, sound);
		// TODO Auto-generated constructor stub
	}

	public void swim() {
		System.out.println("I can swim");
	}
}
