package com.comp1011.player;

import javax.swing.JOptionPane;

public class Player {

	public static void main(String[] args) {
		
		int strength = 10;
			
		JOptionPane.showMessageDialog(null, "Hello world! " + strength);

		Person land = new Person();
		land.walks();
		
		land.walks();
		
		land.walks();
		
	}

}
