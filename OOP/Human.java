//Example class 
public class Human {

	String name;
	int age;
	int heightInInches;
	String eyeColor;
	
	//Constructor
	public Human() {
		
	}
	
	
	public void speak() {
		System.out.println("Hello, my name is " + name);
		System.out.println("I am " + heightInInches + " inches tall");
		System.out.println("My age is " + age);
		System.out.println("My eye color is " + eyeColor);	
	}
	
	public  void eat() {
		System.out.println("eating...");
	}
	
	public void walk() {
		System.out.println("walking...");
	}
	
	public void work() {
		System.out.println("working...");
	}
	
	
}
