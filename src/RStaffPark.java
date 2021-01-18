import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.util.*;

public class RStaffPark extends JFrame implements ActionListener {
	private JFrame f = new JFrame("UKM PARKING LOT MANAGEMENT SYSTEM");
	private JLabel parkLbl, stffLbl;
	private JButton btn1, btn2, btn3, btn4;
	
	public RStaffPark() {
		f.setSize(500,400);
		f.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		f.setVisible(true);
		f.setLayout(null);
		f.setLocationRelativeTo(null);
		
		parkLbl = new JLabel("STAFF PARKING LOT");
		parkLbl.setBounds(185, 30, 300, 50);
		f.add(parkLbl);
		stffLbl = new JLabel("Staff");
		stffLbl.setBounds(225, 100, 100, 30);
		f.add(stffLbl);
		
		btn1 = new JButton("B1");
		btn1.setBackground(Color.GREEN);
		btn1.setBounds(190, 150, 100, 30);
		f.add(btn1);
		btn2 = new JButton("B2");
		btn2.setBackground(Color.GREEN);
		btn2.setBounds(190, 200, 100, 30);
		f.add(btn2);
		btn3 = new JButton("B3");
		btn3.setBackground(Color.GREEN);
		btn3.setBounds(190, 250, 100, 30);
		f.add(btn3);
		btn4 = new JButton("B4");
		btn4.setBackground(Color.GREEN);
		btn4.setBounds(190, 300, 100, 30);
		f.add(btn4);
		
		btn1.addActionListener(this);
		btn2.addActionListener(this);
		btn3.addActionListener(this);
		btn4.addActionListener(this);
	}
	
	public void actionPerformed(ActionEvent e) {
		Object obj = e.getSource();
		
		if(obj == btn1) {
			ParkingLot pl = new ParkingLot(Person.getID(), Person.getCategory(), Vehicle.getPlateNo(), Vehicle.getType());
			File file = new File("Parking/B1lot.txt");
			if(!file.delete()) {
				JOptionPane.showMessageDialog(f, "No parking registered here");
			} else {
				JOptionPane.showMessageDialog(f, "Parking removed");
			}
		}
		else if(obj == btn2) {
			ParkingLot pl = new ParkingLot(Person.getID(), Person.getCategory(), Vehicle.getPlateNo(), Vehicle.getType());
			File file = new File("Parking/B2lot.txt");
			if(!file.delete()) {
				JOptionPane.showMessageDialog(f, "No parking registered here");
			} else {
				JOptionPane.showMessageDialog(f, "Parking removed");
			}
		}
		else if(obj == btn3) {
			ParkingLot pl = new ParkingLot(Person.getID(), Person.getCategory(), Vehicle.getPlateNo(), Vehicle.getType());
			File file = new File("Parking/B3lot.txt");
			if(!file.delete()) {
				JOptionPane.showMessageDialog(f, "No parking registered here");
			} else {
				JOptionPane.showMessageDialog(f, "Parking removed");
			}
		}
		else if(obj == btn4) {
			ParkingLot pl = new ParkingLot(Person.getID(), Person.getCategory(), Vehicle.getPlateNo(), Vehicle.getType());
			File file = new File("Parking/B4lot.txt");
			if(!file.delete()) {
				JOptionPane.showMessageDialog(f, "No parking registered here");
			} else {
				JOptionPane.showMessageDialog(f, "Parking removed");
			}	
		}	
	}
}