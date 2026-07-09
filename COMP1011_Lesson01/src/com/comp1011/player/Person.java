package com.comp1011.player;

import javax.swing.JOptionPane;

public class Person {

	private float height;
	private float weight;
	
	//Getters and Setters
	public float getHeight() {
		return height;
	}

	public void setHeight(float height) {
		this.height = height;
	}

	//Constructor
	public Person() {
		this.setHeight(200);
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
