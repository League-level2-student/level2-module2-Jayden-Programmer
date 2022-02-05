package _06_overloading;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class LeagueOptionPaneRunner {
	public static void main(String[] args) {
		ImageIcon icon = new ImageIcon("league.png");
		JOptionPane.showMessageDialog(null, "The League is the Best", "Title", JOptionPane.INFORMATION_MESSAGE, icon); 
		JOptionPane.showMessageDialog(null, "The League is the Best", "Message", JOptionPane.INFORMATION_MESSAGE);
		
	

}}