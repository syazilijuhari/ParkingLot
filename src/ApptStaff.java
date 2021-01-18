import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.util.*;

public class ApptStaff extends JFrame implements ActionListener {
	private JFrame frm = new JFrame("UKM PARKING LOT MANAGEMENT SYSTEM");
	private JLabel apptLbl, mngLbl;
	private JButton btn1, btn2, btn3, btn4;
	
	public ApptStaff() {
		frm.setSize(500,400);
		frm.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frm.setVisible(true);
		frm.setLayout(null);
		frm.setLocationRelativeTo(null);
		
		apptLbl = new JLabel("SELECT CURRENT PARKING");
		apptLbl.setBounds(165, 30, 300, 50);
		frm.add(apptLbl);
		mngLbl = new JLabel("Management");
		mngLbl.setBounds(205, 100, 100, 30);
		frm.add(mngLbl);
		
		btn1 = new JButton("C1");
		btn1.setBackground(Color.BLUE);
		btn1.setBounds(190, 150, 100, 30);
		frm.add(btn1);
		btn2 = new JButton("C2");
		btn2.setBackground(Color.BLUE);
		btn2.setBounds(190, 200, 100, 30);
		frm.add(btn2);
		btn3 = new JButton("C3");
		btn3.setBackground(Color.BLUE);
		btn3.setBounds(190, 250, 100, 30);
		frm.add(btn3);
		btn4 = new JButton("C4");
		btn4.setBackground(Color.BLUE);
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
				File fn = new File("Parking/B1lot.txt");
				File f = new File("Parking/C1lot.txt");
				if(f.exists()) {
					BufferedWriter out = new BufferedWriter(new FileWriter(fn));
					out.write(ParkingLot.getID() + "\n");
					out.write("Staff\n");
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
				File fn = new File("Parking/B2lot.txt");
				File f = new File("Parking/C2lot.txt");
				if(f.exists()) {
					BufferedWriter out = new BufferedWriter(new FileWriter(fn));
					out.write(ParkingLot.getID() + "\n");
					out.write("Staff\n");
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
				File fn = new File("Parking/B3lot.txt");
				File f = new File("Parking/C3lot.txt");
				if(f.exists()) {
					BufferedWriter out = new BufferedWriter(new FileWriter(fn));
					out.write(ParkingLot.getID() + "\n");
					out.write("Staff\n");
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
				File fn = new File("Parking/B4lot.txt");
				File f = new File("Parking/C4lot.txt");
				if(f.exists()) {
					BufferedWriter out = new BufferedWriter(new FileWriter(fn));
					out.write(ParkingLot.getID() + "\n");
					out.write("Staff\n");
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