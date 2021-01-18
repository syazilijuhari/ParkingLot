import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.util.*;

public class StaffVehicle extends JFrame implements ActionListener {
	private JFrame frame = new JFrame("UKM PARKING LOT MANAGEMENT SYSTEM");
	private JLabel plateLbl, vehicleLbl;
	private JTextField plateTxt;
	private JButton btn1, btn2, btn3;
	
	public StaffVehicle() {
		frame.setSize(500,400);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.setVisible(true);
		frame.setLayout(null);
		frame.setLocationRelativeTo(null);
		
		plateLbl = new JLabel("Enter Plate No");
		plateLbl.setBounds(200, 50, 300, 50);
		vehicleLbl = new JLabel("Choose vehicle");
		vehicleLbl.setBounds(200, 150, 300, 50);
		plateTxt = new JTextField();
		plateTxt.setBounds(100, 100, 300, 30);
		
		btn1 = new JButton("Car");
		btn1.setBounds(20, 200, 120, 50);
		btn2 = new JButton("Motorcycle");
		btn2.setBounds(180, 200, 120, 50);
		btn3 = new JButton("Bus/Lorry");
		btn3.setBounds(340, 200, 120, 50);
		
		frame.add(plateLbl);
		frame.add(plateTxt);
		frame.add(vehicleLbl);
		frame.add(btn1);
		frame.add(btn2);
		frame.add(btn3);
	
		btn1.addActionListener(this);
		btn2.addActionListener(this);
		btn3.addActionListener(this);
	}
	
	public void actionPerformed(ActionEvent e) {
		Object obj = e.getSource();
		
		if(obj == btn1) {
			frame.dispose();
			new StaffPark();
			String pn = plateTxt.getText();
			String c = "Car";
			Vehicle v = new Vehicle(pn, c);
		}
		else if(obj == btn2) {
			frame.dispose();
			new MotorPark();
			String pn = plateTxt.getText();
			String m = "Motorcycle";
			Vehicle v = new Vehicle(pn, m);
		}
		else if(obj == btn3) {
			JOptionPane.showMessageDialog(btn3, "Registration invalid!");
		}
	}
}