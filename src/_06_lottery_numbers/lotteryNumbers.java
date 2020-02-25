package _06_lottery_numbers;

import java.util.Random;

import javax.swing.JOptionPane;

public class lotteryNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Random randomMaker = new Random();
JOptionPane.showMessageDialog(null, "Selecting 5 lottery numbers...");
int number1 = randomMaker.nextInt(100);
int number2 = randomMaker.nextInt(50);
int number3 = randomMaker.nextInt(69);
int number4 = randomMaker.nextInt(420);
int number5 = randomMaker.nextInt(10);
JOptionPane.showMessageDialog(null, "And... The 5 lucky numbers are..."+ number1 + ", " + number2 + ", " + number3 + ", " + number4 + ", " + number5);
	}

}
