package _12_slot_machine;

import java.awt.Dimension;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import java.util.Random;


public class SlotMachine implements MouseListener {
	JFrame jframe= new JFrame("Slot Machine");
	JPanel jpanel= new JPanel();
     JLabel jlabel;
     JLabel jlabel2;
     JLabel jlabel3;
     JButton  spin;
     Random rand= new Random();
    
	
	
	public void run() throws MalformedURLException {
		jframe.setSize(800,800);
		jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		spin=new JButton("Spin");
		spin.addMouseListener(this);
		
		
		
		
		jlabel=createLabelImage("Cherry.jpg");
		jlabel2=createLabelImage("Orange.jpg");
	     jlabel3=createLabelImage("Lime.jpg");
	     
	   jlabel.setPreferredSize(new Dimension(200,200));
	   jlabel2.setPreferredSize(new Dimension(200,200));
	   jlabel3.setPreferredSize(new Dimension(200,200));
	     
	     
	   spin.setSize(new Dimension(100,30));
	     
	    jpanel.add(jlabel);
        jpanel.add(jlabel2);
        jpanel.add(jlabel3);
        jpanel.add(spin);
        jframe.add(jpanel);
        
	  
	
		jframe.pack();
		
		jframe.setVisible(true);
		
	}
	public static void main(String[] args) throws MalformedURLException {
		SlotMachine slot= new SlotMachine();
		slot.run();
	}
	
	
	private JLabel createLabelImage(String fileName) throws MalformedURLException{
        URL imageURL = getClass().getResource(fileName);
	if (imageURL == null){
		System.err.println("Could not find image " + fileName);
		return new JLabel();
	}
	Icon icon = new ImageIcon(imageURL);
	JLabel imageLabel = new JLabel(icon);
	return imageLabel;
}
	@Override
	public void mouseClicked(MouseEvent e) {
		jpanel.remove(jlabel);
		jpanel.remove(jlabel2);
		jpanel.remove(jlabel3);
		
		
		   
	    System.out.println("Clicked");
	    int x=rand.nextInt(3);
	    int y= rand.nextInt(3);
	    int z= rand.nextInt(3);
	    if(x==0) {
	    	try {
				jlabel=createLabelImage("Cherry.jpg");
			} catch (MalformedURLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
	    }
	    else if(x==1) {
	    	try {
				jlabel=createLabelImage("Orange.jpg");
			} catch (MalformedURLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
	    }
	    else if(x==2) {
	    	try {
				jlabel=createLabelImage("Lime.jpg");
			} catch (MalformedURLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
	    }
	    
	    if(y==0) {
	    	try {
				jlabel2=createLabelImage("Cherry.jpg");
			} catch (MalformedURLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
	    }
	    else if(y==1) {
	    	try {
				jlabel2=createLabelImage("Orange.jpg");
			} catch (MalformedURLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
	    }
	    else if(y==2) {
	    	try {
				jlabel2=createLabelImage("Lime.jpg");
			} catch (MalformedURLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
	    }
	    
	    
	    if(z==0) {
	    	try {
				jlabel3=createLabelImage("Cherry.jpg");
			} catch (MalformedURLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
	    }
	    else if(z==1) {
	    	try {
				jlabel3=createLabelImage("Orange.jpg");
			} catch (MalformedURLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
	    }
	    else if(z==2) {
	    	try {
				jlabel3=createLabelImage("Lime.jpg");
			} catch (MalformedURLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
	    }
	    
	    
	    jlabel.setPreferredSize(new Dimension(200,200));
		   jlabel2.setPreferredSize(new Dimension(200,200));
		   jlabel3.setPreferredSize(new Dimension(200,200));
		   
	    
	    jpanel.add(jlabel);
	    jpanel.add(jlabel2);
	    jpanel.add(jlabel3);
	    jframe.pack();
	    if(x==y && y==z) {
	    	
	    	JOptionPane.showMessageDialog(null, "You WIN");
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
    
}
