package saturday;

public class Speedstar extends Hero {

	//CONTRUCTOR+++++++++++++++++++++++++++++++	
	public Speedstar(String name) {
		super(name);
		this.boostSpeed();
	}
	
	//PRIVATE METHODS+++++++++++++++++++++++++++
	private void boostSpeed() {
		this.speed += 50;
		if(this.speed > 100) {
			this.speed = 100;
		}
	}
}
