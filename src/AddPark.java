import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.util.*;

public class AddPark extends JFrame implements ActionListener {
	private JFrame frame = new JFrame("UKM PARKING LOT MANAGEMENT SYSTEM");
	private JLabel idLbl, catLbl;
	private JTextField idTxt;
	private JButton btn1, btn2, btn3;
	
	public AddPark() {
		frame.setSize(500,400);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.setVisible(true);
		frame.setLayout(null);
		frame.setLocationRelativeTo(null);
		
		idLbl = new JLabel("Enter UKMPer/Matric No");
		idLbl.setBounds(170, 50, 300, 50);
		catLbl = new JLabel("Choose category");
		catLbl.setBounds(190, 150, 300, 50);
		idTxt = new JTextField();
		idTxt.setBounds(100, 100, 300, 30);
		
		btn1 = new JButton("Student");
		btn1.setBounds(20, 200, 120, 50);
		btn2 = new JButton("Staff");
		btn2.setBounds(180, 200, 120, 50);
		btn3 = new JButton("Management");
		btn3.setBounds(340, 200, 120, 50);
		
		frame.add(idLbl);
		frame.add(idTxt);
		frame.add(catLbl);
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
			new StudentVehicle();
			String id = idTxt.getText();
			String cat = "Student";
			Person p = new Person(id, cat);
		}
		else if(obj == btn2) {
			frame.dispose();
			new StaffVehicle();
			String id = idTxt.getText();
			String cat = "Staff";
			Person p = new Person(id, cat);
		}
		else if(obj == btn3) {
			frame.dispose();
			new ManagerVehicle();
			String id = idTxt.getText();
			String cat = "Management";
			Person p = new Person(id, cat);
		}
	}
}