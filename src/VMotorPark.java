import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.util.*;

public class VMotorPark extends JFrame implements ActionListener {
	private JFrame fv = new JFrame("UKM PARKING LOT MANAGEMENT SYSTEM");
	private JFrame fl = new JFrame("VIEW DATA");
	private DefaultListModel mod = new DefaultListModel();
	private JList<String> list = new JList<String>(mod);
	private JLabel parkLbl, motorLbl;
	private JButton btn1, btn2, btn3, btn4;

	
	public VMotorPark() {
		fv.setSize(500,400);
		fv.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		fv.setVisible(true);
		fv.setLayout(null);
		fv.setLocationRelativeTo(null);
		
		parkLbl = new JLabel("MOTORCYCLE PARKING LOT");
		parkLbl.setBounds(160, 30, 300, 50);
		fv.add(parkLbl);
		motorLbl = new JLabel("Motorcycle");
		motorLbl.setBounds(210, 100, 100, 30);
		fv.add(motorLbl);
		
		btn1 = new JButton("D1");
		btn1.setBackground(Color.LIGHT_GRAY);
		btn1.setBounds(190, 150, 100, 30);
		fv.add(btn1);
		btn2 = new JButton("D2");
		btn2.setBackground(Color.LIGHT_GRAY);
		btn2.setBounds(190, 200, 100, 30);
		fv.add(btn2);
		btn3 = new JButton("D3");
		btn3.setBackground(Color.LIGHT_GRAY);
		btn3.setBounds(190, 250, 100, 30);
		fv.add(btn3);
		btn4 = new JButton("D4");
		btn4.setBackground(Color.LIGHT_GRAY);
		btn4.setBounds(190, 300, 100, 30);
		fv.add(btn4);
		
		btn1.addActionListener(this);
		btn2.addActionListener(this);
		btn3.addActionListener(this);
		btn4.addActionListener(this);
	}
	
	public void actionPerformed(ActionEvent e) {
		Object obj = e.getSource();
		
		if(obj == btn1) {
			try {
				File fileIn = new File("Parking/D1lot.txt");
		
				if(fileIn.exists()) {
					Scanner sc = new Scanner(fileIn);
					
					while(sc.hasNext()) {
						String data = sc.nextLine();
						mod.addElement(data);
					}
					sc.close();
					list.setModel(mod);
					fl.add(list);
					fl.repaint();
					fl.setVisible(true);
					fl.setSize(300,200);
					fl.setLocationRelativeTo(null);
				}
				else {
					JOptionPane.showMessageDialog(fv, "Data not found");
				}
			}
			catch(IOException io) {
				System.out.println("ERROR");
			}
			fv.dispose();
		}
		else if(obj == btn2) {
			try {
				File fileIn = new File("Parking/D2lot.txt");
		
				if(fileIn.exists()) {
					Scanner sc = new Scanner(fileIn);
					
					while(sc.hasNext()) {
						String data = sc.nextLine();
						mod.addElement(data);
					}
					sc.close();
					list.setModel(mod);
					fl.add(list);
					fl.repaint();
					fl.setVisible(true);
					fl.setSize(300,200);
					fl.setLocationRelativeTo(null);
				}
				else {
					JOptionPane.showMessageDialog(fv, "Data not found");
				}
			}
			catch(IOException io) {
				System.out.println("ERROR");
			}
			fv.dispose();
		}
		else if(obj == btn3) {
			try {
				File fileIn = new File("Parking/D3lot.txt");
		
				if(fileIn.exists()) {
					Scanner sc = new Scanner(fileIn);
					
					while(sc.hasNext()) {
						String data = sc.nextLine();
						mod.addElement(data);
					}
					sc.close();
					list.setModel(mod);
					fl.add(list);
					fl.repaint();
					fl.setVisible(true);
					fl.setSize(300,200);
					fl.setLocationRelativeTo(null);
				}
				else {
					JOptionPane.showMessageDialog(fv, "Data not found");
				}
			}
			catch(IOException io) {
				System.out.println("ERROR");
			}
			fv.dispose();
		}
		else if(obj == btn4) {
			try {
				File fileIn = new File("Parking/D4lot.txt");
		
				if(fileIn.exists()) {
					Scanner sc = new Scanner(fileIn);
					
					while(sc.hasNext()) {
						String data = sc.nextLine();
						mod.addElement(data);
					}
					sc.close();
					list.setModel(mod);
					fl.add(list);
					fl.repaint();
					fl.setVisible(true);
					fl.setSize(300,200);
					fl.setLocationRelativeTo(null);
				}
				else {
					JOptionPane.showMessageDialog(fv, "Data not found");
				}
			}
			catch(IOException io) {
				System.out.println("ERROR");
			}
			fv.dispose();
		}
	}
}