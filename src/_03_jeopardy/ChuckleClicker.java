package _03_jeopardy;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class ChuckleClicker implements ActionListener {
	 JFrame jframe= new JFrame("Background");
	 JPanel jpanel= new JPanel();
	 JButton jbutton2= new JButton("PunchLine");
	 JButton jbutton= new JButton("Joke");

	public static void main(String[] args) {
		ChuckleClicker chuckle= new ChuckleClicker();
        chuckle.makeButtons();
		
	}
	public void makeButtons() {
	 JOptionPane.showMessageDialog(null, "Button is created");	
	

	 jbutton.setSize(200, 50);
		 jbutton2.setSize(200, 100);
	 jpanel.add(jbutton);
	 jpanel.add(jbutton2);
	 jbutton.addActionListener(this);
	 jbutton2.addActionListener(this);
	 
	 
	 jframe.setSize(800, 800);
	 jframe.add(jpanel);
	 jframe.setVisible(true);
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==jbutton) {
			JOptionPane.showMessageDialog(null, "Why did the Clydesdale give the pony a glass of water? Because he was a little horse.");
		}
		else if(e.getSource()==jbutton2) {
			JOptionPane.showMessageDialog(null, "Stop Working When Done");
		}
		
	}
	

}
