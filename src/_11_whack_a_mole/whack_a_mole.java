package _11_whack_a_mole;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Date;
import java.util.Random;

public class whack_a_mole implements MouseListener {

	JFrame jframe= new JFrame("Whack a Button for Frame and Glory");
	JPanel jpanel= new JPanel();
	 JButton jbutton;
		Random rand= new Random();
		int randomnumber=rand.nextInt(23)+1;
	
	
int whack;

		
	

	
	public void drawButtons(int randomnumber) {
	
		jframe.setSize(300,300);
		System.out.println(randomnumber);
	
		
      
        for(int i=0; i<24; i++) {
        	if(i==(randomnumber-1)) {
        		jbutton= new JButton("MOLE!");
        	}
        	else {
        		jbutton=new JButton("");
        	}
        	
        	
           jbutton.addMouseListener(this);
           jbutton.setSize(100,30);
           jpanel.add(jbutton);
           jframe.add(jpanel);
             
    
        
        }
        
        
        
        
        
        jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jframe.setVisible(true);
		
	}
	void speak(String words) { 
	    try { 
	        Runtime.getRuntime().exec("say " + words).waitFor();
	    } catch (Exception e) {
	        e.printStackTrace();
	    }
	}
	@Override
	public void mouseClicked(MouseEvent e) {
		JButton jbutton2= (JButton) e.getSource();
		System.out.println(whack);
		
	    if(jbutton2.getText().equals("MOLE!")) {
	    	whack+=1;
	    	speak("Correct");
	    
	    }
	    else {
	    	speak("Wrong");
	    	
	    }
	    jframe.dispose();
	    
	    
	    whack_a_mole mole= new whack_a_mole();
       randomnumber= rand.nextInt(23)+1;
	    
	    mole.drawButtons(randomnumber);
		
	    
	    if(whack>=10) {
	    	JOptionPane.showMessageDialog(null,"Game Over");
	    }
	}
	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	private void endGame(Date timeAtStart, int molesWhacked) { 
	    Date timeAtEnd = new Date();
	    JOptionPane.showMessageDialog(null, "Your whack rate is "
	            + ((timeAtEnd.getTime() - timeAtStart.getTime()) / 1000.00 / molesWhacked)
	                  + " moles per second.");
	}

}
