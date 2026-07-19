package comp1011.assignment1;

public class Hero {
	//PRIVATE MEMBERS+++++++++++++++++++++++++++++++
	private int strength;
	private int speed;
	private int health;
	
	//PUBLIC MEMBERS+++++++++++++++++++++++++++++++++
	private String name;
	
	//CONSTRUCTOR
	public Hero(String name) {
		this.name = name;
		
		generateAbilities();
	}
	
	//PRIVATE METHODS+++++++++++++++++++++++++++++++
	private void generateAbilities() {
		this.strength = (int)(Math.random() * 100 + 1);
		this.speed = (int)(Math.random() * 100 + 1);
		this.health = (int)(Math.random() * 100 + 1);
	}

	private int hitDamage() {
		return this.strength * (int)(Math.random() * 6 + 1);
	}

	private boolean hitAttempt() {
		int hits =(int)(Math.random() * 100 + 1); 
		
		if(hits <= 20) {
			return true;
		}
		return false;
	}
	
	//PUBLIC METHODS++++++++++++++++++++++++++++++++++
	public void fight() {
		if(hitAttempt()) {
			System.out.println("+++++++++++++++++++++++++++++++++++++");
			System.out.println(this.name + " has a hit damage of: " + hitDamage());
			System.out.println("+++++++++++++++++++++++++++++++++++++");
		}
	}
	
	public void show() {
		System.out.println("Showing " + this.name + "'s Abilities");
		System.out.println("+++++++++++++++++++++++++++++++++++++");
		System.out.println("Strength: " + this.strength);
		System.out.println("Speed: " + this.speed);
		System.out.println("Health: " + this.health);
		System.out.println("+++++++++++++++++++++++++++++++++++++");
	}
}
