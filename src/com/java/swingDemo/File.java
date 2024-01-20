package com.java.swingDemo;

import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class File {

	public File() {
		
		JFrame frame = new JFrame("File");
		
		JMenuBar menuBar = new JMenuBar();
		JMenu menu = new JMenu("File");
		JMenuItem menuItem = new JMenuItem("open");
		JMenuItem menuItem2 = new JMenuItem("save");
		
		menu.add(menuItem);
		menu.add(menuItem2);
		
		menuBar.add(menu);
		
		
		
		frame.add(menuBar);
//		frame.add(menu);
//		frame.add(menuItem);
//		frame.add(menuItem2);

		frame.setLayout(new FlowLayout());
		frame.setVisible(true);
		frame.setSize(300, 400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		new File();
	}

}