package _15_voting_booth;

import javax.swing.JOptionPane;

public class votingBooth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String age = JOptionPane.showInputDialog("What is your age(in year)?");
		int num = Integer.parseInt(age);
		if(num < 18) {
			JOptionPane.showMessageDialog(null, "No one cares what you say");
		}else {
		String input = JOptionPane.showInputDialog("Who are you gonna vote for");
	    JOptionPane.showMessageDialog(null, "Cool");
		}
		}

}
