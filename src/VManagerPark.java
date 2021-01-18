import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.util.*;

public class VManagerPark extends JFrame implements ActionListener {
	private JFrame fv = new JFrame("UKM PARKING LOT MANAGEMENT SYSTEM");
	private JFrame fl = new JFrame("VIEW DATA");
	private DefaultListModel mod = new DefaultListModel();
	private JList<String> list = new JList<String>(mod);
	private JLabel parkLbl, mngLbl;
	private JButton btn1, btn2, btn3, btn4;

	public VManagerPark() {
		fv.setSize(500,400);
		fv.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		fv.setVisible(true);
		fv.setLayout(null);
		fv.setLocationRelativeTo(null);
		
		parkLbl = new JLabel("MANAGEMENT PARKING LOT");
		parkLbl.setBounds(170, 30, 300, 50);
		fv.add(parkLbl);
		mngLbl = new JLabel("Management");
		mngLbl.setBounds(205, 100, 100, 30);
		fv.add(mngLbl);
		
		btn1 = new JButton("C1");
		btn1.setBackground(Color.BLUE);
		btn1.setBounds(190, 150, 100, 30);
		fv.add(btn1);
		btn2 = new JButton("C2");
		btn2.setBackground(Color.BLUE);
		btn2.setBounds(190, 200, 100, 30);
		fv.add(btn2);
		btn3 = new JButton("C3");
		btn3.setBackground(Color.BLUE);
		btn3.setBounds(190, 250, 100, 30);
		fv.add(btn3);
		btn4 = new JButton("C4");
		btn4.setBackground(Color.BLUE);
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
				File fileIn = new File("Parking/C1lot.txt");
		
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
				File fileIn = new File("Parking/C2lot.txt");
		
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
				File fileIn = new File("Parking/C3lot.txt");
		
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
				File fileIn = new File("Parking/C4lot.txt");
		
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