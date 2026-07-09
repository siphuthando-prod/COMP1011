package com.comp1011.player;

import javax.swing.JOptionPane;

public class Person {

	private float height;
	private float weight;
	private String name;
	private int IQ;
	
	//Getters and Setters
	public float getHeight() {
		return height;
	}

	public void setHeight(float height) {
		this.height = height;
	}

	//Constructor
	public Person(String name, float weight, float height) {
		this.name = name;
		this.height = height;
		this.weight = weight;
	}
	
	public void walks() {
		this.weight *= 0.9;
		JOptionPane.showMessageDialog(null, this.name +  " weighs: " + this.weight + "kg",
				this.name + " lost weight", JOptionPane.INFORMATION_MESSAGE);
	}
	
	public void eats() {
		this.weight *= 1.2;
		JOptionPane.showMessageDialog(null,this.name + " weighs: " + this.weight + "kg",
				"You gained weight!", JOptionPane.ERROR_MESSAGE);
	}
}
