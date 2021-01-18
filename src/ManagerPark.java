import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.util.*;

public class ManagerPark extends JFrame implements ActionListener {
	private JFrame frame = new JFrame("UKM PARKING LOT MANAGEMENT SYSTEM");
	private JLabel parkLbl, gnrlLbl, stffLbl, mngLbl;
	private JButton btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btn10, btn11, btn12;
	
	public ManagerPark() {
		frame.setSize(500,400);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.setVisible(true);
		frame.setLayout(null);
		frame.setLocationRelativeTo(null);
		
		parkLbl = new JLabel("MANAGEMENT PARKING LOT");
		parkLbl.setBounds(160, 30, 300, 50);
		frame.add(parkLbl);
		stffLbl = new JLabel("Staff");
		stffLbl.setBounds(105, 100, 100, 30);
		frame.add(stffLbl);
		gnrlLbl = new JLabel("General");
		gnrlLbl.setBounds(360, 100, 100, 30);
		frame.add(gnrlLbl);
		mngLbl = new JLabel("Management");
		mngLbl.setBounds(215, 100, 100, 30);
		frame.add(mngLbl);
			
		btn1 = new JButton("B1");
		btn1.setBackground(Color.GREEN);
		btn1.setBounds(70, 150, 100, 30);
		frame.add(btn1);
		btn2 = new JButton("B2");
		btn2.setBackground(Color.GREEN);
		btn2.setBounds(70, 200, 100, 30);
		frame.add(btn2);
		btn3 = new JButton("B3");
		btn3.setBackground(Color.GREEN);
		btn3.setBounds(70, 250, 100, 30);
		frame.add(btn3);
		btn4 = new JButton("B4");
		btn4.setBackground(Color.GREEN);
		btn4.setBounds(70, 300, 100, 30);
		frame.add(btn4);
		btn5 = new JButton("A1");
		btn5.setBackground(Color.YELLOW);
		btn5.setBounds(330, 150, 100, 30);
		frame.add(btn5);
		btn6 = new JButton("A2");
		btn6.setBackground(Color.YELLOW);
		btn6.setBounds(330, 200, 100, 30);
		frame.add(btn6);
		btn7 = new JButton("A3");
		btn7.setBackground(Color.YELLOW);
		btn7.setBounds(330, 250, 100, 30);
		frame.add(btn7);
		btn8 = new JButton("A4");
		btn8.setBackground(Color.YELLOW);
		btn8.setBounds(330, 300, 100, 30);
		frame.add(btn8);
		btn9 = new JButton("C1");
		btn9.setBackground(Color.BLUE);
		btn9.setBounds(200, 150, 100, 30);
		frame.add(btn9);
		btn10 = new JButton("C2");
		btn10.setBackground(Color.BLUE);
		btn10.setBounds(200, 200, 100, 30);
		frame.add(btn10);
		btn11 = new JButton("C3");
		btn11.setBackground(Color.BLUE);
		btn11.setBounds(200, 250, 100, 30);
		frame.add(btn11);
		btn12 = new JButton("C4");
		btn12.setBackground(Color.BLUE);
		btn12.setBounds(200, 300, 100, 30);
		frame.add(btn12);
		
		btn1.addActionListener(this);
		btn2.addActionListener(this);
		btn3.addActionListener(this);
		btn4.addActionListener(this);
		btn5.addActionListener(this);
		btn6.addActionListener(this);
		btn7.addActionListener(this);
		btn8.addActionListener(this);
		btn9.addActionListener(this);
		btn10.addActionListener(this);
		btn11.addActionListener(this);
		btn12.addActionListener(this);
	}
	
	public void actionPerformed(ActionEvent e) {
		Object obj = e.getSource();
		
		if(obj == btn1) {
			try {	
				ParkingLot pl = new ParkingLot(Person.getID(), Person.getCategory(), Vehicle.getPlateNo(), Vehicle.getType());
				File f = new File("Parking/B1lot.txt");
				if(!f.exists()) {
					BufferedWriter out = new BufferedWriter(new FileWriter(f));
					out.write(ParkingLot.getID() + "\n");
					out.write(ParkingLot.getCategory() + "\n");
					out.write(ParkingLot.getPlateNo() + "\n");
					out.write(ParkingLot.getType() + "\n");
					out.close();
					JOptionPane.showMessageDialog(frame, "Registeration successful!");
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
				File f = new File("Parking/B2lot.txt");
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
		else if(obj == btn3) {
			try {
				ParkingLot pl = new ParkingLot(Person.getID(), Person.getCategory(), Vehicle.getPlateNo(), Vehicle.getType());
				File f = new File("Parking/B3lot.txt");
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
				File f = new File("Parking/B4lot.txt");
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
		else if(obj == btn5) {
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
		else if(obj == btn6) {
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
		else if(obj == btn7) {
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
		else if(obj == btn8) {
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
		else if(obj == btn9) {
			try {
				ParkingLot pl = new ParkingLot(Person.getID(), Person.getCategory(), Vehicle.getPlateNo(), Vehicle.getType());
				File f = new File("Parking/C1lot.txt");
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
		else if(obj == btn10) {
			try {
				ParkingLot pl = new ParkingLot(Person.getID(), Person.getCategory(), Vehicle.getPlateNo(), Vehicle.getType());
				File f = new File("Parking/C2lot.txt");
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
		else if(obj == btn11) {
			try {
				ParkingLot pl = new ParkingLot(Person.getID(), Person.getCategory(), Vehicle.getPlateNo(), Vehicle.getType());
				File f = new File("Parking/C3lot.txt");
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
		else if(obj == btn12) {
			try {
				ParkingLot pl = new ParkingLot(Person.getID(), Person.getCategory(), Vehicle.getPlateNo(), Vehicle.getType());
				File f = new File("Parking/C4lot.txt");
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