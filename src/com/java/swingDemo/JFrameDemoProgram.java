package com.java.swingDemo;

import java.awt.FlowLayout;
import java.awt.Image;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class JFrameDemoProgram {

	public JFrameDemoProgram() {

		JFrame frame = new JFrame("Demo program for JFrame");

		JLabel l = new JLabel("Enter Your E-Mail:");
		JTextField tf = new JTextField(30);
		JButton b = new JButton("OK");

		// ADDING MENU
		JMenuBar menuBar = new JMenuBar();
		JMenu menuFile = new JMenu("File");
		JMenuItem menuItemExit = new JMenuItem("Exit");

		menuFile.add(menuItemExit);
		menuBar.add(menuFile);

		// adds menu bar to the frame
		frame.setJMenuBar(menuBar);

		// FOR TITLE ICON

		Image icon = new ImageIcon("images\\android.png").getImage();
		frame.setIconImage(icon);

//		// adds window event listener
//		frame.addWindowListener(new WindowAdapter() {
//			public void windowClosing(WindowEvent event) {
//				int reply = JOptionPane.showConfirmDialog(JFrameDemoProgram.this, "Are you sure you want to quit?",
//						"Exit", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
//				if (reply == JOptionPane.YES_OPTION) {
//					dispose();
//				} else {
//					return;
//				}
//			}
//		});

		// Component Addition
		frame.add(l);
		frame.add(tf);
		frame.add(b);

		frame.setBounds(400, 200, 450, 300);
		frame.setLayout(new FlowLayout());
//		frame.pack();
		frame.setVisible(true);
//		frame.setSize(300, 400);

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		frame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		;

	}

	public static void main(String[] args) {
		new JFrameDemoProgram();
	}

}