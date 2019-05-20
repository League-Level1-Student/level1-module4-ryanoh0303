package _01_nasty_surprise;

import java.awt.Button;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;



public class Main implements ActionListener {


	   JFrame jframe= new JFrame("Test");
	Button treat= new Button("Treat");
	 Button trick= new Button("Trick");
	   JPanel jpanel= new JPanel();
	public static void main(String[] args) {
		Main main= new Main();
		main.run();
	   
	}
  public void run() {    
	  System.out.println("Hello");
	  trick.setSize(100, 100);
	  treat.setSize(100, 100);
	  trick.addActionListener(this);
	  treat.addActionListener(this);
	  jframe.setSize(800, 800);
	
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
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==trick ){
		showPictureFromTheInternet("https://hgtvhome.sndimg.com/content/dam/images/hgtv/fullset/2018/3/22/0/shutterstock_national-puppy-day-224423782.jpg.rend.hgtvcom.966.725.suffix/1521744674350.jpeg");
	}
		else if(e.getSource()==treat) {
			showPictureFromTheInternet("http://static-23.sinclairstoryline.com/resources/media/d60d4f1c-9fcc-4ae4-8058-05e885080e19-large16x9_momo2.PNG?1551379953599");
		}
}
}