package com.java.swingDemo;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class FirstGULIFromTelusko {
	
	JFrame frame;
	JButton button;
	JLabel label;
	
	public FirstGULIFromTelusko() {
		
		frame = new JFrame();
		
		label = new JLabel("Hello world");
		button = new JButton("Click me");
		button.addActionListener(e -> {
			System.out.println("You have clicked on button");
		});
		
		frame.add(label);
		frame.add(button);
		
		// general code needed
		frame.setLayout(new FlowLayout());
		frame.setVisible(true);
		frame.setSize(300, 400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		new FirstGULIFromTelusko();
		
	}
}
