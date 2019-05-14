package _01_nasty_surprise;

import java.awt.Button;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;



public class Main {

	public static void main(String[] args) {
		JLabel jlabel= new JLabel();
	   JFrame jframe= new JFrame("Test");
	   jframe.setSize(800, 800);
	   JPanel jpanel= new JPanel();
	   
	   Button trick= new Button("Trick");
	   trick.setSize(100, 100);
	   
	  
     
	   Button treat= new Button("Treat");
       treat.setSize(100, 100);

      
      
     
       jpanel.add(trick);
       jpanel.add(treat);
       
       jframe.add(jpanel);
       jframe.setVisible(true);
	}

	private void showPictureFromTheInternet(String imageUrl) {
	     try {
	          URL url = new URL(imageUrl);
	          Icon icon = new ImageIcon(url);
	          JLabel imageLabel = new JLabel(icon);
	          JFrame frame = new JFrame();
	          frame.add(imageLabel);
	          frame.setVisible(true);
	          frame.pack();
	     } catch (MalformedURLException e) {
	          e.printStackTrace();
	     }
	}
}
