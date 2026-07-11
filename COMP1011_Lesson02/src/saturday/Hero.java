package saturday;

public class Hero {
	
	private int strength;
	private int speed;
	private int health;
	public String name;
	
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
	}
	
	//PUBLIC METHODS
	public void generateAbilities() {
		
	}
	
	public void fight() {
		
	}
	
	public void run() {
	}

}	
	


