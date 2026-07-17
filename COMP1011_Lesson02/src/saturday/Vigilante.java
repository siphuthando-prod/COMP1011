package saturday;

public class Vigilante extends Villain {
	
	//CONSTRUCTOR+++++++++++++++++++++++++++
	public Vigilante(String name) {
		super(name);
		 
	}
	
	//PUBLIC METHODS++++++++++++++++++++++
	public void dealsJustice() {
		System.out.println(this.name + " is dealing Justice, baby");
	}
}
