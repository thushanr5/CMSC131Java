package LearningFiles;

public class Zoo {
	
	//Calling of the Animal class
	public static void main(String[] args) {
		Animal lion = new Animal("black",2,"yellow",2,"roar");
		lion.speak();
		lion.teethColorMove();
			
		Bird bird1 = new Bird("black",2,"yellow",2,"roar");
		bird1.fly(); //Accesible methods include methods in Bird class + Animal class because the bird is the child class of the super class Animal
		
	}

}

