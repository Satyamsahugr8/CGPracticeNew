package com.java.swingDemo;

import java.awt.FlowLayout;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JColorChooser;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JRadioButton;
import javax.swing.JTable;
import javax.swing.JTextArea;

public class Swing1 {

	Swing1() {
		
		// JButton, JRadioButton, JTextArea
		
		JFrame frame = new JFrame("Demo");  // JFrame("Title");
		
		JButton b1 = new JButton("Click Me"); // JButton("Button name")
		b1.setBounds(100, 100, 30, 40);
		
		JRadioButton rb1 = new JRadioButton("RB1");
		JRadioButton rb2 = new JRadioButton("RB2");
		ButtonGroup b2 = new ButtonGroup();
		
		b2.add(rb1);
		b2.add(rb2);
		
		JTextArea ta1 = new JTextArea(10, 20);
		
		// JComboBox(), JTablebox(), JColorChooser() 
		
		String[] strArr = {"Java", "DBMS", "Testing"};
		JComboBox cb = new JComboBox(strArr);
		
		String [][] rowdata = {{"1", "Satyam", "9407544405"},{"2", "Satyan", "9407544406"}};
		String [] col = {"ID", "NAME", "Mobile"}; 
		JTable tb = new JTable(rowdata, col);
		
		JColorChooser cc = new JColorChooser();
		
		
		
		
		
		// Adding into Frame
		frame.add(b1);
		frame.add(rb1);
		frame.add(rb2);
		frame.add(ta1);
		frame.add(cb);
		frame.add(tb);
		frame.add(cc);
		
		
		frame.setLayout(new FlowLayout());
		frame.setVisible(true);
		frame.setSize(300, 400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		new Swing1();
	}
}