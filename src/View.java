import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.util.*;

public class View extends JFrame implements ActionListener {
	private JFrame fv= new JFrame("UKM PARKING LOT MANAGEMENT SYSTEM");
	private JLabel lotLbl;
	private JButton btn1, btn2, btn3, btn4;
	
	public View() {
		fv.setSize(500,400);
		fv.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		fv.setVisible(true);
		fv.setLayout(null);
		fv.setLocationRelativeTo(null);
		
		lotLbl = new JLabel("Choose Parking Lot");
		lotLbl.setBounds(180, 50, 300, 50);
		fv.add(lotLbl);
		
		btn1 = new JButton("GENERAL LOT");
		btn1.setBackground(Color.CYAN);
		btn1.setBounds(110, 100, 250, 40);
		fv.add(btn1);
		btn2 = new JButton("STAFF LOT");
		btn2.setBackground(Color.CYAN);
		btn2.setBounds(110, 160, 250, 40);
		fv.add(btn2);
		btn3 = new JButton("MANAGEMENT LOT");
		btn3.setBackground(Color.CYAN);
		btn3.setBounds(110, 220, 250, 40);
		fv.add(btn3);
		btn4 = new JButton("MOTORCYCLE LOT");
		btn4.setBackground(Color.CYAN);
		btn4.setBounds(110, 280, 250, 40);
		fv.add(btn4);
		
		btn1.addActionListener(this);
		btn2.addActionListener(this);
		btn3.addActionListener(this);
		btn4.addActionListener(this);
	}
	
	public void actionPerformed(ActionEvent e) {
		Object obj = e.getSource();
		
		if(obj == btn1) {
			new VGeneralPark();
		}
		else if(obj == btn2) {
			new VStaffPark();
		}
		else if(obj == btn3) {
			new VManagerPark();
			
		}
		else if(obj == btn4) {
			new VMotorPark();
		}
	}
}