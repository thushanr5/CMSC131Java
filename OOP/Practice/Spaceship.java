public class Spaceship {
	
	String nameOfShip;
	String color;
	int speed;
	boolean canGoToWater;
	
	public Spaceship(String nameOfShip, String color, int speed, boolean canGoToWater) {
		this.nameOfShip = nameOfShip;
		this.color = color;
		this.speed = speed;
		this.canGoToWater = canGoToWater;
	}
	
	public void transport() {
		System.out.println("The " + nameOfShip + "can fly really fast");
	}
	
	public void intro() {
		System.out.println("The spaceship " + nameOfShip + " is of color " + color + " and its water properties say that it " + canGoToWater);
	}
	
	
}
