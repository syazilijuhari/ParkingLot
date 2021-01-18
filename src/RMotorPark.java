import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.util.*;

public class RMotorPark extends JFrame implements ActionListener {
	private JFrame f = new JFrame("UKM PARKING LOT MANAGEMENT SYSTEM");
	private JLabel parkLbl, motorLbl;
	private JButton btn1, btn2, btn3, btn4;
	
	public RMotorPark() {
		f.setSize(500,400);
		f.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		f.setVisible(true);
		f.setLayout(null);
		f.setLocationRelativeTo(null);
		
		parkLbl = new JLabel("MOTORCYCLE PARKING LOT");
		parkLbl.setBounds(160, 30, 300, 50);
		f.add(parkLbl);
		motorLbl = new JLabel("Motorcycle");
		motorLbl.setBounds(210, 100, 100, 30);
		f.add(motorLbl);
		
		btn1 = new JButton("D1");
		btn1.setBackground(Color.LIGHT_GRAY);
		btn1.setBounds(190, 150, 100, 30);
		f.add(btn1);
		btn2 = new JButton("D2");
		btn2.setBackground(Color.LIGHT_GRAY);
		btn2.setBounds(190, 200, 100, 30);
		f.add(btn2);
		btn3 = new JButton("D3");
		btn3.setBackground(Color.LIGHT_GRAY);
		btn3.setBounds(190, 250, 100, 30);
		f.add(btn3);
		btn4 = new JButton("D4");
		btn4.setBackground(Color.LIGHT_GRAY);
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
			File file = new File("Parking/D1lot.txt");
			if(!file.delete()) {
				JOptionPane.showMessageDialog(f, "No parking registered here");
			} else {
				JOptionPane.showMessageDialog(f, "Parking removed");
			}
		}
		else if(obj == btn2) {
			ParkingLot pl = new ParkingLot(Person.getID(), Person.getCategory(), Vehicle.getPlateNo(), Vehicle.getType());
			File file = new File("Parking/D2lot.txt");
			if(!file.delete()) {
				JOptionPane.showMessageDialog(f, "No parking registered here");
			} else {
				JOptionPane.showMessageDialog(f, "Parking removed");
			}
		}
		else if(obj == btn3) {
			ParkingLot pl = new ParkingLot(Person.getID(), Person.getCategory(), Vehicle.getPlateNo(), Vehicle.getType());
			File file = new File("Parking/D3lot.txt");
			if(!file.delete()) {
				JOptionPane.showMessageDialog(f, "No parking registered here");
			} else {
				JOptionPane.showMessageDialog(f, "Parking removed");
			}
		}
		else if(obj == btn4) {
			ParkingLot pl = new ParkingLot(Person.getID(), Person.getCategory(), Vehicle.getPlateNo(), Vehicle.getType());
			File file = new File("Parking/D4lot.txt");
			if(!file.delete()) {
				JOptionPane.showMessageDialog(f, "No parking registered here");
			} else {
				JOptionPane.showMessageDialog(f, "Parking removed");
			}	
		}	
	}
}