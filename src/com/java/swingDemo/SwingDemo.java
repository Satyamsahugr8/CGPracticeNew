package com.java.swingDemo;

import java.awt.*;
import javax.swing.*;

class MyFrame extends JFrame {
	
	JLabel l1,l2,l3,l4,l5,l6,l7;
	JTextField tf;
	JPasswordField pf;
	JCheckBox cb1,cb2,cb3;
	JRadioButton rb1,rb2;
	JList l;
	JComboBox cb;
	JTextArea ta;
	JButton b;
	Container c;
	
	MyFrame() {
		this.setLocation(200,100);
		this.setSize(490,500);
		this.setVisible(true);
		
		this.setTitle("SWING GUI COMPONENTS EXAMPLE");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		c = this.getContentPane();
		c.setLayout(new FlowLayout());
//		c.setBackground(Color.green);
		l1 = new JLabel("User Name");
		l2 = new JLabel("password");
		l3 = new JLabel("Qualification");
		l4 = new JLabel("User Gender");
		l5 = new JLabel("Technologies");
		l6 = new JLabel("UserAddress");
		l7 = new JLabel("comments");
		tf = new JTextField(15);
		tf.setToolTipText("TextField");
		pf = new JPasswordField(15);
		pf.setToolTipText("PasswordField");
		cb1 = new JCheckBox("BSC",false);
		cb2 = new JCheckBox("MCA",false);
		cb3 = new JCheckBox("PHD",false);
		rb1 = new JRadioButton("Male",false);
		rb2 = new JRadioButton("Female",false);
		ButtonGroup bg = new ButtonGroup();
		bg.add(rb1);
		bg.add(rb2);
		String[]listitems = {"cpp","c","java"};
		l = new JList(listitems);
		String[]cbitems = {"hyd","pune","bangalore"};
		cb = new JComboBox(cbitems);
		ta = new JTextArea(5,20);
		b = new JButton("submit");	
		
		c.add(l1); c.add(tf); c.add(l2); c.add(pf);
		c.add(l3); c.add(cb1); c.add(cb2); c.add(cb3);
		c.add(l4); c.add(rb1); c.add(rb2); c.add(l5);
		c.add(l); c.add(l6); c.add(cb); c.add(l7);
		c.add(ta); c.add(b);
		
	}
}

public class SwingDemo { 
	public static void main(String[] args) { 
		MyFrame f = new MyFrame();
		}
}
