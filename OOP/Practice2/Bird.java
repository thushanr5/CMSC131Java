//Bird is a child class of Animal and Animal is the parent class
//Bird cannot be created without Animal parameters
//Bird has to be created the same and thus super is used

public class Bird extends Animal{

	public Bird(String eyeColor, int numberOfEyes, String teethColor, int numberOfLegs, String sound) {
		super(eyeColor, numberOfEyes, teethColor, numberOfLegs, sound);
		// TODO Auto-generated constructor stub
	}


	public void fly() {
		System.out.println("Flying...");
	}
		
}
