public class MilkWay {
	public static void main(String[]args) {
	Spaceship ship1 = new Spaceship("Supernova", "blue", Integer.MAX_VALUE, true);
	Spaceship ship2 = new Spaceship("Darkness", "black", Integer.MIN_VALUE, false);	
		ship1.transport();
		ship1.intro();
		ship2.transport();
		ship2.intro();
	}
	
}

