package day3;

import javax.swing.JOptionPane;

public class CandyCrush {

	public static void main(String[] args) {
		// 1. Using a pop-up, ask the user who they don't like
String crush =JOptionPane.showInputDialog(" who do you dislike ");
		// 2. Change the next line so that the pop-up will tell them they have a crush on that person
		JOptionPane.showMessageDialog(null, " You totally have a crush on " + crush);
		// 3. Ask the user for the name of their best friend
	
		 String bestfriend = JOptionPane.showInputDialog(" whats the name of your bestfriend " ); 
		// 4. Tell them their best friend is as sweet as candy
JOptionPane.showMessageDialog(null, "tell " + bestfriend + " they are as sweet as candy");
	} 
}



