package _05_typing_tutor;

import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class typingtutor implements KeyListener {

    JFrame jframe= new JFrame();
    
   
	char currentLetter=generateRandomLetter();
	JLabel jlabel= new JLabel(""+currentLetter);
	JPanel jpanel= new JPanel();

	public static void main(String[] args) {
		typingtutor tutor= new typingtutor();
	     tutor.run();


	}
	public void run() {
		
		
		
	
	
		
		jlabel.setFont(jlabel.getFont().deriveFont(28.0f));
		jlabel.setHorizontalAlignment(JLabel.CENTER);
		
		jpanel.add(jlabel);
		
		jframe.add(jpanel);
	    jframe.setVisible(true);
	    
	    jframe.addKeyListener(this);
        jframe.setSize(800, 800);
		
	}
    char generateRandomLetter() {
        Random r = new Random();
        return (char) (r.nextInt(26) + 'a');
  }
	@Override
	public void keyTyped(KeyEvent e) {
		
		
		if(e.getKeyChar()==(currentLetter)) {
			System.out.println("You are correct");
			jpanel.setBackground(Color.green);
	
		}
		else {
			System.out.println("You are incorrect");
			jpanel.setBackground(Color.red);
		}
	
	}
	@Override
	public void keyPressed(KeyEvent e) {
		
		
	}
	@Override
	public void keyReleased(KeyEvent e) {
	
		  currentLetter= generateRandomLetter();
          jlabel.setText(""+currentLetter);
		
		
		
		
		
		
        
        
        
        
        
        
        
        
	}

}
