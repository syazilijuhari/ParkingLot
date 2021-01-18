import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.util.*;

public class Appt extends JFrame implements ActionListener {
	private JFrame frm = new JFrame("UKM PARKING LOT MANAGEMENT SYSTEM");
	private JLabel apptLbl;
	private JButton btn1, btn2;
	
	public Appt() {
		frm.setSize(500,400);
		frm.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frm.setVisible(true);
		frm.setLayout(null);
		frm.setLocationRelativeTo(null);
		
		apptLbl = new JLabel("Choose Appointment");
		apptLbl.setBounds(180, 50, 300, 50);
		frm.add(apptLbl);
		
		btn1 = new JButton("APPOINT TO MANAGEMENT");
		btn1.setBackground(Color.ORANGE);
		btn1.setBounds(110, 100, 250, 60);
		frm.add(btn1);
		btn2 = new JButton("APPOINT TO STAFF");
		btn2.setBackground(Color.ORANGE);
		btn2.setBounds(110, 200, 250, 60);
		frm.add(btn2);
		
		btn1.addActionListener(this);
		btn2.addActionListener(this);
	}
	
	public void actionPerformed(ActionEvent e) {
		Object obj = e.getSource();
		
		if(obj == btn1) {
			frm.dispose();
			new ApptManager();
		}
		else if(obj == btn2) {
			frm.dispose();
			new ApptStaff();
		}
	}
}	