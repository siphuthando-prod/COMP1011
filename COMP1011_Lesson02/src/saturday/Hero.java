package saturday;

public class Hero {
	
	private int strength;
	private int speed;
	private int health;
	protected String name;
	
	//Getters
	public int getStrength() {
		return this.strength;
	}
	
	public int getSpeed() {
		return speed;
	}

	public int getHealth() {
		return health;
	}
	
	//Setters
	public void setStrength(int strength) {
		this.strength = strength;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}


	public void setHealth(int health) {
		this.health = health;
	}

	//CONSTRUCTOR
	public Hero(String name) {
		this.name = name;
		generateAbilities();
	}

	//PUBLIC METHODS++++++++++++++++++++++++++++++++++++++++
	public void showAbilities() {
		System.out.println("+++++++++++++++++++++++++++++++++++");
		System.out.println("Strength: " + this.strength);
		System.out.println("Speed: " + this.speed);
		System.out.println("Health: " + this.health);
		System.out.println("+++++++++++++++++++++++++++++++++++");
	}

	public void fight() {
		System.out.println(this.name + " is Fighting");
	}
	
	public void run() {
		System.out.println(this.name + " is Running");
	}
	
	//PRIVATE METHODS
	private void generateAbilities() {
		this.strength = (int)(Math.random() * 100 + 1);
		this.speed = (int)(Math.random() * 100 + 1);
		this.health = (int)(Math.random() * 100 + 1);
	}
	

}	
	


