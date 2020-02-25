//    Copyright (c) The League of Amazing Programmers 2013-2019
//    Level 0

package _04_validation;

import java.util.Random;

import javax.swing.JOptionPane;

public class Validation {
	public static void main(String[] args) {
		
		Random randomMaker = new Random();
		
		int randomNumber = randomMaker.nextInt(6);
		
		System.out.println(randomNumber);

		// 1. Use each value of randomNumber to give the user a random compliment.
if (randomNumber == 0) {
	JOptionPane.showMessageDialog(null, "You put the kool in kool aid");
} else if (randomNumber == 1) {
	JOptionPane.showMessageDialog(null, "You look great today");
} else if (randomNumber == 2) { 
	JOptionPane.showMessageDialog(null, "Your'e great!");
} else if (randomNumber == 3) {
	JOptionPane.showMessageDialog(null, "Are you trash? Cuz I wanna Take you out");	
} else if (randomNumber == 4) {
	JOptionPane.showMessageDialog(null, "Are you Japanese? Cuz Im tryin to get in japanties");
} else if (randomNumber == 5) {
	JOptionPane.showMessageDialog(null, "LMAO u funi");
}
		// 2. Repeat all the code above 10 times
		
		// 3. Find someone to test out your program. They will like it :)
	}
}
