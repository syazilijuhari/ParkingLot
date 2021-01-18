import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.util.*;

public class ApptManager extends JFrame implements ActionListener {
	private JFrame frm = new JFrame("UKM PARKING LOT MANAGEMENT SYSTEM");
	private JLabel apptLbl, stffLbl;
	private JButton btn1, btn2, btn3, btn4;
	
	public ApptManager() {
		frm.setSize(500,400);
		frm.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frm.setVisible(true);
		frm.setLayout(null);
		frm.setLocationRelativeTo(null);
		
		apptLbl = new JLabel("SELECT CURRENT PARKING");
		apptLbl.setBounds(165, 30, 300, 50);
		frm.add(apptLbl);
		stffLbl = new JLabel("Staff");
		stffLbl.setBounds(225, 100, 100, 30);
		frm.add(stffLbl);
		
		btn1 = new JButton("B1");
		btn1.setBackground(Color.GREEN);
		btn1.setBounds(190, 150, 100, 30);
		frm.add(btn1);
		btn2 = new JButton("B2");
		btn2.setBackground(Color.GREEN);
		btn2.setBounds(190, 200, 100, 30);
		frm.add(btn2);
		btn3 = new JButton("B3");
		btn3.setBackground(Color.GREEN);
		btn3.setBounds(190, 250, 100, 30);
		frm.add(btn3);
		btn4 = new JButton("B4");
		btn4.setBackground(Color.GREEN);
		btn4.setBounds(190, 300, 100, 30);
		frm.add(btn4);
		
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
				File fn = new File("Parking/C1lot.txt");
				File f = new File("Parking/B1lot.txt");
				if(f.exists()) {
					BufferedWriter out = new BufferedWriter(new FileWriter(fn));
					out.write(ParkingLot.getID() + "\n");
					out.write("Management\n");
					out.write(ParkingLot.getPlateNo() + "\n");
					out.write(ParkingLot.getType() + "\n");
					out.close();
					JOptionPane.showMessageDialog(frm, "Appointment successful!");
					f.delete();
					frm.dispose();
				} 
				else {
					JOptionPane.showMessageDialog(frm, "Data not found");
				}
			} 
			catch(IOException io) {
			}
			
		}
		else if(obj == btn2) {
			try {
				ParkingLot pl = new ParkingLot(Person.getID(), Person.getCategory(), Vehicle.getPlateNo(), Vehicle.getType());
				File fn = new File("Parking/C2lot.txt");
				File f = new File("Parking/B2lot.txt");
				if(f.exists()) {
					BufferedWriter out = new BufferedWriter(new FileWriter(fn));
					out.write(ParkingLot.getID() + "\n");
					out.write("Management\n");
					out.write(ParkingLot.getPlateNo() + "\n");
					out.write(ParkingLot.getType() + "\n");
					out.close();
					JOptionPane.showMessageDialog(frm, "Appointment successful!");
					f.delete();
					frm.dispose();
				} 
				else {
					JOptionPane.showMessageDialog(frm, "Data not found");
				}
			} 
			catch(IOException io) {
			}
		}
		else if(obj == btn3) {
			try {
				ParkingLot pl = new ParkingLot(Person.getID(), Person.getCategory(), Vehicle.getPlateNo(), Vehicle.getType());
				File fn = new File("Parking/C3lot.txt");
				File f = new File("Parking/B3.txt");
				if(f.exists()) {
					BufferedWriter out = new BufferedWriter(new FileWriter(fn));
					out.write(ParkingLot.getID() + "\n");
					out.write("Management\n");
					out.write(ParkingLot.getPlateNo() + "\n");
					out.write(ParkingLot.getType() + "\n");
					out.close();
					JOptionPane.showMessageDialog(frm, "Appointment successful!");
					f.delete();
					frm.dispose();
				} 
				else {
					JOptionPane.showMessageDialog(frm, "Data not found");
				}
			} 
			catch(IOException io) {
			}
		}
		else if(obj == btn4) {
			try {
				ParkingLot pl = new ParkingLot(Person.getID(), Person.getCategory(), Vehicle.getPlateNo(), Vehicle.getType());
				File fn = new File("Parking/C4lot.txt");
				File f = new File("Parking/B4lot.txt");
				if(f.exists()) {
					BufferedWriter out = new BufferedWriter(new FileWriter(fn));
					out.write(ParkingLot.getID() + "\n");
					out.write("Management\n");
					out.write(ParkingLot.getPlateNo() + "\n");
					out.write(ParkingLot.getType() + "\n");
					out.close();
					JOptionPane.showMessageDialog(frm, "Appointment successful!");
					f.delete();
					frm.dispose();
				} 
				else {
					JOptionPane.showMessageDialog(frm, "Data not found");
				}
			} 
			catch(IOException io) {
			}
		}
	}
}