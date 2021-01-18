import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.util.*;

public class RGeneralPark extends JFrame implements ActionListener {
	private JFrame f = new JFrame("UKM PARKING LOT MANAGEMENT SYSTEM");
	private JLabel parkLbl, gnrlLbl;
	private JButton btn1, btn2, btn3, btn4;
	
	public RGeneralPark() {
		f.setSize(500,400);
		f.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		f.setVisible(true);
		f.setLayout(null);
		f.setLocationRelativeTo(null);
		
		parkLbl = new JLabel("GENERAL PARKING LOT");
		parkLbl.setBounds(180, 30, 300, 50);
		f.add(parkLbl);
		gnrlLbl = new JLabel("General");
		gnrlLbl.setBounds(220, 100, 100, 30);
		f.add(gnrlLbl);
		
		btn1 = new JButton("A1");
		btn1.setBackground(Color.YELLOW);
		btn1.setBounds(190, 150, 100, 30);
		f.add(btn1);
		btn2 = new JButton("A2");
		btn2.setBackground(Color.YELLOW);
		btn2.setBounds(190, 200, 100, 30);
		f.add(btn2);
		btn3 = new JButton("A3");
		btn3.setBackground(Color.YELLOW);
		btn3.setBounds(190, 250, 100, 30);
		f.add(btn3);
		btn4 = new JButton("A4");
		btn4.setBackground(Color.YELLOW);
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
			File file = new File("Parking/A1lot.txt");
			if(!file.delete()) {
				JOptionPane.showMessageDialog(f, "No parking registered here");
			} else {
				JOptionPane.showMessageDialog(f, "Parking removed");
			}	
		}
		else if(obj == btn2) {
			ParkingLot pl = new ParkingLot(Person.getID(), Person.getCategory(), Vehicle.getPlateNo(), Vehicle.getType());
			File file = new File("Parking/A2lot.txt");
			if(!file.delete()) {
				JOptionPane.showMessageDialog(f, "No parking registered here");
			} else {
				JOptionPane.showMessageDialog(f, "Parking removed");
			}
		}
		else if(obj == btn3) {
			ParkingLot pl = new ParkingLot(Person.getID(), Person.getCategory(), Vehicle.getPlateNo(), Vehicle.getType());
			File file = new File("Parking/A3lot.txt");
			if(!file.delete()) {
				JOptionPane.showMessageDialog(f, "No parking registered here");
			} else {
				JOptionPane.showMessageDialog(f, "Parking removed");
			}
		}
		else if(obj == btn4) {
			ParkingLot pl = new ParkingLot(Person.getID(), Person.getCategory(), Vehicle.getPlateNo(), Vehicle.getType());
			File file = new File("Parking/A4lot.txt");
			if(!file.delete()) {
				JOptionPane.showMessageDialog(f, "No parking registered here");
			} else {
				JOptionPane.showMessageDialog(f, "Parking removed");
			}	
		}	
	}
}