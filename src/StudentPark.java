import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.util.*;

public class StudentPark extends JFrame implements ActionListener {
	private JFrame frame = new JFrame("UKM PARKING LOT MANAGEMENT SYSTEM");
	private JLabel parkLbl, gnrlLbl;
	private JButton btn1, btn2, btn3, btn4;
	
	public StudentPark() {
		frame.setSize(500,400);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.setVisible(true);
		frame.setLayout(null);
		frame.setLocationRelativeTo(null);
		
		parkLbl = new JLabel("GENERAL PARKING LOT");
		parkLbl.setBounds(180, 30, 300, 50);
		frame.add(parkLbl);
		gnrlLbl = new JLabel("General");
		gnrlLbl.setBounds(220, 100, 100, 30);
		frame.add(gnrlLbl);
		
		btn1 = new JButton("A1");
		btn1.setBackground(Color.YELLOW);
		btn1.setBounds(190, 150, 100, 30);
		frame.add(btn1);
		btn2 = new JButton("A2");
		btn2.setBackground(Color.YELLOW);
		btn2.setBounds(190, 200, 100, 30);
		frame.add(btn2);
		btn3 = new JButton("A3");
		btn3.setBackground(Color.YELLOW);
		btn3.setBounds(190, 250, 100, 30);
		frame.add(btn3);
		btn4 = new JButton("A4");
		btn4.setBackground(Color.YELLOW);
		btn4.setBounds(190, 300, 100, 30);
		frame.add(btn4);
		
		btn1.addActionListener(this);
		btn2.addActionListener(this);
		btn3.addActionListener(this);
		btn4.addActionListener(this);
	}
	
	public void actionPerformed(ActionEvent e) {
		Object obj = e.getSource();
		
		if(obj == btn1) {
			try {
				ParkingLot pl = new ParkingLot(Person.getID(), Person.getCategory(), Vehicle.getPlateNo(), Vehicle.getType());
				File f = new File("Parking/A1lot.txt");
				if(!f.exists()) {
					BufferedWriter out = new BufferedWriter(new FileWriter(f));
					out.write(ParkingLot.getID() + "\n");
					out.write(ParkingLot.getCategory() + "\n");
					out.write(ParkingLot.getPlateNo() + "\n");
					out.write(ParkingLot.getType() + "\n");
					out.close();
					JOptionPane.showMessageDialog(frame, "Registration successful");
					frame.dispose();
				} 
				else {
					JOptionPane.showMessageDialog(frame, "Sorry, parking currently in used");
				}
			} 
			catch(IOException io) {
			}
		}
		else if(obj == btn2) {
			try {
				ParkingLot pl = new ParkingLot(Person.getID(), Person.getCategory(), Vehicle.getPlateNo(), Vehicle.getType());
				File f = new File("Parking/A2lot.txt");
				if(!f.exists()) {
					BufferedWriter out = new BufferedWriter(new FileWriter(f));
					out.write(ParkingLot.getID() + "\n");
					out.write(ParkingLot.getCategory() + "\n");
					out.write(ParkingLot.getPlateNo() + "\n");
					out.write(ParkingLot.getType() + "\n");
					out.close();
					JOptionPane.showMessageDialog(frame, "Registration successful");
					frame.dispose();
				} 
				else {
					JOptionPane.showMessageDialog(frame, "Sorry, parking currently in used");
				}
			} 
			catch(IOException io) {	
			}			
		}
		else if(obj == btn3) {
			try {
				ParkingLot pl = new ParkingLot(Person.getID(), Person.getCategory(), Vehicle.getPlateNo(), Vehicle.getType());
				File f = new File("Parking/A3lot.txt");
				if(!f.exists()) {
					BufferedWriter out = new BufferedWriter(new FileWriter(f));
					out.write(ParkingLot.getID() + "\n");
					out.write(ParkingLot.getCategory() + "\n");
					out.write(ParkingLot.getPlateNo() + "\n");
					out.write(ParkingLot.getType() + "\n");
					out.close();
					JOptionPane.showMessageDialog(frame, "Registration successful!");
					frame.dispose();
				} 
				else {
					JOptionPane.showMessageDialog(frame, "Sorry, parking currently in used");
				}
			} 
			catch(IOException io) {
			}
		}
		else if(obj == btn4) {
			try {	
				ParkingLot pl = new ParkingLot(Person.getID(), Person.getCategory(), Vehicle.getPlateNo(), Vehicle.getType());
				File f = new File("Parking/A4lot.txt");
				if(!f.exists()) {
					BufferedWriter out = new BufferedWriter(new FileWriter(f));
					out.write(ParkingLot.getID() + "\n");
					out.write(ParkingLot.getCategory() + "\n");
					out.write(ParkingLot.getPlateNo() + "\n");
					out.write(ParkingLot.getType() + "\n");
					out.close();
					JOptionPane.showMessageDialog(frame, "Registration successful!");
					frame.dispose();
				} 
				else {
					JOptionPane.showMessageDialog(frame, "Sorry, parking currently in used");
				}
			} 
			catch(IOException io) {	
			}
		}
	}
}