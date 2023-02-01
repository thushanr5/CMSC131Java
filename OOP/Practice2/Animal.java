//Exercise creating an Animal class 

public class Animal {
	//Instance Variables
	String eyeColor;
	int numberOfEyes;
	String teethColor;
	int numberOfLegs;
	String sound;
	
	public Animal(String eyeColor, int numberOfEyes, String teethColor, int numberOfLegs, String sound) {
		this.eyeColor = eyeColor;
		this.numberOfEyes = 2;
		this.teethColor = teethColor;
		this.numberOfLegs = 2;
		this.sound = sound;
	}
	
	public void speak() {
		System.out.println("Usually animals can't talk but I can say " + sound);
	}
	
	public void teethColorMove() {
		System.out.println("My teeth color is " + teethColor);
	}
}
