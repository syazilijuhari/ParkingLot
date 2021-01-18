import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.util.*;

public class StartUp extends JFrame implements ActionListener {
	private JFrame frame = new JFrame("UKM PARKING LOT MANAGEMENT SYSTEM");
	private JLabel greetLbl;
	private JButton btn1, btn2, btn3, btn4;

	public StartUp() {
		frame.setSize(500,400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		frame.setLayout(null);
		frame.setLocationRelativeTo(null);
		
		greetLbl = new JLabel("WELCOME TO UKM PARKING MANAGEMENT SYSTEM");
		greetLbl.setBounds(100, 50, 400, 50);
		btn1 = new JButton("ADD PARKING");
		btn1.setBounds(50, 100, 150, 80);
		btn2 = new JButton("REMOVE PARKING");
		btn2.setBounds(300, 100, 150, 80);
		btn3 = new JButton("APPOINTMENT");
		btn3.setBounds(50, 200, 150, 80);
		btn4 = new JButton("VIEW LIST");
		btn4.setBounds(300, 200, 150, 80);
		
		frame.add(greetLbl);
		frame.add(btn1);
		frame.add(btn2);
		frame.add(btn3);
		frame.add(btn4);
		
		btn1.addActionListener(this);
		btn2.addActionListener(this);
		btn3.addActionListener(this);
		btn4.addActionListener(this);

	}
	public void actionPerformed(ActionEvent e) {
		Object obj = e.getSource();
		
		if(obj == btn1) {
			new AddPark();
		}
		else if(obj == btn2) {
			new RemovePark();
		}
		else if(obj == btn3) {
			new Appt();
		}
		else if(obj == btn4) {
			new View();
		}
	}
	
	public static void main(String[] args) {
		new StartUp();
	}
}