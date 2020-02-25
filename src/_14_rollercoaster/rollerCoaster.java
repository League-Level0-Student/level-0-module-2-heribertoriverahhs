package _14_rollercoaster;

import javax.swing.JOptionPane;

public class rollerCoaster {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

 String height = JOptionPane.showInputDialog("What is your height?");
 int num = Integer.parseInt(height);
 if (num < 48) {
	JOptionPane.showMessageDialog(null, "Grow more before you start this ride!");
} else {
JOptionPane.showMessageDialog(null, "You are tall enough! Go right aheaad!");
}
		
		
		
		
		
	}

}
