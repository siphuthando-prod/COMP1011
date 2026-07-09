package com.comp1011.player;

import javax.swing.JOptionPane;

public class Player {

	public static void main(String[] args) {
		
		int strength = 10;
			
		JOptionPane.showMessageDialog(null, "Hello world! It's 2026 " + strength);

		Person land = new Person("sizwe", 85.6f, 160.7f);
		land.walks();
		
		Person him = new Person("HIM", 89.9f, 96.9f);
		him.walks();
		
	}

}
