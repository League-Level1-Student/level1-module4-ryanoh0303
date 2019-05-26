package _08_calculator;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Calculator implements ActionListener {
	
	
	
	
   JFrame jframe= new JFrame("Calculator");
   JButton add= new JButton("add");
   JButton subtract= new JButton("sub");
   JButton multiply= new JButton("mul");
   JButton divide= new JButton("div");
   JPanel jpanel= new JPanel();
   JTextField text= new JTextField();
   JTextField text2= new JTextField();
	
   public void run() {
	 jframe.setSize(800,800);
	 jframe.setVisible(true);
	
	 text.setPreferredSize(new Dimension(100,30));
	 text2.setPreferredSize(new Dimension(100,30));
	 
	 add.setSize(100,30);
	 subtract.setSize(100,30);
	 multiply.setSize(100,30);
	 divide.setSize(100,30);
	
	 
	 
	 jpanel.add(add);
	 jpanel.add(subtract);
	 jpanel.add(multiply);
	 jpanel.add(divide);
	 jpanel.add(text);
	 jpanel.add(text2);
	 
	 
	 jframe.add(jpanel);
	 
	 add.addActionListener(this);
	 subtract.addActionListener(this);
	 multiply.addActionListener(this);
	 divide.addActionListener(this);
		
	}
	
	public void add(int x, int y) {
		JOptionPane.showMessageDialog(null, x+y);
		
	}
	public void multiply(int x, int y) {
		JOptionPane.showMessageDialog(null, x*y);
		
	}
	
	public void divide(int x, int y) {
		JOptionPane.showMessageDialog(null, x/y);
		
		
	}
	public void subtract(int x, int y) {
		JOptionPane.showMessageDialog(null, x-y);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Calculator cal=new Calculator();
		if(e.getSource()==add) {
			cal.add(Integer.parseInt(text.getText()), Integer.parseInt(text2.getText()));
		}
		else if(e.getSource()==multiply) {
			cal.multiply(Integer.parseInt(text.getText()), Integer.parseInt(text2.getText()));
		}
		else if(e.getSource()==divide) {
			cal.divide(Integer.parseInt(text.getText()), Integer.parseInt(text2.getText()));
		}
		else if(e.getSource()==subtract) {
			cal.subtract(Integer.parseInt(text.getText()), Integer.parseInt(text2.getText()));
		}
		
		
		
	}

}
