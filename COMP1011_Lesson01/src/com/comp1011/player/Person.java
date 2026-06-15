package com.comp1011.player;

import javax.swing.JOptionPane;

public class Person {

	float height;
	float weight;
	//Constructor
	public Person() {
		this.height = 200;
		this.weight = 70;
	}
	
	public void walks() {
		this.weight *= 0.9;
		JOptionPane.showMessageDialog(null, "You weigh: " + this.weight + "kg",
				"You lost weight", JOptionPane.INFORMATION_MESSAGE);
	}
	
	public void eats() {
		this.weight *= 1.2;
		JOptionPane.showMessageDialog(null, "You weigh: " + this.weight + "kg",
				"You gained weight!", JOptionPane.ERROR_MESSAGE);
	}
}
